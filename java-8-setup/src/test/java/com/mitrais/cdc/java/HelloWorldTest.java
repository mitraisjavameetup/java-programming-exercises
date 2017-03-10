package com.mitrais.cdc.java;

import static org.junit.Assert.*;

import org.junit.Test;

public class HelloWorldTest {

	@Test
	public void testHello() {
		String message = "Hello World!";
		String result = HelloWorld.hello(message);
		assertTrue(message.equals(result));
	}

}
