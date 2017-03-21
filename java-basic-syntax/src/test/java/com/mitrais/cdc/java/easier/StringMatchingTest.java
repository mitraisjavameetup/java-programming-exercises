package com.mitrais.cdc.java.easier;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringMatchingTest {

	@Test
	public void test_stringInArray() {
		String[] testStrings = { "Hello", "Hi", "Hola", "Howdy" };
		assertTrue(StringMatching.isStringInArray(testStrings, "Hola"));
		assertFalse(StringMatching.isStringInArray(testStrings, "Hey"));
	}

}
