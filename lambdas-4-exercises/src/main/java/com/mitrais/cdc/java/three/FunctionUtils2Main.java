package com.mitrais.cdc.java.three;

import java.util.*;

public class FunctionUtils2Main {
	public static void main(String[] args) {
		List<String> words = Arrays.asList("hello", "hola", "goodbye", "adios");

		String word1 = FunctionUtils2.firstAnyMatch(words.stream(), s -> s.contains("o"), s -> s.length() > 5);
		System.out.println("First word with o or 5+ letters is " + word1);

		String word2 = FunctionUtils2.firstAnyMatch(words.stream(), s -> s.contains("o"), s -> s.length() > 8);
		System.out.println("First word with o or 8+ letters is " + word2);

		String word3 = FunctionUtils2.firstAnyMatch(words.stream(), s -> s.contains("q"), s -> s.length() > 8);
		System.out.println("First word with q or 8+ letters is " + word3);
	}
}
