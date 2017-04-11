package com.mitrais.cdc.java;

import java.util.Arrays;

public class SortingExamples {

  // array containing a few Strings
  public static String[] words = { "hi", "hello", "hola", "bye", "goodbye", "adios" };
  
  public static String[] sortedByLengthAscending(){
	  String[] sortedByLengthAscending = words;
	  Arrays.sort(sortedByLengthAscending, (s1, s2) -> (s1.length()-s2.length()));
	
	  /*
	   * TO DO
	   * Sort words by length (i.e., shortest to longest)
	   * 
	   */
	  
	  return sortedByLengthAscending;
  }
  
  
  public static String[] sortedByLengthDescending(){
	  String[] sortedByLengthDescending = words;
	  Arrays.sort(sortedByLengthDescending, (s1, s2) -> (s2.length()-s1.length()));
	
	  /*
	   * TO DO
	   * Sort words by reverse length (i.e., longest to shortest)
	   * 
	   */
	  
	  return sortedByLengthDescending;
			  
  }
  
  public static String[] sortedByFirstLetter(){
	  String[] sortedByFirstLetter = { "bye", "goodbye", "adios" };
	  Arrays.sort(sortedByFirstLetter,(s1, s2) -> (s1.charAt(0)-s2.charAt(0)));
	 
	   /* TO DO
	   * Sort words alphabetically by the first character only
	   * 
	   */
	  
	  return sortedByFirstLetter;
			  
  }
  
  public static String[] sortedByContains(){
	  String[] sortedByContains = { "hello", "hi", "hola", "adios" };
	  Arrays.sort(sortedByContains, (s1, s2) -> StringUtils.eChecker(s1, s2));
	
	  /*
	   * TO DO
	   * Sort words by whether it contains 'e'
	   * Strings that contain “e” first, everything else second
	   * Hint: use method StringUtils.eChecker
	   * 
	   */
	  
	  return sortedByContains;
			  
  } 
  
}
