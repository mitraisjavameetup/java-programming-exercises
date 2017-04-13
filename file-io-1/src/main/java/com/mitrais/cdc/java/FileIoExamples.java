package com.mitrais.cdc.java;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.List;

public class FileIoExamples {
  
  public static String nLetterWord(String inputFile, int wordLength) throws Exception {
	  
	  /* 
	   * TO DO
	   * Print the first 10-letter word found in the file.
	   * 
	   */
	String word = Files.lines(Paths.get(inputFile)).filter(w -> w.length() == 10).findFirst().orElse(null);
    return word;
  }
  
  public static String abcWord(String inputFile) throws Exception {
	  
	  /*
	   * TO DO
	   * Print the first 8-letter word that contains “a”, “b”, and “c”.
	   * 
	   */
	 String word = Files.lines(Paths.get(inputFile)).filter(w -> w.length() == 8).filter(w->w.contains("a")).filter(w->w.contains("b")).filter(w->w.contains("c")).findFirst().orElse(null);
    return word;
  }
  
  public static String abcWordMixedCase(String inputFile) throws Exception {
	  
	  /*
	   * TO DO
	   * Repeat the previous problem, but handle the possibility of mixed-case words in the file.
	   * Hint: do something shorter than merely modifying your filter tests to include “A”, “B”, and “C”. 
	   * 
	   */
	  String word = Files.lines(Paths.get(inputFile)).map(String::toLowerCase).filter(w -> w.length() == 8).filter(w->w.contains("a")).filter(w->w.contains("b")).filter(w->w.contains("c")).findFirst().orElse(null);
    return word;
  }
  
  public static String longestWordWithout(String inputFile, String letter1, String letter2) throws Exception {
	  
	  /*
	   * TO DO 
	   * Print the longest English word that contains neither “a” nor “e”.
	   * 
	   * 
	   */
	  String word = Files.lines(Paths.get(inputFile)).map(String::toLowerCase).sorted((a,b)-> b.length() - a.length()).filter(w->!w.contains(letter1)).filter(w->!w.contains(letter2)).findFirst().orElse(null);
    return word;
  }
  
  public static String shortestWordWith(String inputFile, String letter) throws Exception {
	  
	  /*
	   * TO DO
	   * Print the shortest English word that contains a “q”
	   * 
	   */
	  String word = Files.lines(Paths.get(inputFile)).map(String::toLowerCase).sorted((a,b)-> a.length() - b.length()).filter(w->w.contains(letter)).findFirst().orElse(null);
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
	  List<String> words = Files.lines(Paths.get(inputFile)).map(String::toUpperCase).filter(w->w.contains("WOW") || w.contains("COOL")).collect(Collectors.toList());
	  Path path = Paths.get(outputFile);
	  try(PrintWriter out = new PrintWriter(Files.newBufferedWriter(path, Charset.defaultCharset()))){
		  for(String word : words){
			  out.printf("%s!\n",word);
		  }
	  }catch(IOException io){
		  System.out.println(io);
	  }
  }
  
  public static long numPathsInProject() throws Exception {
	  long numberPath = 0;
	  /*
	   * TO DO
	   * Print out the number of files in your Eclipse project.
	   * Folders count as files. 
	   * 
	   */  
	  try(Stream<Path> paths = Files.list(Paths.get("."))){
		  numberPath= paths.count();
	  }catch(IOException io){
		  
	  }
    return numberPath;
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
	  List<Double> doubleList = Stream.generate(()-> Math.random()*range).limit(n).collect(Collectors.toList());
	  Path path = Paths.get(outputFile);
	  try{
		  PrintWriter out = new PrintWriter(Files.newBufferedWriter(path, Charset.defaultCharset()));
		  for(Double d : doubleList){
			  out.printf("%5.3f%n",d);
		  }
		  out.close();
	  }catch(IOException io){
		  System.out.println(io);
	  }
  }
  
  private FileIoExamples() {} // Uninstantiatable class
}
