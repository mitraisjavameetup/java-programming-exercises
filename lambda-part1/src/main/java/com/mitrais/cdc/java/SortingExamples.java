package com.mitrais.cdc.java;

import java.util.Arrays;

public class SortingExamples {

  // array containing a few Strings
  public static String[] words = { "hello", "hola", "hi", "bye", "goodbye", "adios" };
  
  public static String[] sortedByLengthAscending(){
	  String[] sortedByLengthAscending = words;
	  /*
	   * TO DO
	   * Sort words by length (i.e., shortest to longest)
	   * 
	   */
	  Arrays.sort(sortedByLengthAscending, (a, b) -> a.length() - b.length());
	  return sortedByLengthAscending;
  }
  
  
  public static String[] sortedByLengthDescending(){
	  String[] sortedByLengthDescending = words;
	  
	  /*
	   * TO DO
	   * Sort words by reverse length (i.e., longest to shortest)
	   * 
	   */
	  Arrays.sort(sortedByLengthDescending, (a, b) -> b.length() - a.length());
	  return sortedByLengthDescending;
			  
  }
  
  public static String[] sortedByFirstLetter(){
	  String[] sortedByFirstLetter = words;
	  
	  /*
	   * TO DO
	   * Sort words alphabetically by the first character only
	   * 
	   */
	  Arrays.sort(sortedByFirstLetter, (a, b) -> a.charAt(0) - b.charAt(0));
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
	  Arrays.sort(sortedByContains, (a, b) -> StringUtils.eChecker(a, b));
	  return sortedByContains;
			  
  } 
  
}
