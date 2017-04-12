package com.mitrais.cdc.java;

import java.util.*;
import java.util.stream.Collectors;

public class StreamExamples {
	
  public static List<String> words = Arrays.asList("hi", "hello", "hola", "bye", "goodbye", "adios");  
  
  public static void printWordsWithSpace(){
	
	  /*
	   * TO DO
	   * Loop down the words and print each on a separate line, with two spaces in front of each word.
	   * Don’t use map.
	   * 
	   */
	  for(String w:words)
		  System.out.println("  "+w);
  }
  
  public static void printWordsNoSpace(){
		
	  /*
	   * TO DO
	   * Repeat the previous problem, but without the two spaces in front. 
	   * This is trivial if you use the same
	   * approach as in #1, so the point is to use a method reference here, 
	   * as opposed to an explicit lambda in problem 1.
	   * 
	   */
	  words.stream().forEach(w -> System.out.println(w));
  }
  
  public static List<String> excitingWordsStreams(){
	  
	  /*
	   * TO DO
	   * Produce the same lists as 
	   * List<String> excitingWords = StringUtils.transformedList(words, s -> s + "!");
	   * but this time use streams and the builtin “map” method.
	   * 
	   */
	  List<String> excitingWords = words.stream().map(w -> w + "!").collect(Collectors.toList());
	  return excitingWords; 
  }
  
  public static List<String> eyeWordsStreams(){
	  
	  /*
	   * TO DO
	   * Produce the same lists as 
	   * List<String> eyeWords = StringUtils.transformedList(words, s -> s.replace("i", "eye"));
	   * but this time use streams and the builtin “map” method.
	   * 
	   */
	  List<String> eyeWords = words.stream().map(s -> s.replace("i", "eye")).collect(Collectors.toList());
	  return eyeWords;	    
  }
  
  public static List<String> upperCaseWordsStreams(){
	  
	  /*
	   * TO DO
	   * Produce the same lists as 
	   * List<String> upperCaseWords = StringUtils.transformedList(words, String::toUpperCase);
	   * but this time use streams and the builtin “map” method.
	   * 
	   */ 
	  	List<String> upperCaseWords = words.stream().map(String::toUpperCase).collect(Collectors.toList());
	    return upperCaseWords;    
  }
  
  public static List<String> shortWordsStreams(){
	  
	  /*
	   * TO DO
	   * Produce the same lists as 
	   * List<String> shortWords = StringUtils.allMatches(words, s -> s.length() < 4);
	   * but this time use “filter”
	   * 
	   */
	  	List<String> shortWords = words.stream().filter(w -> w.length() < 4).collect(Collectors.toList());
	    return shortWords;   
	  
  }
  
  public static List<String> wordsWithBStreams(){
	  
	  /*
	   * TO DO
	   * Produce the same lists as 
	   * List<String> wordsWithB = StringUtils.allMatches(words, s -> s.contains("b"));
	   * but this time use “filter”
	   * 
	   */
	  List<String> wordsWithB = words.stream().filter(w -> w.contains("b")).collect(Collectors.toList());
	  return wordsWithB;
  }
  
  public static List<String> evenLengthWords(){
	  
	  /*
	   * TO DO
	   * Produce the same lists as 
	   * List<String> wordsWithB = StringUtils.allMatches(words, s -> s.contains("b"));
	   * but this time use “filter”
	   * 
	   */
	  List<String> evenWords = words.stream().filter(w -> w.length()%2 == 0).collect(Collectors.toList());
	  return evenWords;
  }
  
  public static String firstFunnyString(String containedTest) {
	  
	  /*
	   * TO DO
	   * Turn the strings into uppercase, 
	   * keep only the ones that are shorter than 4 characters, of what is remaining, 
	   * keep only the ones that contain containedTest arg,
	   * and return string "No Match" when no result.
	   */
	  String funnyString = words.stream()
			  				.map(String::toUpperCase)
			  				.filter(w -> w.contains(containedTest))
			  				.filter(w -> w.length() < 4)
			  				.findFirst()
			  				.orElse("No match");
	  return funnyString;
  }
  
  
  public static String[] wordsAsArray() {
	  
	 /* 
	  * TO DO
	  * Create output the final result of words as an array instead of a List
	  * 
	  */
	  String[] output = words.stream().toArray(String[]::new);
	  return output;
  }
  
}
