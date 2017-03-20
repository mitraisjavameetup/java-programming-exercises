package com.mitrais.cdc.java;

import java.util.ArrayList;
import java.util.List;

/**
 * There are 2 method below Please create the test case using junit on
 * src/test/java/AppTest.java to unit testing each method
 */
public class App {

	/**
	 * Method calmString: Takes a String and returns a new String with all the
	 * exclamation points removed. For example, Utils.calmString("!foo!!")
	 * should return "foo".
	 */
	public static String calmString(String speech) {
		// todo: apply logic as described above
		return (speech.replaceAll("!", ""));
	}

	/**
	 * Method calmAttendees: Takes a List of political parties (List of String)
	 * and potentially modifies it so that it never contains both "Republican"
	 * and "Democrat". If it contains both, it flips a coin to decide which to
	 * remove (half time it remove "Republican" and half time it remove
	 * "Democrat" If it contains neither,or is null, it does nothing.
	 */
	public static void calmAttendees(List<String> attendingParties) {
		// todo: apply logic as described above
		List<String> result = new ArrayList<>();
		for (String temp : attendingParties) {
			if (attendingParties.contains("Republican") & (attendingParties.contains("Democrat"))) {
				if (Math.random() <= 0.5) {
					attendingParties.remove("Republican");
					result.addAll(attendingParties);
				} else {
					attendingParties.remove("Democrat");
					result.addAll(attendingParties);
				}
			}
			else{
				result = attendingParties;
			}

		}
		System.out.println(result);
	}

	private App() {
	} // Class cannot be instantiated: only static methods

	public static void main(String[] args) {
		System.out.println(calmString("foo!!"));
	}
}
