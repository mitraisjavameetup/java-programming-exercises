package com.mitrais.cdc.java;

import java.util.HashMap;
import java.util.Map;

public class EmployeeMap {
	
	private Map<String,String> employees;
	public EmployeeMap() {
		employees=new HashMap<String,String>();
		employees.put("a1234", "Steve Jobs");
		employees.put("a1235", "Scott McNealy");
		employees.put("a1236", "Jeff Bezos");
		employees.put("a1237", "Larry Ellison");
		employees.put("a1238", "Bill Gates");
	}
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
	 * 
	 * set map of employee and access it
	 */
	public String runEmployeeMap(String key) {
	    return employees.get(key);
	}
		
}
