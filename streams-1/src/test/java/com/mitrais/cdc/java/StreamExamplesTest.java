package com.mitrais.cdc.java;


import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class StreamExamplesTest {	
	
	@Test
	public void excitingWordsStreams() throws Exception {
		StreamExamples.printWordsWithSpace();
		List<String> excitingWordsStreams = Arrays.asList("hi!", "hello!", "hola!", "bye!", "goodbye!", "adios!");
		assertEquals(StreamExamples.excitingWordsStreams(), excitingWordsStreams);
		StreamExamples.printWordsNoSpace();
		
	}
	
	@Test
	public void eyeWordsStreams() throws Exception {
		
		List<String> eyeWordsStreams = Arrays.asList("heye", "hello", "hola", "bye", "goodbye", "adeyeos");
		assertEquals(StreamExamples.eyeWordsStreams(), eyeWordsStreams);
	}
	
	@Test
	public void upperCaseWordsStreams() throws Exception {
		
		List<String> upperCaseWordsStreams = Arrays.asList("HI", "HELLO", "HOLA", "BYE", "GOODBYE", "ADIOS");
		assertEquals(StreamExamples.upperCaseWordsStreams(), upperCaseWordsStreams);
	}
	
	@Test
	public void shortWordsStreams() throws Exception {
		
		List<String> shortWordsStreams = Arrays.asList("hi", "bye");
		assertEquals(StreamExamples.shortWordsStreams(), shortWordsStreams);
	}
	
	@Test
	public void wordsWithBStreams() throws Exception {
		
		List<String> wordsWithBStreams = Arrays.asList("bye", "goodbye");
		assertEquals(StreamExamples.wordsWithBStreams(), wordsWithBStreams);
	}
	
	@Test
	public void evenLengthWords() throws Exception {
		
		List<String> evenLengthWords = Arrays.asList("hi", "hola");
		assertEquals(StreamExamples.evenLengthWords(), evenLengthWords);
	}
	
	@Test
	public void firstFunnyString() {
		
		assertEquals(StreamExamples.firstFunnyString("E"), "BYE");
		assertEquals(StreamExamples.firstFunnyString("Q"), "No match");
	}
	
	@Test
	public void wordsAsArray(){
		
		String[] expecteds = new String[] {"hi", "hello", "hola", "bye", "goodbye", "adios"};
		assertArrayEquals(StreamExamples.wordsAsArray(), expecteds);		
	}
	
}
