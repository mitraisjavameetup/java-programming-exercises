package com.mitrais.cdc.java;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FileIOExamples {
	
	public static String filename = "enable1-word-list.txt";
	public static List<String> testWords = Arrays.asList("foo", "bar", "baz12345678", "boo1234567");
	public static List<String> testWords2 = Arrays.asList("quit", "squid", "book", "bookkeeper", "keep", "steep");
	
	public static String print10LetterWord(Stream<String> words) {
		  
		String tenWord =words.filter(s -> s.length() == 10).findFirst().orElse(null);
		  
		/* TO DO
		 * Print the first 10-letter word found.
		 *
		 */
		return tenWord;
	}

	public static String print10LetterWord(String filename) {
		String tenWord = StreamProcessor.processFile(filename, FileIOExamples::print10LetterWord);
		/*
		 * TO DO
		 * Print the first 10-letter word found in the file.
		 * Use the StreamProcessor interface to avoid repetitive code in the file-processing method.
		 *
		 */
		return tenWord;
	}
	
	public static String printNLetterWord(Stream<String> words, int wordLength) {
		
		String nWord = words.filter(s -> s.length() == wordLength).findFirst().orElse("No " + wordLength + "-letter word found");
		/*
		 * TO DO
		 * Print the first n-letter word found
		 * 
		 */
		return nWord;
	}

	public static String printNLetterWord(String filename, int wordLength) {
		
		String nWord = StreamProcessor.processFile(filename, lines -> printNLetterWord(lines, wordLength));
		/*
		 * TO DO
		 * Do not hardcode the word length (i.e., 10 in the previous problem) 
		 * into the stream processing method.
		 * Instead, pass the word length into 
		 * both the stream-processing and file-processing methods
		 */
		return nWord;
	}
			
			
	public static long numWordsContaining(Stream<String> words, String subString) {
		long numWords = words.filter(s -> s.contains(subString)).count();
		/*
		 * TO DO 
		 * Make methods that will print out the number of words containing a letter or substring
		 * 
		 */
		return numWords;
	}

	public static long numWordsContaining(String filename, String subString) {
		long numWords = StreamAnalyzer.analyzeFile(filename, words -> numWordsContaining(words, subString));
		/*
		 * TO DO 
		 * Make methods that will print out the number of words containing a letter or substring
		 * use StreamAnalyzer interface to avoid repetitive code in the file-processing method.
		 * 
		 */
		return numWords;
	}	
	
}
