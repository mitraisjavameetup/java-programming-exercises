package com.mitrais.cdc.java;
/**
 * @author Agus Mistiawan
 */

import java.util.HashMap;

public class EmployeeMap {
	
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
	 * Will set some of value to Map
	 * @return value by key
	 */
	public String runEmployeeMap() {
		HashMap<String, String> employee = new HashMap<>();
		employee.put("a1234", "Steve Jobs");
		employee.put("a1235", "Scorr McNealy");
		employee.put("a1236", "Jeff Bezos");
		employee.put("a1237", "Larry Ellison");
		employee.put("a1238", "Bill Gates");
		System.out.println(employee);
		String key = "A1234";
	    return employee.get(key.toLowerCase());
	}
	
	public static void main(String[] args) {
		EmployeeMap employee = new EmployeeMap();
		System.out.println(employee.runEmployeeMap());
	}
		
}
