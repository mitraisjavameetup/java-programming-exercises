package com.mitrais.cdc.java;

import static org.junit.Assert.*;

import org.junit.Test;

public class SortingExamplesTest {
	
	@Test
	public void sortedByLengthAscending() {
		
		String[] answer = {"hi", "bye", "hola", "hello", "adios", "goodbye"};
		assertArrayEquals(SortingExamples.sortedByLengthAscending(), answer);
	}
	
	@Test
	public void sortedByLengthDescending() {
		
		String[] answer = {"goodbye", "hello", "adios", "hola", "bye", "hi"};
		assertArrayEquals(SortingExamples.sortedByLengthDescending(), answer);
	}
	
	@Test
	public void sortedByFirstLetter() {
		
		String[] answer = {"adios", "bye", "goodbye","hi"};
		assertArrayEquals(SortingExamples.sortedByFirstLetter(), answer);
	}
	
	@Test
	public void sortedByContains() {
		
		String[] answer = {"hello", "adios", "hola", "hi"};
		assertArrayEquals(SortingExamples.sortedByContains(), answer);
	}

}
