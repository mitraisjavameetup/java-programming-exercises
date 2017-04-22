package com.mitrais.manager;

import com.mitrais.entity.EmploymentHistory;
import com.mitrais.entity.Period;
import com.mitrais.entity.ProjectId;
import org.junit.*;

import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Properties;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;

public class EmployeeManagerTestForEmbeddedObject
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
			in = EmployeeManagerTestForEmbeddedObject.class
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
						 + "	phone, email, hire_date) "
						 + " VALUES "
						 + "   ( 99, 'Donald Trump', '1946-06-14', "
						 + "	'male', 'married', '+18123456', "
						 + " 	'donald.trump@mitrais.com', "
						 + "	'2017-01-02') ";

			int result = stmt.executeUpdate( query );
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
	public void testCreateEmploymentHistory()
	{
		java.util.Date startDate = new java.util.Date();
		java.util.Date endDate = new java.util.Date();
		try {
			startDate = formatter.parse("2013-01-01");
			endDate = formatter.parse("2014-12-31");
		} catch( ParseException ex ) {
			System.err.println( ex.toString() );
		}

		String projectName = "EXO Platform";
		String role = "Java Developer";
		long empId = 99;
		String jobDesc = "Development of EXO Platform, Maintanance of EXO Platform";

		EmploymentHistory project = new EmploymentHistory();
		project.setId(new ProjectId(projectName, role));

		Period period = new Period();
		period.setStartDate(startDate);
		period.setEndDate(endDate);

		project.setPeriod(period);
		project.setEmpId(empId);
		project.setJobDescription(jobDesc);

		EmployeeManager.getInstance()
			.createEmploymentHistory(project);

		// assert by object
		assertThat("employee id should not be null",
				project.getId(),
			is(notNullValue()));

		// assertation with jdbc query 
		Statement stmt = null;
		int rowCount = 0;
		try {
			stmt = conn.createStatement();
			String query = " SELECT COUNT(*) AS cnt "
						 + " FROM t_employment_history "
						 + " WHERE project_name LIKE '"+projectName+"'"
						 + "   AND role LIKE '"+role+"' ";
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				rowCount = rs.getInt("cnt");
			}
		} catch( SQLException ex ) {
			System.err.println( ex.toString() );
		} finally {
			if (stmt != null) {
				try {
					stmt.close();
				} catch( SQLException ex) {

				}
			}
		}
		assertThat("row count should be larger than 0",
			(rowCount > 0),
			is(equalTo(true)));
	}
}