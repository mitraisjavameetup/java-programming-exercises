package com.mitrais.cdc.java;

import java.util.*;

/** TO DO
 *  please complete the methods for below capabilities (you should using lambda expression).
 *  1. Produce a single String that is the result of concatenating the uppercase versions of all of the 
 *  Strings. E.g., the result should be "HIHELLOHOLA...". Use a single reduce operation, without using map.
 *  
 *  2. Produce the same String as above, but this time via a map operation that turns the words 
 *  into uppercase, followed by a reduce operation that concatenates them.
 *  
 *  3. Produce a String that is all the words concatenated together, but with commas in between. 
 *  E.g., the result should be "hi,hello,...". 
 *  Note that there is no comma at the beginning, before “hi” 
 *  and also no comma at the end (after the last word)
 *  
 *  4. Find the total number of characters (i.e., sum of the lengths) of the strings in the List
 *  
 *  5. Find the number of words that contain an “h”
 */

public class StreamExamples {
	
	List<String> words;
	StreamExamples(){
		words = Arrays.asList("hi", "hello", "hola", "bye", "goodbye", "adios");
	}
	
	public List<String> getStringList(){
		return words;
	}
	
	public String uppercaseWithoutMap(){
		String uppercaseString = null;
		/* TO DO
		 * complete this method to answer number 1
		 * using lambda expression
		 */
		uppercaseString = words.stream().reduce((a,b) -> a.toUpperCase() + b.toUpperCase()).get();
		return uppercaseString;
	}
	
	public String uppercaseWithMap(){
		String uppercaseString = null;
		/* TO DO
		 * complete this method to answer number 2
		 * using lambda expression
		 */
		uppercaseString = words.stream().map(String::toUpperCase).reduce((a,b) -> a + b).get();
		return uppercaseString;
	}
	
	public String wordsWithComma(){
		String convertWords = null;
		/* TO DO
		 * complete this method to answer number 3
		 * using lambda expression
		 */
		
		convertWords = words.stream().reduce((a,b) -> a + "," + b).get();
		
		return convertWords;
	}
	
	public int numberOfCharacters(){
		int numOfChar = 0;
		/*TO DO
		 *complete this method to answer number 4
		 *using lambda expression
		 */
		numOfChar = words.stream().reduce((a,b) -> a + b).get().length();
		return numOfChar;
	}
	
	public int numberOfWordsWithH(){
		int numOfH = 0;
		/*TO DO
		 *complete this method to answer number 5
		 *using lambda expression
		 */
		
		numOfH = (int) words.stream().filter(s -> s.toLowerCase().contains("h")).count();
		return numOfH;
	}
}
