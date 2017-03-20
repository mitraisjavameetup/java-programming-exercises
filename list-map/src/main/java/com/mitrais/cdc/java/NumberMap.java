package com.mitrais.cdc.java;

import java.util.HashMap;
import java.util.Map;

/**
 * Map that associates numbers with words 
 * @author trainee
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
	  private int number = 0;
	  
	  /**
	   * NumberMap class constructor without parameter
	   */
	  public NumberMap() {
		this(defaultWords);
	  }

	  /**
	   * NumberMap class constructor with array of words parameter
	   */
	  public NumberMap(String[] words) {
		// To-Do set numberTable map by words arrays 
		numberTable = new HashMap<>();
		  
		for (String word : words) {
			numberTable.put(this.number, word);
			this.number++;
		}
	  }

	  /**
	   * Will return word by number parameter
	   */
	  public String wordForNumber(int num) {
		// To-Do return words by numbers assigned, set default as [unknown]
	    return numberTable.get(num);
	  }

	  /**
	   * Will return the size of NumberTable
	   */
	  public int getSize() {
	    return(numberTable.size());
	  }
}
