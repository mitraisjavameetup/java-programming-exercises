package com.mitrais.manager;

import com.mitrais.entity.*;
import com.mitrais.util.EntityManagerUtil;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import static java.util.concurrent.TimeUnit.SECONDS;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

public class EmployeeManagerTestForEntityListener
{
	private static final SimpleDateFormat formatter =
		new SimpleDateFormat("yyyy-MM-dd");

	@Test
	public void testLastModifiedEmployee()
	{
		Employee employee = new Employee();
		employee.setName("michael jacob")
				.setGender("male")
				.setDateOfBirth(new java.util.Date(
						System.currentTimeMillis())
				)
				.setEmail("michael@mitrais.com")
				.setPhone("0856123456");

		Period period = new Period();
		period.setStartDate(new java.util.Date(
				System.currentTimeMillis()));

		Address address = new Address();
		address.setAddress("Jln. Surya Sumantri")
				.setCity("Bandung")
				.setPostalCode("40161");

		employee.setPeriod(period);

		EmployeeManager employeeManager =
				EmployeeManager.getInstance();

		employee.setAddress(address);
		employeeManager.create(employee);
		assert employee.getId() != null : employee.getId();

		Employee persistEmployee =
				employeeManager.read(employee.getId());
		assert employee != null : employee;

		assertNotNull("Last modified Not null", persistEmployee.getLastModified());

		Date lastModified1 = persistEmployee.getLastModified();
		System.out.println("Last modified 1: " + persistEmployee.getLastModified());

		try {
			SECONDS.sleep(2);
		} catch (InterruptedException ex) {
			throw new RuntimeException(ex);
		}
		persistEmployee.setName("michael langdon")
				.setMaritalStatus("married");
		employeeManager.update(
				persistEmployee
		);

		persistEmployee =
				employeeManager.read(employee.getId());
		assert employee != null : employee;

		Date lastModified2 = persistEmployee.getLastModified();
		System.out.println("Last modified 2: " + lastModified2);
		assertNotEquals(lastModified1, lastModified2);

		employeeManager.delete(persistEmployee);
	}
}