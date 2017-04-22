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

	  public NumberMap(String[] words) {
		  numberTable = new HashMap<>();
		// To-Do set numberTable map by words arrays 
		  for (int i = 0; i < words.length; i++) {
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
