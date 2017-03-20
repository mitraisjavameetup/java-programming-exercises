package com.mitrais.cdc.java;

import java.util.Map;
import java.util.TreeMap;

/**
 * Mitrais Java Training List
 * NumberMap class
 * @author Relung Satria
 * @version 1.0
 *
 */

public class NumberMap {
	private Map<Integer,String> numberTable;
	  private static String[] defaultWords =
	    {"zero", "one", "two", "three", "four",
	     "five", "six", "seven", "eight", "nine",
	     "ten", "eleven", "twelve", "thirteen",
	     "fourteen", "fifteen", "sixteen",
	     "seventeen", "eighteen", "nineteen"};

	  public NumberMap() {
	    this(defaultWords);
	  }

	  public NumberMap(String[] words) {
		// To-Do set numberTable map by words arrays 
		numberTable = new TreeMap<Integer, String>();
		for(int i = 0; i < words.length; i++){
			numberTable.put(i, words[i]);
		}
	  }

	  public String wordForNumber(int num) {
		// To-Do return words by numbers assigned, set default as [unknown]
		  
	    return numberTable.getOrDefault(num, "unknown");
	  }

	  public int getSize() {
	    return(numberTable.size());
	  }
}
