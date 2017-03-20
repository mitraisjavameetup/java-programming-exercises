package com.mitrais.cdc.java;

import java.util.List;

/**
 * Mitrais Java Training List
 * ListPerformance class
 * @author Relung Satria
 * @version 1.0
 *
 */

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

	  public static double timeAccess(String label,
	                                List<String> list) {
		  int rand = (int)(Math.random() * (list.size() * 3/4) + (list.size() * 1/4));
		  double time1, time2;
		  time1 = System.nanoTime();
		  String s = list.get(rand);
		  time2 = System.nanoTime();
		  
		  System.out.println(time2-time1);
  	    return time2-time1;
	
	  }
}
