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
	  
	  /** Constructor NumberMap empty parameter*/
	  public NumberMap() {
	    this(defaultWords);
	  }

	  /** Constructor NumberMap with word parameter*/
	  public NumberMap(String[] words) {
		// To-Do set numberTable map by words arrays
		 numberTable = new HashMap<>();
		 int panjang = words.length;
		 for(int i=0; i<panjang; i++){
			 numberTable.put(i,words[i]);  
		 }
		
	  }
	  
	  /** Get word from number input*/
	  public String wordForNumber(int num) {
		// To-Do return words by numbers assigned, set default as [unknown]
	    return numberTable.get(num);
	  }

	  /** Get size from Map collection*/
	  public int getSize() {
	    return(numberTable.size());
	  }
}
