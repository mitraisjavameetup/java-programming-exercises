package com.mitrais.cdc.java;

import java.util.*;
import java.util.function.*;

/** Some String-specific versions of methods that transform Lists. See
 *  ElementUtils for the better, generically-typed versions.
 */

public class StringUtils {
  public static List<String> allMatches(List<String> candidates, Predicate<String> matchFunction) {
	
    List<String> results = new ArrayList<>();
   for(int i = 0; i < candidates.size() ; i++){
	   if(matchFunction.test(candidates.get(i)) ==true);
	   	results.add(candidates.get(i));
	   
   }
    //TODO: Question number one: return a new List of all the values that passed the test  
   
    return(results); 
  }
  
  
  public static List<String> transformedList(List<String> originals, Function<String, String> transformer) {
    
	List<String> results = new ArrayList<>();
    
    //TODO: Question number three: return a new List that contains the results of applying the Function to each element of the original

	for(int i = 0; i < originals.size(); i++){
		 results.add(transformer.apply(originals.get(i)));
		 
	}
	
	
	
    
    
    return(results); 
  }
  
  public static boolean transformer(String string) {
	// TODO Auto-generated method stub
	return false;
}


private StringUtils() {} // Uninstantiatable class
}
