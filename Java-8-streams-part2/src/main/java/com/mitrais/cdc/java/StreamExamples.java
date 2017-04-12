package com.mitrais.cdc.java;

import java.util.*;
import java.util.stream.Collectors;

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
		String uppercaseString = words.stream().reduce("", (s1, s2) -> (s1 + s2).toUpperCase());
		
		/* TO DO
		 * complete this method to answer number 1
		 * using lambda expression
		 */
		
		return uppercaseString;
	}
	
	public String uppercaseWithMap(){
		String uppercaseString = words.stream().map(String::toUpperCase).reduce("", String::concat);
		/* TO DO
		 * complete this method to answer number 2
		 * using lambda expression
		 */
		
		return uppercaseString;
	}
	
	public String wordsWithComma(){
		String convertWords = words.stream().reduce((s1, s2) -> s1 + "," + s2).get();
		/* TO DO
		 * complete this method to answer number 3
		 * using lambda expression
		 */
		
		return convertWords;
	}
	
	public int numberOfCharacters(){
		int numOfChar = words.stream().mapToInt(e -> e.length()).sum();
		
		/*TO DO
		 *complete this method to answer number 4
		 *using lambda expression
		 */
		return numOfChar;
	}
	
	public int numberOfWordsWithH(){
		int numOfH = (int) words.stream().filter(e -> e.contains("h")).count();
		/*TO DO
		 *complete this method to answer number 5
		 *using lambda expression
		 */
		return numOfH;
	}
}
