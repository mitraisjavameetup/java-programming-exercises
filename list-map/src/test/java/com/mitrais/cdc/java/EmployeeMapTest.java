package com.mitrais.cdc.java;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class EmployeeMapTest {

	@Test
	public void test() {
		String[] stringArray = {"Steve Jobs", "Scott McNealy", "Jeff Bezos", "Larry Ellison","Bill Gates"};
		EmployeeMap employee = new EmployeeMap();
		String name = employee.runEmployeeMap("a1234");
		assertNotNull(name);
		assertTrue(Arrays.asList(stringArray).contains(name));
	}

}
