package com.mitrais.cdc.java;

import java.util.*;
import java.util.function.*;

/** Some generically-typed versions of methods that transform Lists. See
 *  StringUtils for the less flexible String-specific versions.
 */

public class ElementUtils {
  public static <T> List<T> allMatches(List<T> candidates, Predicate<T> matchFunction) {
    
	List<T> results = new ArrayList<>();
    
	//TODO: Question number two: return a new List of all the values that passed the test
    for (T t : candidates) {
		if(matchFunction.test(t)){
			results.add(t);
		}
	}

	
	
	
    return(results); 
  }

  public static <T, R> List<R> transformedList(List<T> originals, Function<T, R> transformer) {
    List<R> results = new ArrayList<>();
    
    //TODO: Question number four: return a new List that contains the results of applying the Function to each element of the original
    for (T t : originals) {
		results.add(transformer.apply(t));
	}
    
    
    
    return(results); 
  }
  
  private ElementUtils() {} // Uninstantiatable class
}
