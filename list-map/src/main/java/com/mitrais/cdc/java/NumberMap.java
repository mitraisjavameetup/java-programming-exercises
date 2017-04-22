package com.mitrais.cdc.java;
/**
 * @author Agus Mistiawan
 */

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
	   *  Default Controller to set default word in Map
	   */
	  public NumberMap() {
	    this(defaultWords);
	  }
	  /**
	   * Contructor and set value on Map
	   * @param words Array Words 
	   *
	   */
	  public NumberMap(String[] words) {
		// To-Do set numberTable map by words arrays 
		  numberTable = new HashMap<>();
		  int i =0;
		  for(String word : words){
			  numberTable.put(i, word);
			  i++;
		  }
	  }
	  /**
	   * Will return value if exist or Unknown
	   * @param num index
	   * @return value
	   */
	  public String wordForNumber(int num) {
		// To-Do return words by numbers assigned, set default as [unknown]
		String value = numberTable.getOrDefault(num, "Unknown");
	    return value;
	  }
	  /**
	   * Will return size of map
	   * @return size
	   */
	  public int getSize() {
	    return(numberTable.size());
	  }
	  
	  public static void main(String[] args) {
		NumberMap map = new NumberMap();
		System.out.println(map.getSize());
	}
}
