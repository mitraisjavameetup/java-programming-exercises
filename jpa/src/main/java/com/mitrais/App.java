package com.mitrais;

import java.util.Date;
import javax.persistence.EntityManager;

import com.mitrais.entity.Employee;
import com.mitrais.entity.Period;
import com.mitrais.manager.EmployeeManager;
import com.mitrais.util.EntityManagerUtil;

public class App {

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

		Period period = new Period();
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