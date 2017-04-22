package com.mitrais.cdc.java.two;

import java.util.function.Predicate;
import java.util.stream.Stream;

public class FunctionUtils {
  
  // @SafeVarargs is difficult to understand. The issue is that it is not always safe to use varargs for generic types: 
  // the resultant array can have runtime type problems if you modify entries in it. 
  // @SafeVarargs says "I am not doing anything dangerous, please suppress the compiler warnings".  
  // For details, see http://docs.oracle.com/javase/7/docs/technotes/guides/language/non-reifiable-varargs.html
	
  @SafeVarargs
  public static <T> Predicate<T> allPassPredicate(Predicate<T>... tests) {
    Predicate<T> result = e -> true;
    
    /** TODO: create a 'for' loop.
     *  Returns a Predicate that is the result of ANDing all the argument Predicates.
     *  If no Predicates are supplied, it returns a Predicate that always returns
     *  true.
     */
    
    for(Predicate<T> test : tests){
    	result = result.and(test);
    
    }

    
    
    
    
    return(result);
  }

  
  
  @SafeVarargs
  public static <T> T firstAllMatch(Stream<T> elements, Predicate<T>... tests) {
    Predicate<T> combinedTest = allPassPredicate(tests);
    
    T result = null; 
    
    //TODO: filter based first element that matches ALL of the tests, null otherwise    
    
    result = elements.filter(combinedTest).findFirst().orElse(null);
    
    return result;
  }
  
  private FunctionUtils() {} // Uninstantiatable class
}
