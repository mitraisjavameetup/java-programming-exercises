package com.mitrais.cdc.java;

/**
 * @author Agus Mistiawan
 */

import java.util.ArrayList;
import java.util.LinkedList;
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
	 * Will return time execute/access
	 * @param label name of list
	 * @param list type of list
	 * @return time access
	 */
	  public  double timeAccess(String label,
	                                List<String> list) {
		  double first = System.nanoTime();
		  list.remove(5000);
		  double second = System.nanoTime();
		  return second-first;
	
	  }
	  
	  public static void main(String[] args) {
		List<String> firstList = new ArrayList<>();
		List<String> secondList = new LinkedList<>();
		
		for(int i=0; i<1000000; i++){
			firstList.add("index " + i);
			secondList.add("index " + i);
		}
		ListPerformance ferporm = new ListPerformance();
		System.out.println("ArrayList delete time : "+ferporm.timeAccess("Array List", firstList));
		System.out.println("LinkedList delete time : "+ferporm.timeAccess("Linked List", secondList));
	}
}
