package com.mitrais.manager;

import com.mitrais.entity.Employee;
import com.mitrais.entity.EmploymentHistory;
import com.mitrais.entity.Period;
import com.mitrais.entity.ProjectId;
import org.junit.*;

import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Properties;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;

public class EmployeeManagerTestForQuery
{
	private static Connection conn = null;
	private static final String
			CONNECTION_CONFIG = "connection.config";
	private static final SimpleDateFormat formatter =
			new SimpleDateFormat("yyyy-MM-dd");

	@BeforeClass
	public static void setUp()
	{
		Properties props = new Properties();
		InputStream in = null;

		try {
			in = EmployeeManagerTestForQuery.class
					.getClassLoader()
					.getResourceAsStream(
							CONNECTION_CONFIG
					);

			props.load( in );

			// assert props.getProperty("er") != null :
			// 	props.getProperty("db_user");
		} catch( IOException ex ) {
			System.err.println( ex.toString() );
		} finally {
			if ( in != null ) {
				try {
					in.close();
				} catch( IOException e ) {}
			}
		}
		assert props.getProperty("jdbc_url") != null
				: props;
		assert props.getProperty("user") != null
				: props;
		assert props.getProperty("password") != null
				: props;

		// setup jdbc connection
		String jdbc_url = props
				.getProperty( "jdbc_url" );

		try {
			conn = DriverManager
					.getConnection( jdbc_url
					);
		} catch( SQLException ex ) {
			System.err.println( ex.toString() );
			conn = null;
		}

		assert conn != null : conn;
	}

	@AfterClass
	public static void tearDown()
	{
		// close jdbc connection
		if (conn != null) {
			try {
				conn.close();
			} catch( SQLException ex ) {

			} finally {
				conn = null;
			}
		}
	}

	@Before
	public void setUpTest()
	{
		// TODO neccessary cleanup?
		// insert initial data
		Statement stmt = null;
		try {
			stmt = conn.createStatement();

			String query = " INSERT INTO t_employee "
					+ "   (id, name, date_of_birth, "
					+ "    gender, marital_status, "
					+ "	phone, email, hire_date, office_location) "
					+ " VALUES "
					+ "   ( 1, 'Donald Trump', '1946-06-14', "
					+ "	'male', 'married', '+18123456', "
					+ " 	'donald.trump@mitrais.com', "
					+ "	'2017-01-02', 'Bandung') ";

			int result = stmt.executeUpdate( query );
			assert result == 1 : result;

			query = " INSERT INTO t_employee "
					+ "   (id, name, date_of_birth, "
					+ "    gender, marital_status, "
					+ "	phone, email, hire_date, office_location) "
					+ " VALUES "
					+ "   ( 2, 'anggie sondakh', '1989-10-01', "
					+ "	'female', 'single', '+628123456', "
					+ " 	'anggie.sondakh@mitrais.com', "
					+ "	'2017-01-02', 'Jakarta') ";

			result = stmt.executeUpdate( query );
			assert result == 1 : result;

			query = " INSERT INTO t_employee "
					+ "   (id, name, date_of_birth, "
					+ "    gender, marital_status, "
					+ "	phone, email, hire_date, office_location) "
					+ " VALUES "
					+ "   ( 3, 'michael jacob', '1989-10-01', "
					+ "	'male', 'single', '+628123456', "
					+ " 	'michael.jacob@mitrais.com', "
					+ "	'2017-01-02', 'Bandung') ";

			result = stmt.executeUpdate( query );
			assert result == 1 : result;

			query = " INSERT INTO t_employment_history "
					+ "   (project_name, role, job_description, emp_id) "
					+ " VALUES "
					+ "   ( 'EXO PLATFORM', 'Java Developer', 'Development of EXO Platform, Maintanance of EXO Platform', 1) ";

			result = stmt.executeUpdate( query );
			assert result == 1 : result;

			query = " INSERT INTO t_employment_history "
					+ "   (project_name, role, job_description, emp_id) "
					+ " VALUES "
					+ "   ( 'VIET SOFTWARE INTERNATIONAL', 'Java Developer', 'Development of VIET SOFTWARE INTERNATIONAL, Maintanance of VIET SOFTWARE INTERNATIONAL', 2) ";

			result = stmt.executeUpdate( query );
			assert result == 1 : result;

			query = " INSERT INTO t_employment_history "
					+ "   (project_name, role, job_description, emp_id) "
					+ " VALUES "
					+ "   ( 'EXO PLATFORM', 'Web Designer', 'Design Layout for EXO PLATFORM', 3) ";

			result = stmt.executeUpdate( query );
			assert result == 1 : result;


		} catch( SQLException ex ) {
			System.err.println( ex.toString() );
		} finally {
			if ( stmt != null ) {
				try {
					stmt.close();
				} catch( SQLException ex ) {

				}
			}
		}
	}

	@After
	public void cleanUpTest()
	{
		// clean up table
		Statement stmt = null;

		try {
			stmt = conn.createStatement();

			String query = " DELETE FROM t_employee; ";

			stmt.executeUpdate( query );

			query = " DELETE FROM t_employment_history; ";

			stmt.executeUpdate( query );
		} catch( SQLException ex ) {
			System.err.println( ex.toString() );
		} finally {
			if ( stmt != null ) {
				try {
					stmt.close();
				} catch( SQLException ex ) {

				}
			}
		}
	}

	@Test
	public void testQueryOfficeLocation()
	{
		String param = "Bandung";
		List results = EmployeeManager.getInstance().getEmployeeByLocation(param);

		System.out.println(results);

		assertThat("Results length are 2",
				(results.size()),
				is(equalTo(2)));
	}

	@Test
	public void testQueryProjectName()
	{
		String param = "EXO PLATFORM";
		List results = EmployeeManager.getInstance().getEmployeeByProject(param);

		System.out.println(results);

		assertThat("Results length are 2",
				(results.size()),
				is(equalTo(2)));
	}

	@Test
	public void testQueryRemoveProject()
	{
		long param = 2;
		EmployeeManager.getInstance().removeProjectByEmployeeID(param);

		List results = EmployeeManager.getInstance().getAllEmploymentHistory();

		System.out.println(results);

		assertThat("Results length are 2",
				(results.size()),
				is(equalTo(2)));
	}

}