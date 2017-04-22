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
	/** Calculate the time to access the middle of list*/
	  public static double timeAccess(String label,
	                                List<String> list) {
		
		double time1 = System.currentTimeMillis();
		int panjang = list.size();
		int middle = panjang / 2;
		list.get(middle);
		double time2 = System.currentTimeMillis();
		time2 = time2 - time1;
	    return time2;
	  }
}
