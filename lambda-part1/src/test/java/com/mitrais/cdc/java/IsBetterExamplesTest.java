package com.mitrais.cdc.java;

import static org.junit.Assert.*;

import org.junit.Test;

public class IsBetterExamplesTest {
	
	@Test
	public void betterString() {
		
		String test1 = "Hello";
	    String test2 = "Goodbye";
	    
		String betterStringBasedOnLength = IsBetterExamples.betterString(test1, test2, (s1, s2) -> s1.length() > s2.length());
		assertEquals(betterStringBasedOnLength, test2);
		String betterStringBasedOn1stArgs = IsBetterExamples.betterString(test1, test2, (s1, s2) -> true);
		assertEquals(betterStringBasedOn1stArgs, test1);
		
	}
	
	@Test
	public void betterElement() {
		
		String test1 = "Hello";
	    String test2 = "Goodbye";
	    int int1 = 1;
	    int int2 = 2;
	    
		String betteElementBasedOnLength = IsBetterExamples.betterElement(test1, test2, (s1, s2) -> s1.length() > s2.length());
		assertEquals(betteElementBasedOnLength, test2);		
		int betterStringBasedOn1stArgs = IsBetterExamples.betterElement(int1, int2, (n1, n2) -> n1 > n2);
		assertEquals(betterStringBasedOn1stArgs, int2);
		
	}
}
