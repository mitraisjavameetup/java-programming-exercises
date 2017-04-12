package com.mitrais.cdc.java;

import java.io.PrintStream;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExamples {

	public static List<String> words = Arrays.asList("hi", "hello", "hola", "bye", "goodbye", "adios");

	public static void printWordsWithSpace() {

		/*
		 * TO DO Loop down the words and print each on a separate line, with two
		 * spaces in front of each word. Don’t use map.
		 * 
		 */
		words.stream().forEach(e -> System.out.println("  " + e));
	}

	public static void printWordsNoSpace() {

		/*
		 * TO DO Repeat the previous problem, but without the two spaces in
		 * front. This is trivial if you use the same approach as in #1, so the
		 * point is to use a method reference here, as opposed to an explicit
		 * lambda in problem 1.
		 * 
		 */
		words.stream().forEach(e -> System.out.println(e));
	}

	public static List<String> excitingWordsStreams() {

		/*
		 * TO DO Produce the same lists as List<String> excitingWords =
		 * StringUtils.transformedList(words, s -> s + "!"); but this time use
		 * streams and the builtin “map” method.
		 * 
		 */
		List<String> excitingWords = words.stream().map(e -> e + "!").collect(Collectors.toList());
		return excitingWords;
	}

	public static List<String> eyeWordsStreams() {

		/*
		 * TO DO Produce the same lists as List<String> eyeWords =
		 * StringUtils.transformedList(words, s -> s.replace("i", "eye")); but
		 * this time use streams and the builtin “map” method.
		 * 
		 */
		List<String> eyeWordsStreams = words.stream().map(e -> e.replace("i", "eye")).collect(Collectors.toList());
		return eyeWordsStreams;
	}

	public static List<String> upperCaseWordsStreams() {

		/*
		 * TO DO Produce the same lists as List<String> upperCaseWords =
		 * StringUtils.transformedList(words, String::toUpperCase); but this
		 * time use streams and the builtin “map” method.
		 * 
		 */
		List<String> upperCaseWordsStreams = words.stream().map(String::toUpperCase).collect(Collectors.toList());
		return upperCaseWordsStreams;
	}

	public static List<String> shortWordsStreams() {

		/*
		 * TO DO Produce the same lists as List<String> shortWords =
		 * StringUtils.allMatches(words, s -> s.length() < 4); but this time use
		 * “filter”
		 * 
		 */
		List<String> shortWordsStreams = words.stream().filter(s -> s.length() < 4).collect(Collectors.toList());
		return shortWordsStreams;
	}

	public static List<String> wordsWithBStreams() {

		/*
		 * TO DO Produce the same lists as List<String> wordsWithB =
		 * StringUtils.allMatches(words, s -> s.contains("b")); but this time
		 * use “filter”
		 * 
		 */
		List<String> wordsWithBStreams = words.stream().filter(s -> s.contains("b")).collect(Collectors.toList());
		return wordsWithBStreams;
	}

	public static List<String> evenLengthWords() {

		/*
		 * TO DO Produce the same lists as List<String> wordsWithB =
		 * StringUtils.allMatches(words, s -> s.contains("b")); but this time
		 * use “filter”
		 * 
		 */
		List<String> evenLengthWords = words.stream().filter(s -> (s.length() % 2)==0).collect(Collectors.toList());
		return evenLengthWords;
	}

	public static String firstFunnyString(String containedTest) {

		/*
		 * TO DO Turn the strings into uppercase, keep only the ones that are
		 * shorter than 4 characters, of what is remaining, keep only the ones
		 * that contain containedTest arg, and return string "No Match" when no
		 * result.
		 */
		String firstFunnyStrings = words.stream().map(String::toUpperCase).filter(s -> s.length() < 4).filter(s -> s.contains(containedTest)).findFirst().orElse("No match");
		return firstFunnyStrings;
	}

	public static String[] wordsAsArray() {

		/*
		 * TO DO Create output the final result of words as an array instead of
		 * a List
		 * 
		 */
		String[] wordsAsArray = words.stream().toArray(String[]::new);
		return wordsAsArray;
	}

}
