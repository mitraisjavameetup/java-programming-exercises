package com.mitrais.entity;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.Assert.assertThat;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.equalTo;

/**
 *  Unit test for Employee entity
 **/
public class EmployeeTest
{	
	private static SimpleDateFormat formatter =
		new SimpleDateFormat("yyyy-MM-dd");
	/**
	 *   construct employee entity and set all fields
	 **/
	@Test
	public void testEmployee()
	{
		Date birthDate = new Date();
		Date hireDate = new Date();
		try {
			birthDate = formatter.parse("1989-10-01");
			hireDate = formatter.parse("2017-07-02");
		} catch( ParseException ex ) {
			System.err.println( ex.toString() );
		}
		Employee employee = new Employee();
		employee.setName("michael jacob")
			.setDateOfBirth(birthDate)
			.setGender("male")
			.setMaritalStatus("single")
			.setPhone("+628123456")
			.setEmail("michael.jacob@mitrais.com")
			.setHireDate(hireDate);
		// assertion
		assertThat(
			"Name other than 'michael jacob'",
			employee.getName(),
			is(equalTo("michael jacob"))
		);
		assertThat(
			String.format("Date of birth not equal to '%s'", birthDate.toString()),
			employee.getDateOfBirth(),
			is(equalTo(birthDate))
		);
		assertThat(
			"Gender other than 'male'",
			employee.getGender(),
			is(equalTo("male"))
		);
		assertThat(
			"Marital status other than 'single'",
			employee.getMaritalStatus(),
			is(equalTo("single"))
		);
		assertThat(
			"Phone other than '+628123456'",
			employee.getPhone(),
			is(equalTo("+628123456"))
		);
		assertThat(
			"Email other than 'michael.jacob@mitrais.com'",
			employee.getEmail(),
			is(equalTo("michael.jacob@mitrais.com"))
		);
		assertThat(
			String.format("Hire date not equal to '%s'", hireDate.toString()),
			employee.getHireDate(),
			is(equalTo(hireDate))
		);
	}
}