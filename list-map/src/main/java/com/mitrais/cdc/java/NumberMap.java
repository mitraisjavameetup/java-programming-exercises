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
	   * constructor of NumberMap without parameter
	   */
	  public NumberMap() {
		  numberTable=new HashMap<Integer, String>();
		  for(int i=0;i<defaultWords.length;i++){
			  numberTable.put(i, defaultWords[i]);
		  }
	  }
	  /**
	   * constructor of NumberMap with parameter
	   * @param words
	   */
	  public NumberMap(String[] words) {
		  numberTable=new HashMap<Integer, String>();
		// To-Do set numberTable map by words arrays 
		  for(int i=0;i<words.length;i++){
			  numberTable.put(i, words[i]);
		  }
	  }
	  /**\
	   * search the value of unique key with default value
	   * @param num
	   */
	  public String wordForNumber(int num) {
		// To-Do return words by numbers assigned, set default as [unknown]
		String word=numberTable.getOrDefault(num, "unknown");  
	    return word;
	  }
	  /**
	   * 
	   * get size of the map
	   */
	  public int getSize() {
	    return(numberTable.size());
	  }
}
