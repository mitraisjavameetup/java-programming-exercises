package com.mitrais.cdc.java;

import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class FileIoExamples {
  
  public static String nLetterWord(String inputFile, int wordLength) throws Exception {
	  String nWord = Files.lines(Paths.get(inputFile)).filter(s -> s.length() == 10).findFirst().orElse(null);
	   
	  /* 
	   * TO DO
	   * Print the first 10-letter word found in the file.
	   * 
	   */
    return nWord;
  }
  
  public static String abcWord(String inputFile) throws Exception {
	  String abcWord = Files.lines(Paths.get(inputFile)).filter(s -> s.length() == 8 && s.contains("a") 
			  && s.contains("b") && s.contains("c")).findFirst().orElse(null);
	  /*
	   * TO DO
	   * Print the first 8-letter word that contains “a”, “b”, and “c”.
	   * 
	   */
    return abcWord;
  }
  
  public static String abcWordMixedCase(String inputFile) throws Exception {
	  String mixedWord = Files.lines(Paths.get(inputFile)).map(s -> s.toLowerCase()).filter(s -> s.length() == 8 && s.contains("a") 
			  && s.contains("b") && s.contains("c")).findFirst().orElse(null);
	  /*
	   * TO DO
	   * Repeat the previous problem, but handle the possibility of mixed-case words in the file.
	   * Hint: do something shorter than merely modifying your filter tests to include “A”, “B”, and “C”. 
	   * 
	   */
    return mixedWord;
  }
  
  public static String longestWordWithout(String inputFile, String letter1, String letter2) throws Exception {
	  String longestWord = Files.lines(Paths.get(inputFile)).filter(s -> !s.contains("a") 
			  && !s.contains("e")).max(Comparator.comparingInt(String::length)).orElse(null);
	  /*
	   * TO DO 
	   * Print the longest English word that contains neither “a” nor “e”.
	   * 
	   */
    return longestWord;
  }
  
  public static String shortestWordWith(String inputFile, String letter) throws Exception {
	  String shortestWord = Files.lines(Paths.get(inputFile)).filter(s -> s.contains("q")).min(Comparator.comparingInt(String::length)).orElse(null);
	  /*
	   * TO DO
	   * Print the shortest English word that contains a “q”
	   * 
	   */
    return shortestWord;
  }
  
  public static void storeTwitterList(String inputFile, String outputFile) throws Exception {
//	  Files.write(path, bytes, options)
	  List<String> twitterWords = Files.lines(Paths.get(inputFile)).filter(s -> s.contains("wow") ||
			  s.contains("cool")).map(s -> s.toUpperCase()).map(s -> s.concat("!")).collect(Collectors.toList());
	  Files.write(Paths.get(outputFile), twitterWords);
	 /* 
	  * TO DO
	  * Make a file called “twitter-words.txt” 
	  * that contains all words from the enable1-word-list.txt list 
	  * that contain “wow” or “cool”. 
	  * The words should be sorted, in uppercase, and have an exclamation point 
	  * at the end. (E.g., “COOLER!”).
	  * 
	  */
  }
  
  public static long numPathsInProject() throws Exception {
	  long numPaths = Files.list(Paths.get("./")).count();
	  /*
	   * TO DO
	   * Print out the number of files in your Eclipse project.
	   * Folders count as files. 
	   * 
	   */  
    return numPaths;
  }
  
  public static void storeNums(int n, int range, String outputFile) {
	  Charset charSet = Charset.defaultCharset();
	  Path path = Paths.get(outputFile);
	  try(PrintWriter output = new PrintWriter(Files.newBufferedWriter(path, charSet))) {
		  for (int i = 0; i < n; i++) {
			output.printf("%.3f%n", new Random().nextDouble()*range);
		}
	  } catch (Exception e) {
		 System.err.printf("IOException: %s%n", e);
	}
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
