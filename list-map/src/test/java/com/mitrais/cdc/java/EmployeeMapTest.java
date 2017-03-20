package com.mitrais.cdc.java;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class EmployeeMapTest {

	@Test
	public void test() {
		String[] stringArray = {"Steve Jobs", "Scott McNealy", "Jeff Bezos", "Larry Ellison","Bill Gates"};
		EmployeeMap employee = new EmployeeMap();
		String name = employee.runEmployeeMap("A1234");
		System.out.println(name);
		assertNotNull(name);
		assertTrue(Arrays.asList(stringArray).contains(name));
	}

}
