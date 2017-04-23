package com.mitrais.cdc.java;

import java.util.List;

public class ListPerformance {

	/*
	 * Do some timing tests to see if you can verify the performance 
	 * claims of the lecture regarding the difference between ArrayList 
	 * and LinkedList for accessing the middle element. Hints:
	 * • Use System.currentTimeMillis or System.nanoTime to lookup the current time. 
	 * 	 Compute a delta and divide to get an elapsed time in seconds. 
	 * • To ensure meaningful results, use very long lists and access the middle element many times.
	 * • Run several tests, each with larger and larger lists.
	 */
		/**
		 * 
		 * @param label
		 * @param list
		 * to test the speed between arraylist and linkedlist
		 */
	  public static double timeAccess(String label,
	                                List<String> list) {
		  
		System.out.println(System.nanoTime());  
	    return 0.0;
	
	  }
}
