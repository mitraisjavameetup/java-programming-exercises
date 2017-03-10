package com.mitrais.cdc.java;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.mitrais.cdc.java.three.FunctionUtils2;

public class Function2UnitTest {
	
	@Test
	public void test() {
		List<String> words = Arrays.asList("hello", "hola", "goodbye", "adios");

	    String word1 = FunctionUtils2.firstAnyMatch(words.stream(), 
	                                    		    s -> s.contains("o"),
	                                    		    s -> s.length() > 5);
	    
	    String word2 = FunctionUtils2.firstAnyMatch(words.stream(), 
	    										    s -> s.contains("o"),
	    										    s -> s.length() > 8);
	    
	    String word3 = FunctionUtils2.firstAnyMatch(words.stream(), 
	    										    s -> s.contains("q"),
	    										    s -> s.length() > 8);
		
		assertEquals("hello", word1);
		assertEquals("hello", word2);
		assertNull(word3);
	    
	}
}
