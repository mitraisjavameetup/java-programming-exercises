package com.mitrais.cdc.java;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
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
	  Path path = Paths.get(inputFile);
	  String lines = Files.lines(path).map(x->x).filter(x->x.length()==10).findFirst().orElse(null);
    return lines;
  }
  
  public static String abcWord(String inputFile) throws Exception {
	  
	  /*
	   * TO DO
	   * Print the first 8-letter word that contains “a”, “b”, and “c”.
	   * 
	   */
	  Path path = Paths.get(inputFile);
	  String lines = Files.lines(path).map(x->x).filter(x->x.length()==8).filter(x->x.contains("a")&&x.contains("b")&&x.contains("c")).findFirst().orElse(null);
	  
    return lines;
  }
  
  public static String abcWordMixedCase(String inputFile) throws Exception {
	  
	  /*
	   * TO DO
	   * Repeat the previous problem, but handle the possibility of mixed-case words in the file.
	   * Hint: do something shorter than merely modifying your filter tests to include “A”, “B”, and “C”. 
	   * 
	   */
	  Path path = Paths.get(inputFile);
	  String lines = Files.lines(path).map(x->x.toLowerCase()).filter(x->x.length()==8).filter(x->x.contains("a")&&x.contains("b")&&x.contains("c")).findFirst().orElse(null);
	  
    return lines;
  }
  
  public static String longestWordWithout(String inputFile, String letter1, String letter2) throws Exception {
	  
	  /*
	   * TO DO 
	   * Print the longest English word that contains neither “a” nor “e”.
	   * 
	   */
	  Path path = Paths.get(inputFile);
	  String lines = Files.lines(path).map(x->x.toLowerCase()).filter(x->!x.contains("a")).filter(x->!x.contains("e")).max(Comparator.comparingInt(String::length)).orElse(null);
    return lines;
  }
  
  public static String shortestWordWith(String inputFile, String letter) throws Exception {
	  
	  /*
	   * TO DO
	   * Print the shortest English word that contains a “q”
	   * 
	   */
	  Path path = Paths.get(inputFile);
	  String lines = Files.lines(path).map(x->x.toLowerCase()).filter(x->x.contains("q")).min(Comparator.comparingInt(String::length)).orElse(null);
    return lines;
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
	  
	  Path path = Paths.get(inputFile);
	  List<String> lines = Files.lines(path).map(x->x.toUpperCase()).map(x->x.concat("!")).filter(x->x.contains("WOW")||x.contains("COOL")).collect(Collectors.toList());
	  System.out.println(lines.toString());
	  Files.write(Paths.get(outputFile), lines);

  }
  
  public static long numPathsInProject() throws Exception {
	  
	  /*
	   * TO DO
	   * Print out the number of files in your Eclipse project.
	   * Folders count as files. 
	   * 
	   */
	  
    return Files.list(Paths.get("/")).count(); 
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
	  try (PrintWriter out =
		      new PrintWriter(Files.newBufferedWriter(Paths.get(outputFile), Charset.defaultCharset()))) {
		        for(int i=0; i<n; i++) {
		          out.printf("Number is %5.2f%n", 100 * Math.random());
		        }
		    } catch (IOException ioe) {
		      System.err.printf("IOException: %s%n", ioe);
		    }
  }
  
  private FileIoExamples() {} // Uninstantiatable class
}
