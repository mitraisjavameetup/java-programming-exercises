package com.mitrais.cdc.java;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.nio.file.*;
import java.util.List;
import java.util.stream.*;

public class FileIoExamples {
  
  public static String nLetterWord(String inputFile, int wordLength) throws Exception {
	  
	  /* 
	   * TO DO
	   * Print the first 10-letter word found in the file.
	   * 
	   */
	try {
		  return Files.lines(Paths.get(inputFile))
				  .filter(word -> word.length() == wordLength)
				  .findFirst()
				  .orElse(null);
	} catch (IOException e) {
		System.err.println(e);
		return null;
	}
	  
  }
  
  public static String abcWord(String inputFile) throws Exception {
	  
	  /*
	   * TO DO
	   * Print the first 8-letter word that contains “a”, “b”, and “c”.
	   * 
	   */
	  try {
		  return Files.lines(Paths.get(inputFile))
				  .filter(word -> word.length() == 8)
				  .filter(word -> word.contains("a") && word.contains("b") && word.contains("c"))
				  .findFirst()
				  .orElse(null);
	} catch (IOException e) {
		System.err.println(e);
		return null;
	}
	  
  }
  
  public static String abcWordMixedCase(String inputFile) throws Exception {
	  
	  /*
	   * TO DO
	   * Repeat the previous problem, but handle the possibility of mixed-case words in the file.
	   * Hint: do something shorter than merely modifying your filter tests to include “A”, “B”, and “C”. 
	   * 
	   */
	  try {
		  return Files.lines(Paths.get(inputFile))
			   	  .map(String::toLowerCase)
				  .filter(word -> word.length() == 8)
				  .filter(word -> word.contains("a") && word.contains("b") && word.contains("c"))
				  .findFirst().orElse(null);
	} catch (IOException e) {
		System.err.println(e);
		return null;
	}
	  
  }
  
  public static String longestWordWithout(String inputFile, String letter1, String letter2) throws Exception {
	  
	  /*
	   * TO DO 
	   * Print the longest English word that contains neither “a” nor “e”.
	   * 
	   */
	  try {
		    return Files.lines(Paths.get(inputFile))
		    		.filter(word -> !word.contains(letter1) && !word.contains(letter2))
		    		.sorted((a,b) -> Long.compare(b.length(), a.length()))
		    		.findFirst()
		    		.orElse(null);
	} catch (IOException e) {
		System.err.println(e);
		return null;
	}
  }
  
  public static String shortestWordWith(String inputFile, String letter) throws Exception {
	  
	  /*
	   * TO DO
	   * Print the shortest English word that contains a “q”
	   * 
	   */try {
		    return Files.lines(Paths.get(inputFile))
		    		.filter(word -> word.contains(letter))
		    		.sorted((a,b) -> Long.compare(a.length(), b.length()))
		    		.findFirst()
		    		.orElse(null);
	} catch (IOException e) {
		System.err.println(e);
		return null;
	}
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
	  Charset charset = Charset.defaultCharset();
	  Path path = Paths.get(outputFile);
	  
	  List<String> lines = Files.lines(Paths.get(inputFile))
			  .filter(word -> word.contains("wow") || word.contains("cool"))
			  .map(String::toUpperCase)
			  .map(word -> word + "!")
			  .collect(Collectors.toList());
	  Files.write(path, lines, charset);
  }
  
  public static long numPathsInProject() throws Exception {
	  
	  /*
	   * TO DO
	   * Print out the number of files in your Eclipse project.
	   * Folders count as files. 
	   * 
	   */
	  return Files.list(Paths.get(".")).count();
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
	  Charset charset = Charset.defaultCharset();
	    Path path = Paths.get(outputFile);
	    try (PrintWriter out =
	      new PrintWriter(Files.newBufferedWriter(path, charset))) {
	        for(int i=0; i<n; i++) {
	          out.printf("Number is %5.2f%n", range * Math.random());
	        }
	    } catch (IOException ioe) {
	      System.err.printf("IOException: %s%n", ioe);
	    }
  }
  
  private FileIoExamples() {} // Uninstantiatable class
}
