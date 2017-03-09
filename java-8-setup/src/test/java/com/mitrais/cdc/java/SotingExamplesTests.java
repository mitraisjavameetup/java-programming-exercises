package com.mitrais.cdc.java;

import static org.junit.Assert.*;

import org.junit.Test;

public class SotingExamplesTests {
	
	String[] words = { "hi", "hello", "hola", "bye", "goodbye", "adios" };

	@Test
	public void testSortWords() {
		String[] sorted = SortingExamples.sortWords(words);
		assertTrue(sorted[0].equals("adios"));
		assertTrue(sorted[2].equals("goodbye"));
	}

	@Test
	public void testSortWordsByLengthAscending() {
		String[] sorted = SortingExamples.sortWordsByLengthAscending(words);
		assertTrue(sorted[0].equals("hi"));
		assertTrue(sorted[2].equals("hola"));
	}

	@Test
	public void testSortWordsByLengthDescending() {
		String[] sorted = SortingExamples.sortWordsByLengthDescending(words);
		assertTrue(sorted[0].equals("goodbye"));
		assertTrue(sorted[2].equals("adios"));
	}

	@Test
	public void testSortWordsByFirstLetter() {
		String[] sorted = SortingExamples.sortWordsByFirstLetter(words);
		assertTrue(sorted[0].equals("adios"));
		assertTrue(sorted[2].equals("goodbye"));
	}

	@Test
	public void testSortWordsByWetherItContains_e() {
		String[] sorted = SortingExamples.sortWordsByWetherItContains_e(words);
		assertTrue(sorted[0].equals("hello"));
		assertTrue(sorted[2].equals("goodbye"));
	}

}
