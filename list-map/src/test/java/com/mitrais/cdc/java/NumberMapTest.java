package com.mitrais.cdc.java;

import static org.junit.Assert.*;

import org.junit.Test;

public class NumberMapTest {

	@Test
	public void testNumberMapWithNewString() {
		String[] angkaBahasaIndonesia = {"nol","satu", "dua", "tiga", "empat", "Lima"};
		NumberMap numberMap = new NumberMap(angkaBahasaIndonesia);
		String nol = numberMap.wordForNumber(0);
		assertTrue("nol" == nol.toLowerCase());
		String satu = numberMap.wordForNumber(1);
		assertFalse("dua" == satu.toLowerCase());
		assertTrue("satu" == satu.toLowerCase());
	}
	
	@Test
	public void testWordForNumber() {
		NumberMap numberMap = new NumberMap();
		String nine = numberMap.wordForNumber(9);
		assertTrue("nine" == nine.toLowerCase());
	}

}
