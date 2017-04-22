package com.mitrais.cdc.java;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.Comparator;
import java.util.List;

public class FileIoExamples {
  
  public static String nLetterWord(String inputFile, int wordLength) throws Exception {
	  
	  /* 
	   * TO DO
	   * Print the first 10-letter word found in the file.
	   * 
	   */
	  try(Stream<String> s = Files.lines(Paths.get(inputFile))){
		  String word = s.filter(w -> w.length() == 10).
				  findFirst().get();
		  System.out.printf("nLetterWord: %s\n",word);
		  return word;
	  } catch (IOException ioe) {
		  System.err.println(ioe);
		  return null;
	  }
  }
  
  public static String abcWord(String inputFile) throws Exception {
	  
	  /*
	   * TO DO
	   * Print the first 8-letter word that contains “a”, “b”, and “c”.
	   * 
	   */
	  try(Stream<String> s = Files.lines(Paths.get(inputFile))){
		  String word = s.filter(w -> w.length() == 8)
				  .filter(w -> w.contains("a") && w.contains("b") && w.contains("c"))
				  .findFirst().get();
		  System.out.printf("abcWord: %s\n",word);
		  return word;
	  } catch (IOException ioe) {
		  System.err.println(ioe);
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
	  try(Stream<String> s = Files.lines(Paths.get(inputFile))){
		  String word = s.filter(w -> w.length() == 8)
				  .filter(w -> w.toLowerCase().contains("a") && w.toLowerCase().contains("b") && w.toLowerCase().contains("c"))
				  .findFirst().get();
		  System.out.printf("abcWordMixedCase: %s\n",word);
		  return word;
	  } catch (IOException ioe) {
		  System.err.println(ioe);
		  return null;
	  }
  }
  
  public static String longestWordWithout(String inputFile, String letter1, String letter2) throws Exception {
	  
	  /*
	   * TO DO 
	   * Print the longest English word that contains neither “a” nor “e”.
	   * 
	   */
	  try(Stream<String> s = Files.lines(Paths.get(inputFile))){
		  String word = s.filter(w -> !w.toLowerCase().contains(letter1) && !w.toLowerCase().contains(letter2))
				  .sorted((x, y) -> Integer.compare(y.length(), x.length())).findFirst().get();
		  System.out.printf("longestWordWithout: %s\n",word);
		  return word;
	  } catch (IOException ioe) {
		  System.err.println(ioe);
		  return null;
	  }
  }
  
  public static String shortestWordWith(String inputFile, String letter) throws Exception {
	  
	  /*
	   * TO DO
	   * Print the shortest English word that contains a “q”
	   * 
	   */
	  try(Stream<String> s = Files.lines(Paths.get(inputFile))){
		  String word = s.filter(w -> w.toLowerCase().contains(letter))
				  .sorted((x, y) -> Integer.compare(x.length(), y.length())).findFirst().get();
		  System.out.printf("shortestWordWith: %s\n",word);
		  return word;
	  } catch (IOException ioe) {
		  System.err.println(ioe);
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
	  try(Stream<String> s = Files.lines(Paths.get(inputFile))){
		  List<String> l = s.filter(w -> w.toLowerCase().contains("wow") || w.toLowerCase().contains("cool"))
				  .sorted((a, b) -> a.compareTo(b))
				  .map(w -> w.toUpperCase() + "!")
				  .collect(Collectors.toList());
		  Files.write(Paths.get(outputFile), l, Charset.defaultCharset());
		  System.out.print(l);
	  } catch (IOException ioe) {
		  System.err.println(ioe);
		 
	  }
  }
  
  public static long numPathsInProject() throws Exception {
	  
	  /*
	   * TO DO
	   * Print out the number of files in your Eclipse project.
	   * Folders count as files. 
	   * 
	   */  
	  return Files.walk(Paths.get(System.getProperty("user.dir"))).count();
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
	  try (PrintWriter out = new PrintWriter(Files.newBufferedWriter(Paths.get(outputFile), Charset.defaultCharset()))) {
	        for(int i=0; i<n; i++) {
	            out.printf("Number is %.3f%n", range * Math.random());
	          }
	  } catch (IOException ioe) {
		  System.err.println(ioe);
	  } 
  }
  
  private FileIoExamples() {} // Uninstantiatable class
}
