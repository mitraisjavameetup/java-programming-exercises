package com.mitrais.cdc.java;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class FunctionUnitTest {
	
	@Test
	public void test() {
		
		///////To test Question 3
		List<String> words = Arrays.asList("hi", "hello", "hola", "bye", "goodbye", "adios");
	    
	    List<String> excitingWords = StringUtils.transformedList(words, s -> s + "!");
	    List<String> excitingWordsExpected = Arrays.asList("hi!", "hello!", "hola!", "bye!", "goodbye!", "adios!");
	    assertEquals(excitingWordsExpected, excitingWords);
	    
	    List<String> eyeWords = StringUtils.transformedList(words, s -> s.replace("i", "eye"));
	    List<String> eyeWordsExpected = Arrays.asList("heye", "hello", "hola", "bye", "goodbye", "adeyeos");
	    assertEquals(eyeWordsExpected, eyeWords);
	    
	    List<String> upperCaseWords = StringUtils.transformedList(words, String::toUpperCase);
	    List<String> upperCaseWordsOther = StringUtils.transformedList(words, s -> s.toUpperCase());
	    List<String> upperCaseWordsExpected = Arrays.asList("HI", "HELLO", "HOLA", "BYE", "GOODBYE", "ADIOS");
	    assertEquals(upperCaseWordsExpected, upperCaseWords);
	    assertEquals(upperCaseWordsExpected, upperCaseWordsOther);
	    
	    
	    
	    //////To test Question 4
	    List<String> excitingWords2 = ElementUtils.transformedList(words, s -> s + "!");
	    assertEquals(excitingWordsExpected, excitingWords2);
	    
	    List<String> eyeWords2 = ElementUtils.transformedList(words, s -> s.replace("i", "eye"));
	    assertEquals(eyeWordsExpected, eyeWords2);
	    
	    List<String> upperCaseWords2 = ElementUtils.transformedList(words, String::toUpperCase);
	    List<String> upperCaseWordsOther2 = ElementUtils.transformedList(words, s -> s.toUpperCase());
	    assertEquals(upperCaseWordsExpected, upperCaseWords2);
	    assertEquals(upperCaseWordsExpected, upperCaseWordsOther2);
	    
	    List<Integer> wordLengths = ElementUtils.transformedList(words, String::length);
	    List<Integer> wordLengthsExpected = Arrays.asList(2, 5, 4, 3, 7, 5);
	    assertEquals(wordLengthsExpected, wordLengths);
	}
}
