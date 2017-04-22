package com.mitrais.cdc.java;

import java.util.*;

public class EmployeeMap {
	
	private Map<String, String> employeeMap;
	
	/**Default Constructor**/
	public EmployeeMap()
	{
		employeeMap = new HashMap<>();
		
		employeeMap.put("a1234", "Steve Jobs");
		employeeMap.put("a1235", "Scott McNealy");
		employeeMap.put("a1236", "Jeff Bezos");
		employeeMap.put("a1237", "Larry Ellison");
		employeeMap.put("a1238", "Bill Gates");
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
	
	/**A special method to return the first employee.**/
	public String runEmployeeMap() 
	{
		return employeeMap.get("a1234");
	}
	
	/**A special method to return the employee based on the given key.**/
	public String runEmployeeMap(String key)
	{
		return employeeMap.getOrDefault(key.toLowerCase(), "Invalid Key");
	}
		
}
