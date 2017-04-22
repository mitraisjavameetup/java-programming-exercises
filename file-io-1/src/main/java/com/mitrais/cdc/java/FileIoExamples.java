package com.mitrais.cdc.java;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Comparator;
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
	  String output = Files.lines(Paths.get(inputFile))
			    .filter(word -> word.length() == wordLength)
			    .findFirst()
			    .orElse(null);
			  
	  return output;
  }
  
  public static String abcWord(String inputFile) throws Exception {
	  
	  /*
	   * TO DO
	   * Print the first 8-letter word that contains “a”, “b”, and “c”.
	   * 
	   */
	  String output = Files.lines(Paths.get(inputFile))
			  	.filter(word -> word.length() == 8)
			    .filter(word -> word.contains("a"))
			    .filter(word -> word.contains("b"))
			    .filter(word -> word.contains("c"))
			    .findFirst()
			    .orElse(null);
			  
	  return output;
  }
  
  public static String abcWordMixedCase(String inputFile) throws Exception {
	  
	  /*
	   * TO DO
	   * Repeat the previous problem, but handle the possibility of mixed-case words in the file.
	   * Hint: do something shorter than merely modifying your filter tests to include “A”, “B”, and “C”. 
	   * 
	   */
	  String output = Files.lines(Paths.get(inputFile))
			  	.map(String::toLowerCase)
			  	.filter(word -> word.length() == 8)
			    .filter(word -> word.contains("a"))
			    .filter(word -> word.contains("b"))
			    .filter(word -> word.contains("c"))
			    .findFirst()
			    .orElse(null);
			  
	  return output;
  }
  
  public static String longestWordWithout(String inputFile, String letter1, String letter2) throws Exception {
	  
	  /*
	   * TO DO 
	   * Print the longest English word that contains neither “a” nor “e”.
	   * 
	   */
	  
	  String output = Files.lines(Paths.get(inputFile))
			  	.filter(word -> !word.contains(letter1))
			    .filter(word -> !word.contains(letter2))
			  	.max(Comparator.comparing(word -> word.length()))
			  	.get();
			  
	  return output;
  }
  
  public static String shortestWordWith(String inputFile, String letter) throws Exception {
	  
	  /*
	   * TO DO
	   * Print the shortest English word that contains a “q”
	   * 
	   */
	  String output = Files.lines(Paths.get(inputFile))
			  	.filter(word -> word.contains(letter))
			  	.min(Comparator.comparing(word -> word.length()))
			  	.get();
			  
	  return output;
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
	  Charset characterSet = Charset.defaultCharset();
	  Path outputpath = Paths.get(outputFile);
	  List<String> output = Files.lines(Paths.get(inputFile))
			  .filter(word -> word.contains("wow") || word.contains("cool"))
			  .map(String::toUpperCase)
			  .map(word -> word + "!")
			  .sorted()
			  .collect(Collectors.toList());
	  PrintWriter out =
		      new PrintWriter(Files.newBufferedWriter(outputpath, characterSet));
	  for(String word :output) {
          out.printf("%s%n", word);
        }
	  out.close();
  }
  
  public static long numPathsInProject() throws Exception {
	  
	  /*
	   * TO DO
	   * Print out the number of files in your Eclipse project.
	   * Folders count as fiPath 
	   * 
	   */
	  Stream<Path> paths = Files.list(Paths.get("."));
	  return paths.count();
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
	  List<Double> random = Stream.generate(() -> Math.random()*range).limit(n).collect(Collectors.toList());
	  Charset characterSet = Charset.defaultCharset();
	  Path outputpath = Paths.get(outputFile);
	  try (PrintWriter out =
		      new PrintWriter(Files.newBufferedWriter(outputpath, characterSet))) {
		        for(Double x: random) {
		          out.printf(" %.3f%n", x);
		        }
		    } catch (IOException ioe) {
		      System.err.printf("IOException: %s%n", ioe);
		    }
  }
  
  private FileIoExamples() {} // Uninstantiatable class
}
