package com.mitrais.cdc.java;


import static org.junit.Assert.*;

import org.junit.Test;

public class UtilsExampleTest {
	
	@Test
	public void showAverages1() {	
		double result = UtilsExamples.showAverages1(1_000_000, 0.5);
		assertTrue(result >= 0.7 && result <= 8.0);
	}
	
	@Test
	public void showAverages2() {	
		double result = UtilsExamples.showAverages2(1_000_000);
		assertTrue(result >= 0.9);
	}
	
	@Test
	public void profilePrimeCounts() {	
		assertTrue(UtilsExamples.profilePrimeCounts());
	}
	
}
