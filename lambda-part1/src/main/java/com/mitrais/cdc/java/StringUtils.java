package com.mitrais.cdc.java;

public class StringUtils {

	public static String betterString(String s1, String s2, TwoStringPredicate tester) {
	
		/*
		 * TO DO
		 * Define the static method betterString. 
		 * That method will take 2 strings and an instance of your interface.
		 * It returns string1 if the method in interface returns true, string2 otherwise. 
		 * This method is normal Java 7 code.
		 */	
		if (tester.isBetter(s1, s2)==true)
		{
			return s1;
		}
		else
		{
			return s2;
		}
		
	}
	
	public static int eChecker(String s1, String s2) {
	    int compareFlag = 0;
	    if (s1.contains("e") && !s2.contains("e")) {
	      compareFlag = -1;
	    } else if (s2.contains("e") && !s1.contains("e")) {
	      compareFlag = 1;
	    }
	    return(compareFlag);
	  }

	private StringUtils() {}

}
