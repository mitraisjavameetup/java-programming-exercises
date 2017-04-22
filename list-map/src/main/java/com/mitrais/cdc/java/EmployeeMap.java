package com.mitrais.cdc.java;

import java.util.HashMap;
import java.util.Map;

/**
 * Map that associates employee IDs with names
 * @author trainee
 * @version 1.0
 */
public class EmployeeMap {
	
	private int numID = 1234;
	private String[] names = {"Steve Jobs", "Scott McNealy", "Jeff Bezos", "Larry Ellison","Bill Gates"};
		
	/*
	 * Make a Map that associates the following employee IDs with names. 
	 * Keys and values of Maps can be any Object type, 
	 * so in real life you would probably have the key be a String and the associated value be a Person or Employee object. 
	 * To make things simpler on this exercise, you can use String for both the ID and the name, 
	 * rather than bothering to create a Person or Employee class. 
	 * ID = a1234, Name = Steve Jobs
	 * ID = a1235, Name = Scott McNealy
	 * ID = a1236, Name = Jeff Bezos
	 * ID = a1237, Name = Larry Ellison
	 * ID = a1238, Name = Bill Gates
	 * The point here is to associate keys with values, then retrieve values later based on keys.
	 */
	
	/**
	 * Method for running Employee Map
	 * @return Employee name
	 */
	public String runEmployeeMap() {
		Map<String, String> employee = new HashMap<>();
		
		for (String name : names) {
		    employee.put("a" + this.numID, name);
		    numID++;
		}
		return employee.get("A1234".toLowerCase());
	}
		
}
