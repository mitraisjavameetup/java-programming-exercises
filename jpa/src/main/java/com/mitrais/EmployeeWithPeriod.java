package com.mitrais;

import com.mitrais.entity.Employee;
import com.mitrais.entity.EmploymentPeriod;
import com.mitrais.manager.EmployeeManager;
import com.mitrais.util.EntityManagerUtil;

import java.util.Date;

public class EmployeeWithPeriod {

	public static void main(String[] args)
	{
		Employee employee = new Employee();
		employee.setName("michael jacob")
				.setGender("male")
				.setDateOfBirth(new Date(
						System.currentTimeMillis())
				)
				.setEmail("michael@mitrais.com")
				.setPhone("0856123456");

		EmploymentPeriod period = new EmploymentPeriod();
		period.setStartDate(new Date(
				System.currentTimeMillis()));

		employee.setPeriod(period);

		EmployeeManager employeeManager =
				EmployeeManager.getInstance();

		employeeManager.create(employee);

		long employeeId = employee.getId();
		System.out.println("id: " + employeeId);
		Employee persistEmployee =
				employeeManager.read(employeeId);

		persistEmployee.setName("michael langdon")
				.setMaritalStatus("married");
		employeeManager.update(
				persistEmployee
		);

		employeeManager.delete(persistEmployee);

		employeeManager.close();
		EntityManagerUtil.close();
	}
}