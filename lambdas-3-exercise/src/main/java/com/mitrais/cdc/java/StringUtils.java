package com.mitrais.cdc.java;

import java.util.*;
import java.util.function.*;

/** Some String-specific versions of methods that transform Lists. See
 *  ElementUtils for the better, generically-typed versions.
 */

public class StringUtils {
  public static List<String> allMatches(List<String> candidates, Predicate<String> matchFunction) {
	
    List<String> results = new ArrayList<>();
    
    //TODO: Question number one: return a new List of all the values that passed the test
  
    for (String possibleMatches: candidates){
    	if (matchFunction.test(possibleMatches)){
    		results.add(possibleMatches);
    	}
    }
    
    return(results); 
  }
  
  
  public static List<String> transformedList(List<String> originals, Function<String, String> transformer) {
    
	List<String> results = new ArrayList<>();
    
    //TODO: Question number three: return a new List that contains the results of applying the Function to each element of the original
	
	for (String possibleTransform: originals){
		results.add(transformer.apply(possibleTransform));
	}
	

    return(results); 
  }
  
  private StringUtils() {} // Uninstantiatable class
}
