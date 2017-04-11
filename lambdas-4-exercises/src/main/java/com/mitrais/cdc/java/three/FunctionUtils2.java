package com.mitrais.cdc.java.three;

import java.util.function.Predicate;
import java.util.stream.Stream;
/**
 * 
 * @author trainee
 * class FunctionUtils2
 */
public class FunctionUtils2 {
	
  @SafeVarargs
  /**
   * 
   * @param tests
   * @return predicate<T>
   */
  public static <T> Predicate<T> anyPassPredicate(Predicate<T>... tests) {
    Predicate<T> result = e -> false;
    
    
    /** TODO: create a 'for' loop. 
     * 	Returns a Predicate that is the result of ORing all the argument Predicates.
     *  If no Predicates are supplied, it returns a Predicate that always returns
     *  false.
     */
    for(Predicate<T> test:tests){
    	result=result.or(test);
    }
    return result;
    

    
  }
  
  
  
  @SafeVarargs
  /**
   * 
   * @param elements
   * @param tests
   * @return T
   */
  public static <T> T firstAnyMatch(Stream<T> elements, Predicate<T>... tests) {
    Predicate<T> combinedTest = anyPassPredicate(tests);
    
    T result = null;
    
    //TODO: filter based first element that matches ANY of the tests, null otherwise
    result=elements.filter(combinedTest).findFirst().orElse(null);
    
   
    
    return result;
  }
  
  private FunctionUtils2() {} // Uninstantiatable class
}
