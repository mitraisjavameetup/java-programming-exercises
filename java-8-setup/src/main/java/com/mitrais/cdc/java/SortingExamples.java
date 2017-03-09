package com.mitrais.cdc.java;

/** Solutions to the basic non-lambda sorting exercises.
 *  <p>
 *  From <a href="http://courses.coreservlets.com/Course-Materials/">the
 *  coreservlets.com tutorials on JSF 2, PrimeFaces, Ajax, jQuery, GWT, Android,
 *  Spring, Hibernate, JPA, RESTful Web Services, Hadoop, 
 *  servlets, JSP, and Java 7 and Java 8 programming</a>.
 */
public class SortingExamples {
	
	/*
	 * To Do :
	 * Make an array containing a few Strings. Use anonymous inner classes to sort it by:
	 * • length (i.e., shortest to longest)
	 * (Hint: this exact solution was shown in the lecture)
	 * • reverse length (i.e., longest to shortest)
	 * (Hint: minor variation of the first bullet)
	 * • alphabetically by the first character only
	 * (Hint: charAt(0) returns the numeric code for the first character)
	 * • Strings that contain “e” first, everything else second. Put the full comparison code directly
	 * inside the body of the compare method.
	 * • Strings that contain “e” first, everything else second. But this time, move the comparison
	 * code into a static method. For example, StringUtils.eChecker(s1, s2) will return -1 if s1 is
	 * “less” (i.e., it contains “e” but s2 doesn’t), 1 if s1 is “greater”, and 0 otherwise. Now, sort the
	 * array as before, but call the static method from the body of the compare method.
	 * (Hint: simple if you did the previous bullet. But we will use both approaches later.)
	 */
	
	public static String[] sortWords(String[] words) {
		return words; 
	}
	
	public static String[] sortWordsByLengthAscending(String[] words) {
		/* To Do :
		 * Make an array containing a few Strings. Use anonymous inner classes to sort it by:
		 * • length (i.e., shortest to longest)
		 * (Hint: this exact solution was shown in the lecture)
		 */
	    return words;
	}
	
	public static String[] sortWordsByLengthDescending(String[] words) {
		/* To Do :
		 * Make an array containing a few Strings. Use anonymous inner classes to sort it by:
		 * • reverse length (i.e., longest to shortest)
		 * (Hint: minor variation of the first bullet)
		 */
	    return words;
	}
	
	public static String[] sortWordsByFirstLetter(String[] words) {
		/* To Do :
		 * Make an array containing a few Strings. Use anonymous inner classes to sort it by:
		 * • alphabetically by the first character only
		 * (Hint: charAt(0) returns the numeric code for the first character)
		 */
	    return words;
	}
	
	
  public static String[] sortWordsByWetherItContains_e(String[] words) {
	  	/* To Do :
		 * Make an array containing a few Strings. Use anonymous inner classes to sort it by:
		 * • Strings that contain “e” first, everything else second. But this time, move the comparison
		 * code into a static method. For example, StringUtils.eChecker(s1, s2) will return -1 if s1 is
		 * “less” (i.e., it contains “e” but s2 doesn’t), 1 if s1 is “greater”, and 0 otherwise. Now, sort the
		 * array as before, but call the static method from the body of the compare method.
		 * (Hint: simple if you did the previous bullet. But we will use both approaches later.)
		 */
	return words;
  }
}
