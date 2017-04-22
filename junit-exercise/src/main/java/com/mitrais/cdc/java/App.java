package com.mitrais.cdc.java;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.hamcrest.CoreMatchers;

/**
 * There are 2 method below
 * Please create the test case using junit on src/test/java/AppTest.java
 * to unit testing each method
 */
public class App {

	  /** Method calmString:
	   *  Takes a String and returns a new String with all the exclamation points
	   *  removed. For example, Utils.calmString("!foo!!") should return "foo".
	   */
	  public static String calmString(String speech) {
		//todo: apply logic as described above
		  if(speech.contains("!")){
			  speech = speech.replace("!", "");
		  }
		  System.out.println(speech);
	    return(speech);
	  }
	  
	  /** Method calmAttendees: 
	   *  Takes a List of political parties (List of String) and potentially modifies it so
	   *  that it never contains both "Republican" and "Democrat". If it contains
	   *  both, it flips a coin to decide which to remove (half time it remove "Republican"
	   *  and half time it remove "Democrat"
	   *  If it contains neither,or is null, it does nothing.
	   */
	  
	  private static void removeStringFromList(List<String> list, String stringIdentifier){
		  ListIterator<String> i = list.listIterator();
		  while(i.hasNext()){
			  String s = i.next();
			  if(s.contains(stringIdentifier)){
				  i.remove();
			  }
		  }
	  }
	  
	  private static boolean checkStringFromList(List<String> list, String stringID, String stringID2){
		  boolean contain1 = false;
		  boolean contain2 = false;
		  for(String s: list){
			  if(s.contains(stringID))
				  contain1 = true;
			  else if(s.contains(stringID2))
				  contain2 = true;
			  if(contain1 && contain2)
				  return true;
		  }
		  return false;
	  }
	  public static void calmAttendees(List<String> attendingParties) {
			//todo: apply logic as described above
		  if(attendingParties != null || attendingParties.isEmpty()){
			  if(checkStringFromList(attendingParties, "Democrat", "Republican")){
				  double rand = Math.random();
				  if(rand <= 0.5){
					  removeStringFromList(attendingParties, "Democrat");
				  } else {
					  removeStringFromList(attendingParties, "Republican");
				  }
			  }		  
		  }
		  System.out.println(attendingParties);
	  }
	  
	  private App() {} // Class cannot be instantiated: only static methods
	}
