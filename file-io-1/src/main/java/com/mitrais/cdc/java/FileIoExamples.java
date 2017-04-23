package com.mitrais.cdc.java;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FileIoExamples {

    public static String nLetterWord(String inputFile, int wordLength) throws Exception {

	  /* 
	   * TO DO
	   * Print the first 10-letter word found in the file.
	   * 
	   */

        return Files.lines(Paths.get(inputFile)).filter(n -> n.length() == wordLength).findFirst().orElse(null);

    }

    public static String abcWord(String inputFile) throws Exception {
	  
	  /*
	   * TO DO
	   * Print the first 8-letter word that contains “a”, “b”, and “c”.
	   * 
	   */

        return Files.lines(Paths.get(inputFile)).filter(n -> (n.contains("a") && n.contains("b") && n.contains("c")) && n.length() == 8).findFirst().orElse(null);

    }

    public static String abcWordMixedCase(String inputFile) throws Exception {
	  
	  /*
	   * TO DO
	   * Repeat the previous problem, but handle the possibility of mixed-case words in the file.
	   * Hint: do something shorter than merely modifying your filter tests to include “A”, “B”, and “C”. 
	   * 
	   */

        return Files.lines(Paths.get(inputFile))
                .map(String::toLowerCase)
                .filter(n -> (Pattern.compile("a.*b.*c").matcher(n).find()) && n.length() == 8)
                .findFirst().orElse(null);
    }

    public static String longestWordWithout(String inputFile, String letter1, String letter2) throws Exception {
	  
	  /*
	   * TO DO 
	   * Print the longest English word that contains neither “a” nor “e”.
	   * 
	   */

        return Files.lines(Paths.get(inputFile))
                .map(String::toLowerCase)
                .filter(n -> !n.contains(letter1) && !n.contains(letter2))
                .max((s1,s2)->s1.length() - s2.length()).get();
    }

    public static String shortestWordWith(String inputFile, String letter) throws Exception {
	  
	  /*
	   * TO DO
	   * Print the shortest English word that contains a “q”
	   * 
	   */

        return Files.lines(Paths.get(inputFile)).map(String::toLowerCase).filter(n -> n.contains(letter)).min((s1,s2) -> s1.length() - s2.length()).get();
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

        List<String> collect = Files.lines(Paths.get(inputFile))
                .filter(n -> Pattern.compile("(wow|cool)").matcher(n).find())
                .map(n -> n.toUpperCase() + "!")
                .sorted((s1,s2) -> s1.charAt(0) - s2.charAt(0))
                .collect(Collectors.toList());
        
        Files.write(Paths.get(outputFile), collect, Charset.defaultCharset());

    }

    public static long numPathsInProject() throws Exception {
	  
	  /*
	   * TO DO
	   * Print out the number of files in your Eclipse project.
	   * Folders count as files. 
	   * 
	   */

	  int counter = 0;
        try(Stream<Path> paths = Files.walk(Paths.get(""))) {
            counter = (int) paths.count();
        }

        return counter;
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

	  try (PrintWriter pw = new PrintWriter(Files.newBufferedWriter(Paths.get(outputFile)))) {
            for(int i = 0; i < n; i++) {
                pw.println(ThreadLocalRandom.current().nextDouble(0, range + 1));
            }
      } catch (IOException e) {
          e.printStackTrace();
      }

    }

    private FileIoExamples() {
    } // Uninstantiatable class
}
