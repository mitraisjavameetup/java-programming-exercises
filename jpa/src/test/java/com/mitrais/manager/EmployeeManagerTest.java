package com.mitrais.manager;

import com.mitrais.entity.Address;
import com.mitrais.entity.Employee;
import com.mitrais.entity.GradeHistory;
import com.mitrais.entity.InternalProject;
import com.mitrais.entity.JobGrade;
import com.mitrais.manager.EmployeeManager;
import com.mysql.jdbc.Driver;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Properties;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import static org.junit.Assert.assertThat;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.notNullValue;

public class EmployeeManagerTest
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
			in = EmployeeManagerTest.class
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
				.getConnection( jdbc_url, 
					props
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

			stmt.addBatch(
				" DELETE FROM t_employee_project "
			);
			stmt.addBatch(
				" DELETE FROM t_internal_project "
			);
			stmt.addBatch( 
				" DELETE FROM t_grade_history "
			);
			stmt.addBatch(
				" DELETE FROM t_employee "
			);
			stmt.addBatch( 
				" DELETE FROM t_address " 
			);

			stmt.executeBatch();
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
	public void testCreateEmployee()
	{
		Employee employee = new Employee();
		employee.setName("anggie sondakh")
			.setGender("female")
			.setMaritalStatus("single")
			.setPhone("+628123456")
			.setEmail("anggie.sondakh@mitrais.com");
		try {
			employee.setDateOfBirth(formatter.parse("1989-10-01"))
				.setHireDate(formatter.parse("2017-01-02"));
		} catch( ParseException ex ) {
			System.err.println( ex.toString() );
		}

		EmployeeManager.getInstance()
			.create(employee);

		// assert by object
		assertThat("employee id should not be null",
			employee.getId(),
			is(notNullValue()));

		// assertation with jdbc query 
		Statement stmt = null;
		int rowCount = 0;
		try {
			stmt = conn.createStatement();
			String query = " SELECT COUNT(*) AS cnt "
						 + " FROM t_employee "
						 + " WHERE name LIKE 'anggie sondakh' "
						 + "   AND email LIKE 'anggie.sondakh@mitrais.com' "
						 + "   AND phone LIKE '+628123456' ";
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

	@Test
	public void testReadEmployee()
	{
		Employee employee = EmployeeManager
			.getInstance()
			.read(99);

		// assertion
		assertThat("employee name should be Donald Trump",
			employee.getName(),
			is(equalTo("Donald Trump")));
		assertThat("employee gender should be male",
			employee.getGender(),
			is(equalTo("male")));
		assertThat("employee marital status should be married",
			employee.getMaritalStatus(),
			is(equalTo("married")));
		assertThat("employee phone should be +18123456",
			employee.getPhone(),
			is(equalTo("+18123456")));
		assertThat("employee email should be donald.trump@mitrais.com",
			employee.getEmail(),
			is(equalTo("donald.trump@mitrais.com")));
	}

	@Test
	public void testUpdateEmployee()
	{
		Employee employee = EmployeeManager
			.getInstance()
			.read(99);
		employee.setPhone("+628123456");
		try {
			employee.setHireDate(
				formatter.parse("2016-01-04"));
		} catch( ParseException ex ) {
			System.err.println( ex.toString() );
		}

		EmployeeManager.getInstance()
			.update(employee);

		// assertion by jdbc
		Statement stmt = null;
		int rowCount = 0;
		try {
			stmt = conn.createStatement();
			String query = " SELECT COUNT(*) AS cnt "
						 + " FROM t_employee "
						 + " WHERE id = 99 "
						 + "   AND name LIKE 'Donald Trump' "
						 + "   AND phone LIKE '+628123456' ";
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				rowCount = rs.getInt("cnt");
			}
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
		assertThat("row count should be larger than 0",
			(rowCount > 0),
			is(equalTo(true)));
	}

	@Test
	public void testDeleteEmployee()
	{
		Employee employee = EmployeeManager.getInstance()
			.read(99);
		EmployeeManager.getInstance()
			.delete(employee);

		// assertion by jdbc
		Statement stmt = null;
		int rowCount = -1;
		try {
			stmt = conn.createStatement();
			String query = " SELECT COUNT(*) AS cnt "
						 + " FROM t_employee "
						 + " WHERE id = 99 ";
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
				} catch( SQLException ex ) {

				}
			}
		}
		assertThat("rowCount should be equal to 0",
			(rowCount == 0),
			is(equalTo(true)));
	}


	/**
	 *  it will create employee with address.
	 *  check the result rest with jdbc query
	 *  Employee entity are dependant to Address entity
	 *  Employee will have address_id as foreign key, which
	 *  refer to t_address(id)
	 *  the association address_id is optional, or in other
	 *  word address_id is nullable
	 **/
	@Test
	public void testOneToOneAddress()
	{
		Employee employee = new Employee();
		employee.setName("anggie sondakh")
			.setGender("female")
			.setMaritalStatus("single")
			.setPhone("+628123456")
			.setEmail("anggie.sondakh@mitrais.com");
		try {
			employee.setDateOfBirth(formatter.parse("1989-10-01"))
				.setHireDate(formatter.parse("2017-01-02"));
		} catch( ParseException ex ) {
			System.err.println( ex.toString() );
		}
		Address address = new Address();
		address.setCity("Bandung")
			.setAddress("Jln. Surya Sumantri")
			.setPostalCode("40161");
		employee.setAddress(address);
		// persist it to storage	
		EmployeeManager.getInstance()
			.create(employee);

		// assertion
		assertThat("Employee ID should not be null",
			employee.getId(),
			is(notNullValue())
		);
		assertThat("Address ID should not be null",
			employee.getAddress().getId(),
			is(notNullValue())
		);
		// jdbc assertion 
		Statement stmt = null;
		int rowCount = 0;
		try {
			stmt = conn.createStatement();
			String query = " SELECT COUNT(*) AS cnt "
						 + " FROM t_employee A "
						 + " INNER JOIN t_address B "
						 + " ON A.address_id = B.id "
						 + " WHERE A.name LIKE 'anggie sondakh' "
						 + "   AND A.email LIKE 'anggie.sondakh@mitrais.com' "
						 + "   AND A.phone LIKE '+628123456' ";
			ResultSet rs = stmt.executeQuery( query );
			while (rs.next()) {
				rowCount = rs.getInt( "cnt" );
			}
		} catch( SQLException ex ) {
			System.err.println( ex.toString() );
		} finally {
			if (stmt != null) {
				try {
					stmt.close();
				} catch( SQLException ex ) {}
			}
		}
		assertThat("rowCount should not be 0",
			(rowCount > 0),
			is(equalTo(true))
		);
	}


	/**
	 *  it will create employee with address
	 *  and grades.
	 *  the grades entities will be mapped in t_grade_history
	 *  Grade entity has employeeId which refer to Employee entity
	 *  the db will be checked with jdbc query
	 **/
	@Test
	public void testOneToManyGrades()
	{
		Employee employee = new Employee();
		employee.setName("anggie sondakh")
			.setGender("female")
			.setMaritalStatus("single")
			.setPhone("+628123456")
			.setEmail("anggie.sondakh@mitrais.com");
		try {
			employee.setDateOfBirth(formatter.parse("1989-10-01"))
				.setHireDate(formatter.parse("2017-01-02"));
		} catch( ParseException ex ) {
			System.err.println( ex.toString() );
		}
		Address address = new Address();
		address.setCity("Bandung")
			.setAddress("Jln. Surya Sumantri")
			.setPostalCode("40161");
		employee.setAddress(address);
		GradeHistory grades[] = {
			new GradeHistory(), new GradeHistory(),
			new GradeHistory(), new GradeHistory()
		};
		try {
			grades[0].setStartDate(formatter.parse("2010-01-02"))
				.setEndDate(formatter.parse("2010-12-24"))
				.setJobGrade(JobGrade.SE_JP);
			grades[1].setStartDate(formatter.parse("2011-01-02"))
				.setEndDate(formatter.parse("2011-12-24"))
				.setJobGrade(JobGrade.SE_PG);
			grades[2].setStartDate(formatter.parse("2012-01-02"))
				.setEndDate(formatter.parse("2012-12-24"))
				.setJobGrade(JobGrade.SE_AP);
			grades[3].setStartDate(formatter.parse("2013-01-02"))
				.setEndDate(formatter.parse("2013-12-24"))
				.setJobGrade(JobGrade.SE_AN);
		} catch( ParseException ex ) {}
		employee.setGrades(Arrays.asList(grades));
		// persist it to storage	
		EmployeeManager.getInstance()
			.create(employee);
		// assertion
		for (GradeHistory grade : employee.getGrades()) {
			assertThat("grade id should not be null",
				grade.getId(),
				is(notNullValue())
			);
		}
		// jdbc query assertion
		Statement stmt = null;
		int rowCount = 0;
		try {
			stmt = conn.createStatement();
			String query = " SELECT COUNT(*) AS cnt "
						 + " FROM t_employee A "
						 + " INNER JOIN t_grade_history B "
						 + "  ON B.employee_id = A.id "
						 + " WHERE A.name LIKE 'anggie sondakh' "
						 + "   AND A.email LIKE 'anggie.sondakh@mitrais.com' "
						 + "   AND A.phone LIKE '+628123456' ";
			ResultSet rs = stmt.executeQuery( query );
			while (rs.next()) {
				rowCount = rs.getInt( "cnt" );
			}
		} catch( SQLException ex ) {
			System.err.println( ex.toString() );
		} finally {
			if (stmt != null) {
				try {
					stmt.close();
				} catch( SQLException ex ) { }
			}
		}
		assertThat("Row count should larger than 3",
			(rowCount > 3),
			is(equalTo(true))
		);
	}

	/**
	 *  create two employees and assign them to several projects
	 **/
	@Test
	public void testManyToManyProjects()
	{
		Employee employees[] = {new Employee(), new Employee()};
		InternalProject projects[] = {new InternalProject(),
			new InternalProject(), new InternalProject()};

		try {
			projects[0].setStartDate(formatter.parse("2017-01-04"))
				.setEndDate(formatter.parse("2017-12-24"))
				.setProjectName("AsteRx")
				.setProductName("Medirecords");
			projects[1].setStartDate(formatter.parse("2017-01-04"))
				.setEndDate(formatter.parse("2017-12-24"))
				.setProjectName("TechOne")
				.setProductName("E-Gov");
			projects[2].setStartDate(formatter.parse("2017-01-04"))
				.setEndDate(formatter.parse("2017-12-24"))
				.setProjectName("CDC-Bootcamp")
				.setProductName("JPA-Internal-Training");
		} catch( ParseException ex ) {
			System.err.println( ex.toString() );
		}

		employees[0] = EmployeeManager.getInstance()
			.read(99L);
		employees[0].getProjects().add(	projects[0] );
		employees[0].getProjects().add( projects[1] );
		try {
			employees[1].setName("anggie sondakh")
				.setGender("female")
				.setMaritalStatus("single")
				.setPhone("+628123456")
				.setEmail("anggie.sondakh@mitrais.com")
				.setDateOfBirth(formatter.parse("1991-10-01"))
				.setHireDate(formatter.parse("2017-01-04"));
			employees[1].getProjects().add(	projects[1] );
			employees[1].getProjects().add( projects[2] );
		} catch( ParseException ex ) {
			System.err.println( ex.toString() );
		}
		for (Employee employee : employees) {
			EmployeeManager.getInstance()
				.update(employee);
		}
		// assertion
		for (InternalProject project : projects) {
			assertThat("Project ID should not be null",
				project.getId(),
				is(notNullValue())
			);
		}
		// jdbc query assertion
		Statement stmt = null;
		int rowCount = 0;
		try {
			stmt = conn.createStatement();
			String query = " SELECT COUNT(*) AS cnt "
						 + " FROM t_employee A "
						 + " INNER JOIN t_employee_project B "
						 + "   ON A.id = B.employee_id "
						 + " INNER JOIN t_internal_project C "
						 + "   ON B.internal_project_id = C.id "
						 + " WHERE A.name LIKE 'anggie sondakh' "
						 + "   AND A.email LIKE 'anggie.sondakh@mitrais.com' "
						 + "   AND A.phone LIKE '+628123456' ";
			ResultSet rs = stmt.executeQuery( query );
			while (rs.next()) {
				rowCount = rs.getInt( "cnt" );
			}
		} catch( SQLException ex ) {
			System.err.println( ex.toString() );
		}
		assertThat("rowCount should be larger than 0",
			(rowCount > 0),
			is(equalTo(true))
		);
	}
}