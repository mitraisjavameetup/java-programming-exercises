package com.mitrais.cdc.java;

import java.util.*;

public class NumberMap {
	private Map<Integer,String> numberTable;
	  private static String[] defaultWords =
	    {"zero", "one", "two", "three", "four",
	     "five", "six", "seven", "eight", "nine",
	     "ten", "eleven", "twelve", "thirteen",
	     "fourteen", "fifteen", "sixteen",
	     "seventeen", "eighteen", "nineteen"};

	  /**Default Constructor**/
	  public NumberMap() {
	    this(defaultWords);
	  }

	  /**Alternative Constructor**/
	  public NumberMap(String[] words) {
		// To-Do set numberTable map by words arrays
		numberTable = new HashMap<>();
		for (int x = 0; x < words.length; x++)
		{
			numberTable.put(x, words[x]);
		}
	  }

	  /**Used to output the word for the given number**/
	  public String wordForNumber(int num) {
		// To-Do return words by numbers assigned, set default as [unknown]
		String result = numberTable.getOrDefault(num, "[unknown]");  
	    return result;
	  }

	  /**Returns the size of the List**/
	  public int getSize() {
	    return(numberTable.size());
	  }
}
