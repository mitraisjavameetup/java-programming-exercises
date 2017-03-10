package com.mitrais.cdc.java;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringUtilsTest {

	@Test
	public void testEChecker() {
		int res = StringUtils.eChecker("Amber", "gray");
		assertTrue(res < 0);
		
		int res2 = StringUtils.eChecker("Amber", "grey");
		assertTrue(res2 == 0);
		
		int res3 = StringUtils.eChecker("Black", "Blue");
		assertTrue(res3 > 0);
	}

}
