package com.mitrais.cdc.java;

import java.util.*;

public class SortingExamples {

  // array containing a few Strings
  public static String[] words = { "hi", "hello", "hola", "bye", "goodbye", "adios" };
  
  public static String[] sortedByLengthAscending(){
	  String[] sortedByLengthAscending = words;
	  
	  /*
	   * TO DO
	   * Sort words by reverse length (i.e., shortest to longest)
	   * 
	   */
	  Arrays.sort(sortedByLengthAscending, (s1, s2) -> StringUtils.sortLengthAscending(s1, s2));
	  
	  return sortedByLengthAscending;
  }
  
  
  public static String[] sortedByLengthDescending(){
	  String[] sortedByLengthDescending = words;
	  
	  /*
	   * TO DO
	   * Sort words by reverse length (i.e., longest to shortest)
	   * 
	   */
	  Arrays.sort(sortedByLengthDescending, (String s1, String s2) -> StringUtils.sortLengthDescending(s1, s2));
	  
	  return sortedByLengthDescending;
			  
  }
  
  public static String[] sortedByFirstLetter(){
	  String[] sortedByFirstLetter = words;
	  
	  /*
	   * TO DO
	   * Sort words alphabetically by the first character only
	   * 
	   */
	  Arrays.sort(sortedByFirstLetter, (String s1, String s2) -> StringUtils.sortByFirstLetter(s1, s2));
	  
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
	  Arrays.sort(sortedByContains, (String s1, String s2) -> StringUtils.eChecker(s1, s2));
	  
	  return sortedByContains;
			  
  } 
  
}
