package com.mitrais.cdc.java;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class FileIoExamples {

	public static String nLetterWord(String inputFile, int wordLength) throws Exception {

		/*
		 * TO DO Print the first 10-letter word found in the file.
		 * 
		 */
		
		return Files.lines(Paths.get(inputFile))
				.filter(w -> w.length() == wordLength)
				.findFirst()
				.orElse(null);
	}

	public static String abcWord(String inputFile) throws Exception {

		/*
		 * TO DO Print the first 8-letter word that contains “a”, “b”, and “c”.
		 * 
		 */
		return Files.lines(Paths.get(inputFile))
				.filter(w -> w.length() == 8)
				.filter(w -> w.contains("a"))
				.filter(w -> w.contains("b"))
				.filter(w -> w.contains("c"))
				.findFirst()
				.orElse(null);
	}

	public static String abcWordMixedCase(String inputFile) throws Exception {

		/*
		 * TO DO Repeat the previous problem, but handle the possibility of
		 * mixed-case words in the file. Hint: do something shorter than merely
		 * modifying your filter tests to include “A”, “B”, and “C”.
		 * 
		 */
		return Files.lines(Paths.get(inputFile))
				.filter(w -> w.length() == 8)
				.filter(w -> w.toUpperCase().contains("A"))
				.filter(w -> w.toUpperCase().contains("B"))
				.filter(w -> w.toUpperCase().contains("C"))
				.findFirst()
				.orElse(null);
	}

	public static String longestWordWithout(String inputFile, String letter1, String letter2) throws Exception {

		/*
		 * TO DO Print the longest English word that contains neither “a” nor
		 * “e”.
		 * 
		 */
		String longestWord = Files.lines(Paths.get(inputFile))
				.filter(w -> !w.contains(letter1))
				.filter(w -> !w.contains(letter2))
				.max((s1, s2) -> s1.length() - s2.length()).get();
		
		System.out.printf("Longest English word that contains neiter %s nor %s : %s.%n"
				, letter1
				, letter2
				, longestWord);
		
		return longestWord;
	}

	public static String shortestWordWith(String inputFile, String letter) throws Exception {

		/*
		 * TO DO Print the shortest English word that contains a “q”
		 * 
		 */
		String shortestWord = Files.lines(Paths.get(inputFile))
				.filter(w -> w.contains(letter))
				.min((s1, s2) -> s1.length() - s2.length()).get();
		
		System.out.printf("Shortest English word that contain  %s : %s.%n"
				, letter
				, shortestWord);
		
		return shortestWord;
	}

	public static void storeTwitterList(String inputFile, String outputFile) throws Exception {

		/*
		 * TO DO Make a file called “twitter-words.txt” that contains all words
		 * from the enable1-word-list.txt list that contain “wow” or “cool”. The
		 * words should be sorted, in uppercase, and have an exclamation point
		 * at the end. (E.g., “COOLER!”).
		 * 
		 */
		
		List<String> input = Files.lines(Paths.get(inputFile))
				.filter(w -> w.contains("wow") || w.contains("cool"))
				.map(n -> n.toUpperCase()+"!")
				.sorted()
				.collect(Collectors.toList());
		
		Files.write(Paths.get(outputFile), input, Charset.defaultCharset());
	}

	public static long numPathsInProject() throws Exception {

		/*
		 * TO DO Print out the number of files in your Eclipse project. Folders
		 * count as files.
		 * 
		 */
		long total = Files.list(Paths.get("")).count();
		
		System.out.printf("Number of files (folders count as files) : %s %n", total);
		
		return total;
	}

	public static void storeNums(int n, int range, String outputFile) {

		/*
		 * TO DO Create a file containing 17 random doubles between 0 and 100,
		 * each with exactly three digits after the decimal point. Note that the
		 * file will not actually be written until you close the PrintWriter.
		 * So, although you probably have mostly been ignoring exceptions, for
		 * this problem you might as well declare the PrintStream using the
		 * try-with-resources approach shown in the lecture. Not only will this
		 * handle the exceptions explicitly, but it will also automatically
		 * close the PrintStream at the end.
		 * 
		 */
		
		try (PrintWriter out =
			      new PrintWriter(Files.newBufferedWriter(
			    		  Paths.get(outputFile)
			    		  ,Charset.defaultCharset()))){
			
			for (int i = 0; i < n; i++) {
				
				out.printf("Number is %5.3f%n", 100 * Math.random());
			}
			
		} catch (IOException ioe) {
			// TODO: handle exception
			System.err.printf("IOException: %s%n", ioe);
		}
	}

	private FileIoExamples() {
	} // Uninstantiatable class
}
