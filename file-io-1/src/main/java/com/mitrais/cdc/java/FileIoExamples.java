package com.mitrais.cdc.java;

import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

import static java.util.Comparator.comparingInt;
import static java.util.Comparator.naturalOrder;

import java.io.PrintWriter;

public class FileIoExamples {

	public static String nLetterWord(String inputFile, int wordLength) throws Exception {

		/*
		 * TO DO Print the first 10-letter word found in the file.
		 * 
		 */
		return Files.lines(Paths.get(inputFile)).filter(s -> s.length() == wordLength).findFirst().orElse(null);
	}

	public static String abcWord(String inputFile) throws Exception {

		/*
		 * TO DO Print the first 8-letter word that contains “a”, “b”, and “c”.
		 * 
		 */
		return Files.lines(Paths.get(inputFile))
				.filter(s -> s.length() == 8 && s.contains("a") && s.contains("b") && s.contains("c")).findFirst()
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
				.filter(s -> s.length() == 8 && s.contains("a") && s.contains("b") && s.contains("c")).findFirst()
				.orElse(null);
	}

	public static String longestWordWithout(String inputFile, String letter1, String letter2) throws Exception {

		/*
		 * TO DO Print the longest English word that contains neither “a” nor
		 * “e”.
		 * 
		 */
		return Files.lines(Paths.get(inputFile))
				.filter(s -> s.length() > 0 && !s.contains(letter1) && !s.contains(letter2)).distinct()
				.sorted(comparingInt(String::length).reversed()).findFirst().orElse(null);
	}

	public static String shortestWordWith(String inputFile, String letter) throws Exception {

		/*
		 * TO DO Print the shortest English word that contains a “q”
		 * 
		 */
		return Files.lines(Paths.get(inputFile)).filter(s -> s.length() > 0 && s.contains("q")).distinct()
				.sorted(comparingInt(String::length)).findFirst().orElse(null);
	}

	public static void storeTwitterList(String inputFile, String outputFile) throws Exception {

		/*
		 * TO DO Make a file called “twitter-words.txt” that contains all words
		 * from the enable1-word-list.txt list that contain “wow” or “cool”. The
		 * words should be sorted, in uppercase, and have an exclamation point
		 * at the end. (E.g., “COOLER!”).
		 * 
		 */
		List<String> result = Files.lines(Paths.get(inputFile)).filter(s -> s.contains("wow") || s.contains("cool"))
				.map(x -> x.toUpperCase()).map(x -> x + "!").distinct().collect(Collectors.toList());

		Files.write(Paths.get(outputFile), result);
	}

	public static long numPathsInProject() throws Exception {

		/*
		 * TO DO Print out the number of files in your Eclipse project. Folders
		 * count as files.
		 * 
		 */
		return Files.list(Paths.get("./")).count();
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
		Charset charcterSet = Charset.defaultCharset();
		Path path = Paths.get(outputFile);
		try (PrintWriter out = new PrintWriter(Files.newBufferedWriter(path, charcterSet))) {
			for (int i = 0; i < n; i++) {
				out.printf("%.3f%n", new Random().nextDouble() * range);
			}

		} catch (Exception e) {
			System.err.printf("IOException: %s%n", e);
		}

	}

	private FileIoExamples() {
	} // Uninstantiatable class
}
