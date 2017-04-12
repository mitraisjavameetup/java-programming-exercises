package com.mitrais.cdc.java.two;

import java.util.*;

public class FunctionUtilsMain {
	public static void main(String[] args) {
		List<String> words = Arrays.asList("hello", "hola", "goodbye", "adios");

		String word1 = FunctionUtils.firstAllMatch(words.stream(), s -> s.contains("o"), s -> s.length() > 5);
		System.out.println("First word with o and 5+ letters is " + word1);

		String word2 = FunctionUtils.firstAllMatch(words.stream(), s -> s.contains("o"), s -> s.length() > 8);
		System.out.println("First word with o and 8+ letters is " + word2);
	}
}
