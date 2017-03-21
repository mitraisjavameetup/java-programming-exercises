package com.mitrais.cdc.java;

import static org.junit.Assert.*;
//import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;

public class UnitTest {
	
	@Test
	public void test() {
		String cannot = "Cannot create unit test";
		String howTo = "You need to check the code and display manually"; 
		
		assertEquals(howTo, cannot);
	    
	}
	
}
