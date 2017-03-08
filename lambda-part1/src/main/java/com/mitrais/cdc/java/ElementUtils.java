package com.mitrais.cdc.java;


/** Method that uses the generic TwoElementPredicate, rather than the
 *  String-specific TwoStringPredicate.
 *  <p>
 *  From <a href="http://courses.coreservlets.com/Course-Materials/">the
 *  coreservlets.com tutorials on JSF 2, PrimeFaces, Ajax, JavaScript, jQuery, GWT, Android,
 *  Spring, Hibernate, JPA, RESTful Web Services, Hadoop, Spring MVC,
 *  servlets, JSP, Java 8 lambdas and streams (for those that know Java already), 
 *  and Java 8 programming (for those new to Java)</a>.
 */

public class ElementUtils {
  public static <T> T betterElement(T element1, T element2, TwoElementPredicate<T> tester) {
    
	/*
	 * TO DO
	 * Define the static method betterElement. 
	 * That method will take 2 Generic Element <T> and an instance of your interface.
	 * It returns element1 if the method in interface returns true, element2 otherwise. 
	 * This method is normal Java 7 code.
	 */	
	
	return null;
  }
  
  private ElementUtils() {}
}
