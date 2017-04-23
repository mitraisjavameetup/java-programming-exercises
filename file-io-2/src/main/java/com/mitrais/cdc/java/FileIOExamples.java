package com.mitrais.cdc.java;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FileIOExamples {
	
	public static String filename = "enable1-word-list.txt";
	public static List<String> testWords = Arrays.asList("foo", "bar", "baz12345678", "boo1234567");
	public static List<String> testWords2 = Arrays.asList("quit", "squid", "book", "bookkeeper", "keep", "steep");
	
	public static String print10LetterWord(Stream<String> words) {
		
		/* TO DO
		 * Print the first 10-letter word found.
		 *
		 */
		String result = words.filter(s -> s.length() == 10)
		       .findFirst().get();
		  return result;
	}

	public static String print10LetterWord(String filename) {
		
		/*
		 * TO DO
		 * Print the first 10-letter word found in the file.
		 * Use the StreamProcessor interface to avoid repetitive code in the file-processing method.
		 *
		 */
		String result = StreamProcessor.processFile(filename, lines -> print10LetterWord(lines));
		return result;
	}
	
	public static String printNLetterWord(Stream<String> words, int wordLength) {
		
		/*
		 * TO DO
		 * Print the first n-letter word found
		 * 
		 */
		String result = words.filter(s -> s.length() == wordLength)
			       .findFirst().orElse("No "+wordLength+"-letter word found");
		return result;
	}

	public static String printNLetterWord(String filename, int wordLength) {
		
		/*
		 * TO DO
		 * Do not hardcode the word length (i.e., 10 in the previous problem) 
		 * into the stream processing method.
		 * Instead, pass the word length into 
		 * both the stream-processing and file-processing methods
		 */
		String result = StreamAnalyzer.analyzeFile(filename, lines -> printNLetterWord(lines, wordLength));
		return result;
	}
			
			
	public static long numWordsContaining(Stream<String> words, String subString) {
		
		/*
		 * TO DO 
		 * Make methods that will print out the number of words containing a letter or substring
		 * 
		 */
		long result = words.filter(s -> s.contains(subString)).count();
		return result;
	}

	public static long numWordsContaining(String filename, String subString) {
		
		/*
		 * TO DO 
		 * Make methods that will print out the number of words containing a letter or substring
		 * use StreamAnalyzer interface to avoid repetitive code in the file-processing method.
		 * 
		 */
		long result = StreamAnalyzer.analyzeFile(filename, lines -> numWordsContaining(lines, subString));
		return result;
	}	
	
}
