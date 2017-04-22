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

	  /**
	   * Fill numberTable with value from defaultWords
	   */
	  public NumberMap() {
		  numberTable = new HashMap<>();
		  for (int i = 0;i<defaultWords.length;i++)
		  {
			  numberTable.put(i, defaultWords[i]);
		  }
	  }
	  
	  /**
	   * Fill numberTable with value from given array
	   */
	  public NumberMap(String[] words) {
		// To-Do set numberTable map by words arrays
		  numberTable = new HashMap<>();
		  for (int i = 0;i<words.length;i++)
		  {
			  numberTable.put(i, words[i]);
		  }
	  }

	  /**
	   * Return word of a given number value, default value = [unknown]
	   */
	  public String wordForNumber(int num) {
		// To-Do return words by numbers assigned, set default as [unknown]
	    return numberTable.getOrDefault(num, "[unknown]");
	  }

	  /**
	   * Return numberTable size
	   */
	  public int getSize() {
	    return(numberTable.size());
	  }
}
