package com.mitrais;

import java.util.Arrays;
import java.util.Date;

import com.mitrais.entity.Address;
import com.mitrais.entity.Employee;
import com.mitrais.entity.Period;
import com.mitrais.entity.GradeHistory;
import com.mitrais.entity.InternalProject;
import com.mitrais.entity.JobGrade;
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

		persistEmployee.setName("michael langdon")
			.setMaritalStatus("married");
		employeeManager.update(
			persistEmployee
		);

		GradeHistory grade = new GradeHistory();
		grade.setStartDate(new Date(System.currentTimeMillis()))
			.setEndDate(new Date(System.currentTimeMillis()))
			.setJobGrade(JobGrade.SE_PG);
		employee.getGrades().add(grade);
		GradeHistory grade2 = new GradeHistory();
		grade2.setStartDate(new Date(System.currentTimeMillis()))
			.setEndDate(new Date(System.currentTimeMillis()))
			.setJobGrade(JobGrade.SQ_ST);
		employee.getGrades().add(grade2);
		employeeManager.update(employee);

		Employee myEmp = new Employee();
		myEmp.setName("michael jacob")
			.setGender("male")
			.setDateOfBirth(new Date(
				System.currentTimeMillis())
			)
			.setEmail("michael@mitrais.com")
			.setPhone("0856123456");

		InternalProject projects[] = {new InternalProject(),
			new InternalProject(), new InternalProject()};
		projects[0].setStartDate(new Date())
			.setEndDate(new Date())
			.setProjectName("AsteRx")
			.setProductName("Medirecords");
		projects[1].setStartDate(new Date())
			.setEndDate(new Date())
			.setProjectName("TechOne")
			.setProductName("E-Gov");
		projects[2].setStartDate(new Date())
			.setEndDate(new Date())
			.setProjectName("CDC-Bootcamp")
			.setProductName("JPA-Internal-Training");
		myEmp.getProjects().addAll(Arrays.asList(projects));
		employeeManager.create(myEmp);

		employeeManager.delete(persistEmployee);

		employeeManager.close();
		EntityManagerUtil.close();
	}
}