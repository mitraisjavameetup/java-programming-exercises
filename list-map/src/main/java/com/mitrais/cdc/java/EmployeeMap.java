package com.mitrais.cdc.java;

import java.util.HashMap;
import java.util.Map;

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
	
	public String runEmployeeMap() {
		Map<String, String> eMap = new HashMap<>();
		eMap.put("a1234", "Steve Jobs");
		eMap.put("a1235", "Scott McNealy");
		eMap.put("a1236", "Jeff Bezos");
		eMap.put("a1237", "Larry Ellison");
		eMap.put("a1238", "Bill Gates");
	    return eMap.get("A1234".toLowerCase());
	}
		
}
