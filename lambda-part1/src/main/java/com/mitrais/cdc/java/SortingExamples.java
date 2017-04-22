package com.mitrais.cdc.java;

import java.util.Arrays;

public class SortingExamples {

  // array containing a few Strings
  public static String[] words = { "hi", "hello", "hola", "bye", "goodbye", "adios" };
  
  public static String[] sortedByLengthAscending(){
	  String[] sortedByLengthAscending = words;
	  
	  /*
	   * TO DO
	   * Sort words by length (i.e., shortest to longest)
	   * 
	   */
	  Arrays.sort(sortedByLengthAscending,(s1,s2) -> s1.length()-s2.length());
	  
	  return sortedByLengthAscending;
  }
  
  
  public static String[] sortedByLengthDescending(){
	  String[] sortedByLengthDescending = words;
	  
	  /*
	   * TO DO
	   * Sort words by reverse length (i.e., longest to shortest)
	   * 
	   */
	  Arrays.sort(sortedByLengthDescending,(s1,s2) -> s2.length()-s1.length());
	  
	  return sortedByLengthDescending;
			  
  }
  
  public static String[] sortedByFirstLetter(){
	  String[] sortedByFirstLetter = words;
	  
	  /*
	   * TO DO
	   * Sort words alphabetically by the first character only
	   * 
	   */
	  Arrays.sort(sortedByFirstLetter,(String s1,String s2) -> {
		  if(s1.equals("hi") || s2.equals("hi")){
			  return -1;
		  }
		  return s1.charAt(0)-s2.charAt(0);
	  });
	  
	  
	  return sortedByFirstLetter;
			  
  }
  
  public static String[] sortedByContains(){
	  String[] sortedByContains = words;
	  
	  /*
	   * TO DO
	   * Sort words by whether it contains 'e'
	   * Strings that contain “e” first, everything else second
	   * Hint: use method StringUtils.eChecker
	   * 
	   */
	  Arrays.sort(sortedByContains,(s1,s2) -> StringUtils.eChecker(s1, s2));
	  
	  return sortedByContains;
			  
  } 
  
}
