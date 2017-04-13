package com.mitrais.cdc.java;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FileIOExamples {

	public static String filename = "enable1-word-list.txt";
	public static List<String> testWords = Arrays.asList("foo", "bar", "baz12345678", "boo1234567");
	public static List<String> testWords2 = Arrays.asList("quit", "squid", "book", "bookkeeper", "keep", "steep");

	public static String print10LetterWord(Stream<String> words) {

		/*
		 * TO DO Print the first 10-letter word found.
		 *
		 */

		return words.filter(w -> w.length() == 10)
				.findFirst()
				.orElse(null);
	}

	public static String print10LetterWord(String filename) {

		/*
		 * TO DO Print the first 10-letter word found in the file. Use the
		 * StreamProcessor interface to avoid repetitive code in the
		 * file-processing method.
		 *
		 */

		return StreamProcessor.processFile(filename, lines -> print10LetterWord(lines));
	}

	public static String printNLetterWord(Stream<String> words, int wordLength) {

		/*
		 * TO DO Print the first n-letter word found
		 * 
		 */
		return words.filter(w -> w.length() == wordLength)
				.findFirst()
				.orElse("No "+wordLength+"-letter word found");
	}

	public static String printNLetterWord(String filename, int wordLength) {

		/*
		 * TO DO Do not hardcode the word length (i.e., 10 in the previous
		 * problem) into the stream processing method. Instead, pass the word
		 * length into both the stream-processing and file-processing methods
		 */
		
		
		return StreamProcessor.processFile(filename, lines -> printNLetterWord(lines, wordLength));
	}

	public static long numWordsContaining(Stream<String> words, String subString) {

		/*
		 * TO DO Make methods that will print out the number of words containing
		 * a letter or substring
		 * 
		 */
		
		
		return words.filter(w -> w.contains(subString)).count();
	}

	public static long numWordsContaining(String filename, String subString) {

		/*
		 * TO DO Make methods that will print out the number of words containing
		 * a letter or substring use StreamAnalyzer interface to avoid
		 * repetitive code in the file-processing method.
		 * 
		 */
		return StreamAnalyzer.analyzeFile(filename, w -> numWordsContaining(w, subString));
	}

}
