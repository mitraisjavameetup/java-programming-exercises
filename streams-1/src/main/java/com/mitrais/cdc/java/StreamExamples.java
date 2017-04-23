package com.mitrais.cdc.java;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 
 * @author trainee
 * Class StreamExamples
 */
public class StreamExamples {
	/**
 * 	List<String> variable
 */
  public static List<String> words = Arrays.asList("hi", "hello", "hola", "bye", "goodbye", "adios");  
  /**
   * method to print list
   */
  public static void printWordsWithSpace(){
	  
	  /*
	   * TO DO
	   * Loop down the words and print each on a separate line, with two spaces in front of each word.
	   * Don’t use map.
	   * 
	   */ 
	  System.out.printf("  %s.%n", words.stream().collect(Collectors.toList()));
  }
  private static <T> void printStream(Stream<T> s){
		System.out.printf("%s.%n", s.collect(Collectors.toList()));
	}
  /**
   * method to print list
   */
  public static void printWordsNoSpace(){
	  	printStream(words.stream());
	  /*
	   * TO DO
	   * Repeat the previous problem, but without the two spaces in front. 
	   * This is trivial if you use the same
	   * approach as in #1, so the point is to use a method reference here, 
	   * as opposed to an explicit lambda in problem 1.
	   * 
	   */
	  
  }
  /**
   * method to transfrom the list
   * @return List<String>
   */
  public static List<String> excitingWordsStreams(){
	  
	  List<String> result=words.stream().map(s->s+"!").collect(Collectors.toList());
	  /*
	   * TO DO
	   * Produce the same lists as 
	   * List<String> excitingWords = StringUtils.transformedList(words, s -> s + "!");
	   * but this time use streams and the builtin “map” method.
	   * 
	   */  
	  return result; 
  }
  /**
   * method to transfrom list
   * @return List<String>
   */
  public static List<String> eyeWordsStreams(){
	  
	  List<String> result=words.stream().map(s -> s.replace("i", "eye")).collect(Collectors.toList());
	  /*
	   * TO DO
	   * Produce the same lists as 
	   * List<String> eyeWords = StringUtils.transformedList(words, s -> s.replace("i", "eye"));
	   * but this time use streams and the builtin “map” method.
	   * 
	   */  
	  return result;	    
  }
  /**
   * method to transfrom list
   * @return List<String>
   */
  public static List<String> upperCaseWordsStreams(){
	  List<String> result=words.stream().map(String::toUpperCase).collect(Collectors.toList());
	  /*
	   * TO DO
	   * Produce the same lists as 
	   * List<String> upperCaseWords = StringUtils.transformedList(words, String::toUpperCase);
	   * but this time use streams and the builtin “map” method.
	   * 
	   */  
	    return result;    
  }
  /**
   * method to transform list
   * @return List<String>
   */
  public static List<String> shortWordsStreams(){
	  List<String> result=words.stream().filter(s -> s.length() < 4).collect(Collectors.toList());
	  /*
	   * TO DO
	   * Produce the same lists as 
	   * List<String> shortWords = StringUtils.allMatches(words, s -> s.length() < 4);
	   * but this time use “filter”
	   * 
	   */  
	    return result; 
	  
  }
  /**
   * method to transform and filter list
   * @return List<String>
   */
  public static List<String> wordsWithBStreams(){
	  List<String> result=words.stream().filter(s -> s.contains("b")).collect(Collectors.toList());
	  /*
	   * TO DO
	   * Produce the same lists as 
	   * List<String> wordsWithB = StringUtils.allMatches(words, s -> s.contains("b"));
	   * but this time use “filter”
	   * 
	   */  
	  return result;
  }
  /**
   * method to transform and filter list
   * @return List<String>
   */
  public static List<String> evenLengthWords(){
	  List<String> result=words.stream().filter(s->(s.length()%2)==0).collect(Collectors.toList());
	  /*
	   * TO DO
	   * Produce the same lists as 
	   * List<String> wordsWithB = StringUtils.allMatches(words, s -> s.contains("b"));
	   * but this time use “filter”
	   * 
	   */  
	  return result;
  }
  /**
   * method to transform and filter list
   * @param containedTest
   * @return String
   */
  public static String firstFunnyString(String containedTest) {
	  String result=words.stream().map(String::toUpperCase).filter(s -> s.length()<=4).filter(s -> s.contains(containedTest)).findFirst().orElse("No match");
	  /*
	   * TO DO
	   * Turn the strings into uppercase, 
	   * keep only the ones that are shorter than 4 characters, of what is remaining, 
	   * keep only the ones that contain containedTest arg,
	   * and return string "No Match" when no result.
	   */
	  return result;
  }
  
  /**
   * method to transform list into array
   * @return String[]
   */
  public static String[] wordsAsArray() {
	  String[] result=words.stream().toArray(size->new String[size]);
	 /* 
	  * TO DO
	  * Create output the final result of words as an array instead of a List
	  * 
	  */
	  return result;
  }
  
}
