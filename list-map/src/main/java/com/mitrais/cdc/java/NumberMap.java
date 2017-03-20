package com.mitrais.cdc.java;

import java.util.Map;
import java.util.TreeMap;

public class NumberMap {
	private Map<Integer, String> numberTable;
	private static String[] defaultWords = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight",
			"nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen",
			"nineteen" };

	public NumberMap() {
		this(defaultWords);
	}

	public NumberMap(String[] words) {
		// To-Do set numberTable map by words arrays
		this.numberTable = new TreeMap<>();
		int key = 0;
		for (String s : words) {
			numberTable.put(key++, s);
		}
	}

	public String wordForNumber(int num) {
		// To-Do return words by numbers assigned, set default as [unknown]
		return numberTable.get(num);
	}

	public int getSize() {
		return (numberTable.size());
	}
}
