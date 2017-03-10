package com.mitrais.cdc.java;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class PredicateUnitTest {
	
	@Test
	public void test() {
		///////To test Question 1
		List<String> words = Arrays.asList("hi", "hello", "hola", "bye", "goodbye", "adios");
	    
	    List<String> shortWords = StringUtils.allMatches(words, s -> s.length() < 4);
	    List<String> shortWordsExpected = Arrays.asList("hi", "bye");
	    assertEquals(shortWordsExpected, shortWords);

	    List<String> wordsWithB = StringUtils.allMatches(words, s -> s.contains("b"));
	    List<String> wordsWithBExpected = Arrays.asList("bye", "goodbye");
	    assertEquals(wordsWithBExpected, wordsWithB);

	    List<String> evenLengthWords = StringUtils.allMatches(words, s -> (s.length() % 2) == 0);
	    List<String> evenLengthWordsExpected = Arrays.asList("hi", "hola");
	    assertEquals(evenLengthWordsExpected, evenLengthWords);

	    
	    
	    //////To test Question 2
	    List<String> shortWords2 = ElementUtils.allMatches(words, s -> s.length() < 4);
	    assertEquals(shortWordsExpected, shortWords2);
	    
	    List<String> wordsWithB2 = ElementUtils.allMatches(words, s -> s.contains("b"));
	    assertEquals(wordsWithBExpected, wordsWithB2);
	    
	    List<String> evenLengthWords2 = ElementUtils.allMatches(words, s -> (s.length() % 2) == 0);
	    assertEquals(evenLengthWordsExpected, evenLengthWords2);
	    
	    List<Integer> nums = Arrays.asList(1, 10, 100, 1000, 10000);
	    List<Integer> bigNums = ElementUtils.allMatches(nums, n -> n>500);
	    List<Integer> bigNumsExpected = Arrays.asList(1000, 10000);
	    assertEquals(bigNumsExpected, bigNums);
	}
}
