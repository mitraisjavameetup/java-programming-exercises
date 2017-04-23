package com.mitrais.cdc.java;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FileIoExamples {
  
  public static String nLetterWord(String inputFile, int wordLength) throws Exception {
	  
	  /* 
	   * TO DO
	   * Print the first 10-letter word found in the file.
	   * 
	   */
	  String word = Files.lines(Paths.get(inputFile)).filter(s -> s.length() == wordLength).findFirst().get();
	  return word;
  }
  
  public static String abcWord(String inputFile) throws Exception {
	  
	  /*
	   * TO DO
	   * Print the first 8-letter word that contains “a”, “b”, and “c”.
	   * 
	   */
	  String word = Files.lines(Paths.get(inputFile)).filter(s -> s.length() == 8).filter(s -> s.contains("a")).filter(s -> s.contains("b")).filter(s -> s.contains("c")).findFirst().get();
	  return word;
  }
  
  public static String abcWordMixedCase(String inputFile) throws Exception {
	  
	  /*
	   * TO DO
	   * Repeat the previous problem, but handle the possibility of mixed-case words in the file.
	   * Hint: do something shorter than merely modifying your filter tests to include “A”, “B”, and “C”. 
	   * 
	   */
	  String word = Files.lines(Paths.get(inputFile)).filter(s -> s.length() == 8).filter(s -> s.toLowerCase().contains("a")).filter(s -> s.toLowerCase().contains("b")).filter(s -> s.toLowerCase().contains("c")).findFirst().get();
	  return word;
  }
  
  public static String longestWordWithout(String inputFile, String letter1, String letter2) throws Exception {
	  
	  /*
	   * TO DO 
	   * Print the longest English word that contains neither “a” nor “e”.
	   * 
	   */
	  String word = Files.lines(Paths.get(inputFile)).filter(s -> !s.contains(letter1)).filter(s -> !s.contains(letter2)).max((s1, s2) -> s1.length() - s2.length()).get();
	  return word;
  }
  
  public static String shortestWordWith(String inputFile, String letter) throws Exception {
	  
	  /*
	   * TO DO
	   * Print the shortest English word that contains a “q”
	   * 
	   */
	  String word = Files.lines(Paths.get(inputFile)).filter(s -> s.contains(letter)).min((s1, s2) -> s1.length() - s2.length()).get();
	  return word;
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
	  List<String> words= Files.lines(Paths.get(inputFile))
			  .filter(s -> s.contains("wow")||s.contains("cool"))
			  .map(String::toUpperCase)
			  .sorted((s1, s2) -> s1.compareTo(s2))
			  .map(s -> s + "!")
			  .collect(Collectors.toList());
	  Files.write(Paths.get(outputFile), words, Charset.defaultCharset());
  }
  
  public static long numPathsInProject() throws Exception {
	  
	  /*
	   * TO DO
	   * Print out the number of files in your Eclipse project.
	   * Folders count as files. 
	   * 
	   */  
	  int numFiles = (int) Files.list(Paths.get(".")).count();
//	  System.out.println(numFiles);
//      try(Stream<Path> paths = Files.list(Paths.get("."))) {
//          paths.forEach(System.out::println);
//        } catch(IOException ioe) {
//          System.err.println("IOException: " + ioe);
//        }
      return numFiles;
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
	    Path path = Paths.get(outputFile);
	    try (PrintWriter out =
	      new PrintWriter(Files.newBufferedWriter(path, Charset.defaultCharset()))) {
	        for(int i=0; i<n; i++) {
	          out.printf("Number is %6.3f%n", range * Math.random());
	        }
	    } catch (IOException ioe) {
	      System.err.printf("IOException: %s%n", ioe);
	    }
  }
  
  private FileIoExamples() {} // Uninstantiatable class
}
