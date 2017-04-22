package com.mitrais.cdc.java;

import java.util.List;

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
		  if (speech != null)
		  {
			  speech = speech.replaceAll("!", "");  
		  }
		
	    return(speech);
	  }
	  
	  /** Method calmAttendees: 
	   *  Takes a List of political parties (List of String) and potentially modifies it so
	   *  that it never contains both "Republican" and "Democrat". If it contains
	   *  both, it flips a coin to decide which to remove (half time it remove "Republican"
	   *  and half time it remove "Democrat"
	   *  If it contains neither,or is null, it does nothing.
	   */
	  public static List<String> calmAttendees(List<String> attendingParties) {
			//todo: apply logic as described above
		  if (attendingParties != null) //check null or not
		  {
			  //check if contain both Republican and Democrat or not
			  if (attendingParties.contains("Republican") && attendingParties.contains("Democrat"))
			  {
				  //Random to define which one to remove
				  double rand = Math.random();
				  String removeString = "";
				  if (rand <0.5)
				  {
					  removeString = "Republican";
				  }else
				  {
					  removeString = "Democrat";
				  }
				  //Remove the parties from the list from behind because remove method will change the indexing.
				  for(int i =attendingParties.size()-1;i>=0;i--)
				  {
					  if (attendingParties.get(i).equals(removeString))
					  {
						  attendingParties.remove(i);
					  }
				  }
			  }  
		  }
		  System.out.println(attendingParties);
		  return attendingParties;
	  }
	  
	  private App() {} // Class cannot be instantiated: only static methods
	}
