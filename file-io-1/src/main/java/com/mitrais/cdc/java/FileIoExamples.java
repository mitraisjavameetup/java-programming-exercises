package com.mitrais.cdc.java;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.FileVisitOption;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;

public class FileIoExamples {
  
  public static String nLetterWord(String inputFile, int wordLength) throws Exception {
	  
	  /* 
	   * TO DO
	   * Print the first 10-letter word found in the file.
	   * 
	   */
	  
	  return Files.lines(Paths.get(inputFile), StandardCharsets.UTF_8).filter(s -> s.length() == wordLength).findFirst().get();
  }
  
  public static String abcWord(String inputFile) throws Exception {
	  
	  /*
	   * TO DO
	   * Print the first 8-letter word that contains “a”, “b”, and “c”.
	   * 
	   */
	  
	  return Files.lines(Paths.get(inputFile), StandardCharsets.UTF_8).filter(s -> s.length() == 8 && s.contains("a") && s.contains("b") && s.contains("c")).findFirst().get();
  }
  
  public static String abcWordMixedCase(String inputFile) throws Exception {
	  
	  /*
	   * TO DO
	   * Repeat the previous problem, but handle the possibility of mixed-case words in the file.
	   * Hint: do something shorter than merely modifying your filter tests to include “A”, “B”, and “C”. 
	   * 
	   */
	  
	  return Files.lines(Paths.get(inputFile), StandardCharsets.UTF_8).map(s -> s.toLowerCase()).filter(s -> s.length() == 8 && s.contains("a") && s.contains("b") && s.contains("c")).findFirst().get();
  }
  
  public static String longestWordWithout(String inputFile, String letter1, String letter2) throws Exception {
	  
	  /*
	   * TO DO 
	   * Print the longest English word that contains neither “a” nor “e”.
	   * 
	   */
	  
	  return Files.lines(Paths.get(inputFile), StandardCharsets.UTF_8).filter(s -> !s.contains(letter1) && !s.contains(letter2)).sorted((a, b) -> {
		  if (a.length() < b.length()) {
			  return 1;
		  } else if (a.length() > b.length()) {
			  return -1;
		  } else {
			  return 0;
		  }
	  }).findFirst().get();
  }
  
  public static String shortestWordWith(String inputFile, String letter) throws Exception {
	  
	  /*
	   * TO DO
	   * Print the shortest English word that contains a “q”
	   * 
	   */
	  
	  return Files.lines(Paths.get(inputFile), StandardCharsets.UTF_8).filter(s -> s.contains(letter)).sorted((a, b) -> {
		  if (a.length() < b.length()) {
			  return -1;
		  } else if (a.length() > b.length()) {
			  return 1;
		  } else {
			  return 0;
		  }
	  }).findFirst().get();
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
	  
	  List<String> baru = Files.lines(Paths.get(inputFile))
			  .filter(s -> s.contains("wow") || s.contains("cool"))
			  .map(s -> s.toUpperCase().concat("!"))
			  .sorted()
			  .collect(Collectors.toList());
	  Files.write(Paths.get(outputFile), baru, StandardCharsets.UTF_8);
  }
  
  public static long numPathsInProject() throws Exception {
	  
	  /*
	   * TO DO
	   * Print out the number of files in your Eclipse project.
	   * Folders count as files. 
	   * 
	   */  
	  return Files.walk(Paths.get(".").toAbsolutePath(), Integer.MAX_VALUE).count();
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
	  
		try (
			BufferedWriter newBuff = Files.newBufferedWriter(Paths.get(outputFile), StandardCharsets.UTF_8, StandardOpenOption.CREATE);
		) {
			for (int i = 1; i <= n; i++) {
				newBuff.write(String.format("%1$.3f", ThreadLocalRandom.current().nextDouble(range)));
				newBuff.newLine();
			}
		} catch (Exception e) {
			 e.printStackTrace();
		}
	}
  
  private FileIoExamples() {} // Uninstantiatable class
}
