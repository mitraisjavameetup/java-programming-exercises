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
		// To-Do set numberTable map by words arrays 
		Integer count=0;
		numberTable=new HashMap();
		for (String kata:words)
		{
			numberTable.put(count, kata);
			count++;
		}
	  
	  }

	  public String wordForNumber(int num) {
		// To-Do return words by numbers assigned, set default as [unknown]
		String tampung=numberTable.getOrDefault(num, "unknown");
	    return tampung;
	  }

	  public int getSize() {
	    return(numberTable.size());
	  }
	  
}
