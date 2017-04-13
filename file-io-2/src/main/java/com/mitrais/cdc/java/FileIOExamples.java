package com.mitrais.cdc.java;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
/**
 * 
 * @author trainee
 * FileIOExamples
 */
public class FileIOExamples {
	
	public static String filename = "enable1-word-list.txt";
	public static List<String> testWords = Arrays.asList("foo", "bar", "baz12345678", "boo1234567");
	public static List<String> testWords2 = Arrays.asList("quit", "squid", "book", "bookkeeper", "keep", "steep");
	/**
	 * 
	 * @param words
	 * @return String
	 */
	public static String print10LetterWord(Stream<String> words) {
		
		/* TO DO
		 * Print the first 10-letter word found.
		 *
		 */
		String word=words.filter(s->s.length()==10).findFirst().orElse(null);
		System.out.println(word);
		return word;
	}
/**
 * 
 * @param filename
 * @return String
 */
	public static String print10LetterWord(String filename) {
		
		/*
		 * TO DO
		 * Print the first 10-letter word found in the file.
		 * Use the StreamProcessor interface to avoid repetitive code in the file-processing method.
		 *
		 */
		return StreamProcessor.processFile(filename,FileIOExamples::print10LetterWord);
		
	}
	/**
	 * 
	 * @param words
	 * @param wordLength
	 * @return String
	 */
	public static String printNLetterWord(Stream<String> words, int wordLength) {
		
		/*
		 * TO DO
		 * Print the first n-letter word found
		 * 
		 */
		String word=words.filter(s->s.length()==wordLength).findFirst().orElse("No "+wordLength+"-letter word found");
		System.out.println(word);
		return word;
	}
	/**
	 * 
	 * @param filename
	 * @param wordLength
	 * @return String
	 */
	public static String printNLetterWord(String filename, int wordLength) {
		
		/*
		 * TO DO
		 * Do not hardcode the word length (i.e., 10 in the previous problem) 
		 * into the stream processing method.
		 * Instead, pass the word length into 
		 * both the stream-processing and file-processing methods
		 */
		/*
		String result=null;
		try(Stream<String> words=Files.lines(Paths.get(filename))){
			result=printNLetterWord(filename, wordLength);
		}catch(IOException ioe){
			System.err.println("Error reading file: " + ioe);
		}
		return result;*/
		return StreamProcessor.processFile(filename, line->printNLetterWord(line, wordLength));
		
	}
			
	/**
	 * 
	 * @param words
	 * @param subString
	 * @return long
	 */
	public static long numWordsContaining(Stream<String> words, String subString) {
		
		/*
		 * TO DO 
		 * Make methods that will print out the number of words containing a letter or substring
		 * 
		 */
		long result=words.filter(s->s.contains(subString)).count();
		System.out.println(result);
		return result;
	}
	/**
	 * 
	 * @param filename
	 * @param subString
	 * @return long
	 */
	public static long numWordsContaining(String filename, String subString) {
		
		/*
		 * TO DO 
		 * Make methods that will print out the number of words containing a letter or substring
		 * use StreamAnalyzer interface to avoid repetitive code in the file-processing method.
		 * 
		 */
		return StreamAnalyzer.analyzeFile(filename, line->numWordsContaining(line, subString));
		
	}	
	
}
