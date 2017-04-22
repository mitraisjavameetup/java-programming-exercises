package com.mitrais.cdc.java;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FileIoExamples {
  
  public static String nLetterWord(String inputFile, int wordLength) throws Exception {
	  
	  /* 
	   * TO DO
	   * Print the first 10-letter word found in the file.
	   * 
	   */
    return Files.lines(Paths.get(inputFile)).filter(word -> word.length() == wordLength).findFirst().orElse("");
  }
  
  public static String abcWord(String inputFile) throws Exception {
	  
	  /*
	   * TO DO
	   * Print the first 8-letter word that contains “a”, “b”, and “c”.
	   * 
	   */
    return Files.lines(Paths.get(inputFile)).
    		filter(word -> word.contains("a") && word.contains("b") && word.contains("c")).
    		filter(word -> word.length() == 8).findFirst().orElse("");
  }
  
  public static String abcWordMixedCase(String inputFile) throws Exception {
	  
	  /*
	   * TO DO
	   * Repeat the previous problem, but handle the possibility of mixed-case words in the file.
	   * Hint: do something shorter than merely modifying your filter tests to include “A”, “B”, and “C”. 
	   * 
	   */
	  return Files.lines(Paths.get(inputFile)).
	    		filter(word -> word.contains("a") && word.contains("b") && word.contains("c")).
	    		filter(word -> word.length() == 8).findFirst().orElse("");
  }
  
  public static String longestWordWithout(String inputFile, String letter1, String letter2) throws Exception {
	  
	  /*
	   * TO DO 
	   * Print the longest English word that contains neither “a” nor “e”.
	   * 
	   */
    return Files.lines(Paths.get(inputFile)).
    		filter(word -> !word.contains(letter1) && !word.contains(letter2)).
    		sorted((s1, s2) -> {
    			if(s1.length() < s2.length()){
    				return 1;
    			}else if (s1.length() > s2.length()){
    				return -1;
    			}else{
    				return 0;
    			}
    		}).
    		findFirst().get();
  }
  
  public static String shortestWordWith(String inputFile, String letter) throws Exception {
	  
	  /*
	   * TO DO
	   * Print the shortest English word that contains a “q”
	   * 
	   */
	  
	  return Files.lines(Paths.get(inputFile)).
	    		filter(word -> word.contains(letter)).
	    		sorted((s1, s2) -> {
	    			if(s1.length() < s2.length()){
	    				return -1;
	    			}else if (s1.length() > s2.length()){
	    				return 1;
	    			}else{
	    				return 0;
	    			}
	    		}).
	    		findFirst().get();
  }
  
  public static void storeTwitterList(String inputFile, String outputFile) throws Exception {
	  
	 /* 
	  * TO DO
	  * Make a file called “twitter-words.txt” 
	  * that contains all words from the enable1-word-list.txt list 
	  * that contain “wow” or “cool”. 
	  * The words should be sorted, in uppercase, and have an exclamation point 
	  * at the end. (E.g., “COOLER!”).
	  * 
	  */
	  List<String> lines = Files.lines(Paths.get(inputFile)).
			  filter(word -> word.contains("wow") || word.contains("cool")).map(String::toUpperCase).
			  map(word -> word + '!').collect(Collectors.toList());
	  Files.write(Paths.get(outputFile), lines, Charset.defaultCharset());
  }
  
  public static long numPathsInProject() throws Exception {
	  
	  /*
	   * TO DO
	   * Print out the number of files in your Eclipse project.
	   * Folders count as files. 
	   * 
	   */  
	  long numPath =0;
	  try (Stream<Path> paths = Files.list(Paths.get("./"))) {
		numPath = paths.count();
	} catch (IOException e) {
		e.printStackTrace();
	}
	  
    return numPath;
  }
  
  public static void storeNums(int n, int range, String outputFile) {
	  
	  /*
	   * TO DO
	   * Create a file containing 17 random doubles between 0 and 100, 
	   * each with exactly three digits after the decimal point.
	   * Note that the file will not actually be written until you close the PrintWriter.
	   * So, although you probably have mostly been ignoring exceptions, 
	   * for this problem you might as well declare the PrintStream using
	   * the try-with-resources approach shown in the lecture. 
	   * Not only will this handle the exceptions explicitly, 
	   * but it will also automatically close the PrintStream at the end.
	   * 
	   */
	  
  }
  
  private FileIoExamples() {} // Uninstantiatable class
}
