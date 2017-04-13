package com.mitrais.cdc.java;

import java.util.HashMap;
import java.util.Map;

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
	  /** Constructor of numberTable map by words arrays
		 * @param words
		 */
	  public NumberMap(String[] words) {
		 
		 numberTable = new HashMap<Integer, String>();
		 for (int i = 0; i < words.length; i++) {
			 numberTable.put(i, words[i]);
		} 
		  // To-Do set numberTable map by words arrays 
	  }
	  /** Method to return words assigned in numberTable
		 * @return num or "[unknown]"
		 */
	  public String wordForNumber(int num) {
		  if (numberTable.containsKey(num)) {
			  return numberTable.get(num);
		  }
		  else
		// To-Do return words by numbers assigned, set default as [unknown]
			  return "[unknown]";
	  }

	  public int getSize() {
	    return(numberTable.size());
	  }
}
