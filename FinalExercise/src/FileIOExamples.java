

import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import java.util.Scanner;

public class FileIOExamples {
	
	public static String filename = "enable1-word-list.txt";
	public static List<String> testWords = Arrays.asList("foo", "bar", "baz12345678", "boo1234567");
	public static List<String> testWords2 = Arrays.asList("quit", "squid", "book", "bookkeeper", "keep", "steep");
	
	public static String print10LetterWord(Stream<String> words) {
		
		return words
				.filter(s -> s.length() == 10)
	    		.findFirst().orElse(null);
				
	}


	public static String print10LetterWord(String filename) {
		
		return StreamProcessor
				.processFile(filename, s -> print10LetterWord(s));
	    		
	}
	
	public static String printNLetterWord(Stream<String> words, int wordLength) {
		
		return words
				.filter(s -> s.length() == wordLength )
				.findFirst().orElse("No " + wordLength+ "-letter word found");
				
				
	}

	public static String printNLetterWord(String filename, int wordLength) {
		
		return StreamProcessor
				.processFile(filename, s -> printNLetterWord(s, wordLength) );
	}
			
			
	public static long numWordsContaining(Stream<String> words, String subString) {
		
		
		return words
				.filter(s -> s.contains(subString))
				.count();
	}

	public static long numWordsContaining(String filename, String subString) {
		
		
		return StreamAnalyzer
				.analyzeFile(filename, s -> numWordsContaining(s, subString));
	}	
	
}
	