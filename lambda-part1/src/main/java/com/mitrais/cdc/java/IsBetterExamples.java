package com.mitrais.cdc.java;

public class IsBetterExamples {

	public static String betterString(String test1, String test2,
			TwoStringPredicate tester) {

		return StringUtils.betterString(test1, test2, tester);

	}

	public static <T> T betterElement(T test1, T test2,
			TwoElementPredicate<T> tester) {

		return ElementUtils.betterElement(test1, test2, tester);

	}

}
