package com.mitrais.cdc.java;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.mitrais.cdc.java.two.FunctionUtils;

public class FunctionUnitTest {
	
	@Test
	public void test() {
		List<String> words = Arrays.asList("hello", "hola", "goodbye", "adios");
	    
	    String word1 = FunctionUtils.firstAllMatch(words.stream(), 
	    										   s -> s.contains("o"),
	    										   s -> s.length() > 5);
	    
	    String word2 = FunctionUtils.firstAllMatch(words.stream(), 
	    										   s -> s.contains("o"),
	    										   s -> s.length() > 8);
		
		assertEquals("goodbye", word1);
		assertNull(word2);
	    
	}
}
