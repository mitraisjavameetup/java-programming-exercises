package com.mitrais.cdc.java;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.stream.Stream;

public class FileIoExamples {
  
  public static String nLetterWord(String inputFile, int wordLength) throws Exception {
	  
	  /* 
	   * TO DO
	   * Print the first 10-letter word found in the file.
	   * 
	   */
	  Stream<String> content = Files.lines(Paths.get(inputFile));
    return content.filter(e -> e.length() == wordLength).findFirst().get();
  }
  
  public static String abcWord(String inputFile) throws Exception {
	  
	  /*
	   * TO DO
	   * Print the first 8-letter word that contains “a”, “b”, and “c”.
	   * 
	   */
	  Stream<String> content = Files.lines(Paths.get(inputFile));
    return content.filter(e->e.length() == 8).filter(e->e.contains("a") && e.contains("b") && e.contains("c")).findFirst().get();
  }
  
  public static String abcWordMixedCase(String inputFile) throws Exception {
	  
	  /*
	   * TO DO
	   * Repeat the previous problem, but handle the possibility of mixed-case words in the file.
	   * Hint: do something shorter than merely modifying your filter tests to include “A”, “B”, and “C”. 
	   * 
	   */
	  Stream<String> content = Files.lines(Paths.get(inputFile));
	  return content.map(String::toLowerCase).filter(e->e.contains("a") && e.contains("b") && e.contains("c") && e.length() == 8).findFirst().get();
  }
  
  public static String longestWordWithout(String inputFile, String letter1, String letter2) throws Exception {
	  
	  /*
	   * TO DO 
	   * Print the longest English word that contains neither “a” nor “e”.
	   * 
	   */
	  Stream<String> content = Files.lines(Paths.get(inputFile));
	  return content.filter(e->!e.contains(letter1) && !e.contains(letter2)).max(Comparator.comparingInt(String::length)).get();
  }
  
  public static String shortestWordWith(String inputFile, String letter) throws Exception {
	  
	  /*
	   * TO DO
	   * Print the shortest English word that contains a “q”
	   * 
	   */
	  Stream<String> content = Files.lines(Paths.get(inputFile));
	  return content.filter(e->e.contains(letter)).min(Comparator.comparingInt(String::length)).get();
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
	 Stream<String> content = Files.lines(Paths.get(inputFile)).filter(e->e.contains("wow")|e.contains("cool")).map(String::toUpperCase);
	 try (PrintWriter out = new PrintWriter(Files.newBufferedWriter(Paths.get(outputFile), Charset.defaultCharset())))
     {
       content.forEach(e-> out.printf("%s!%n", e));
     }
     catch (IOException ioe)
     {
       System.out.printf("%s.%n", ioe);
     }
  }
  
  public static long numPathsInProject() throws Exception {
	  
	  /*
	   * TO DO
	   * Print out the number of files in your Eclipse project.
	   * Folders count as files. 
	   * 
	   */
	  try (Stream<Path> root = Files.walk(Paths.get("./")))
      {
        return root.count();
      }
      catch (IOException ioe)
      {
        System.out.printf("%s.%n", ioe);
      }
    return 0;
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
	  double random;
	  try(PrintWriter out = new PrintWriter(Files.newBufferedWriter(Paths.get(outputFile), Charset.defaultCharset())))
      {
        for (int i = 0; i < n; i++)
        {
          random = Math.random() * range;
          out.printf("%.3f%n", random);
        }
      }
      catch(IOException ioe)
      {
        System.out.printf("%s.%n", ioe);
      }
  }
  
  private FileIoExamples() {} // Uninstantiatable class
}
