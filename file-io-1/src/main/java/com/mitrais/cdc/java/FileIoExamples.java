package com.mitrais.cdc.java;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;
/**
 * 
 * @author trainee
 * FileToExamples Class
 */
public class FileIoExamples {
  /**
   * 
   * @param inputFile
   * @param wordLength
   * @return String
   * @throws Exception
   */
  public static String nLetterWord(String inputFile, int wordLength) throws Exception {
	  
	  /* 
	   * TO DO
	   * Print the first 10-letter word found in the file.
	   * 
	   */
	  Path path=Paths.get(inputFile);
	  String result=Files.lines(path).filter(s->s.length()==wordLength).findFirst().orElse(null);
    return result;
  }
  /**
   * 
   * @param inputFile
   * @return String
   * @throws Exception
   */
  public static String abcWord(String inputFile) throws Exception {
	  
	  /*
	   * TO DO
	   * Print the first 8-letter word that contains “a”, “b”, and “c”.
	   * 
	   */
	  
	  Path path=Paths.get(inputFile);
	  String result=Files.lines(path).filter(s->s.length()==8).filter(s->s.contains("a")).filter(s->s.contains("b")).filter(s->s.contains("c")).findFirst().orElse(null);
	  return result;
  }
  /**
   * 
   * @param inputFile
   * @return String
   * @throws Exception
   */
  public static String abcWordMixedCase(String inputFile) throws Exception {
	  
	  /*
	   * TO DO
	   * Repeat the previous problem, but handle the possibility of mixed-case words in the file.
	   * Hint: do something shorter than merely modifying your filter tests to include “A”, “B”, and “C”. 
	   * 
	   */
	  Path path=Paths.get(inputFile);
	  String result=Files.lines(path).map(String::toLowerCase).filter(s->s.length()==8).filter(s->s.contains("a")).filter(s->s.contains("b")).filter(s->s.contains("c")).findFirst().orElse(null);
	  return result;
  }
  /**
   * 
   * @param inputFile
   * @param letter1
   * @param letter2
   * @return String
   * @throws Exception
   */
  public static String longestWordWithout(String inputFile, String letter1, String letter2) throws Exception {
	  
	  /*
	   * TO DO 
	   * Print the longest English word that contains neither “a” nor “e”.
	   * 
	   */
	  Path path=Paths.get(inputFile);
	  String result=Files.lines(path).filter(s->!s.contains(letter1)).filter(s->!s.contains(letter2)).max((x,y)->Integer.compare(x.length(), y.length())).get();
	  return result;
  }
  /**
   * 
   * @param inputFile
   * @param letter
   * @return String
   * @throws Exception
   */
  public static String shortestWordWith(String inputFile, String letter) throws Exception {
	  
	  /*
	   * TO DO
	   * Print the shortest English word that contains a “q”
	   * 
	   */
	  Path path=Paths.get(inputFile);
	  String result=Files.lines(path).filter(s->s.contains(letter)).min((x,y)->Integer.compare(x.length(), y.length())).get();
	  return result;
  }
  /**
   * 
   * @param inputFile
   * @param outputFile
   * @throws Exception
   */
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
	  Path path=Paths.get(inputFile);
	  Path output=Paths.get(outputFile);
	  List<String> lines=Files.lines(path).filter(s->s.contains("wow")||s.contains("cool")).map(String::toUpperCase).sorted().collect(Collectors.toList());
	  try(BufferedWriter writer=Files.newBufferedWriter(output, Charset.defaultCharset())){
		  for(String l:lines){
			  writer.write(l+"!");
			  writer.newLine();
		  }
	  }
	  catch (IOException ioe) {
		  System.err.printf("IOException: %s%n", ioe);
	}
  }
  /**
   * 
   * @return long
   * @throws Exception
   */
  public static long numPathsInProject() throws Exception {
	  
	  /*
	   * TO DO
	   * Print out the number of files in your Eclipse project.
	   * Folders count as files. 
	   * 
	   */ 
	  long result=0;
	  try(Stream<Path> paths = Files.list(Paths.get("./"))) {
	        result=paths.count();
	      } catch(IOException ioe) {
	        System.err.println("IOException: " + ioe);
	      }
    return result;
  }
  /**
   * 
   * @param n
   * @param range
   * @param outputFile
   */
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
	  Path output=Paths.get(outputFile);
	  try(PrintWriter out=new PrintWriter(Files.newBufferedWriter(output, Charset.defaultCharset()))){
		  for(int i=0;i<n;i++){
			  out.printf("%.3f%n", 100*Math.random());
		  }
	  }catch(IOException ioe){
		  System.err.printf("IOException: %s%n", ioe);
	  }
  }
  
  private FileIoExamples() {} // Uninstantiatable class
}
