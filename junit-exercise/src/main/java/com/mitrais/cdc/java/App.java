package com.mitrais.cdc.java;

import java.util.ArrayList;
import java.util.Iterator;
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
		  String calmSpeech = "";
		//todo: apply logic as described above
		  for(int i=0;i<speech.length();i++){
			  if(speech.charAt(i)!='!')calmSpeech=new StringBuilder().append(calmSpeech).append(speech.charAt(i)).toString();
		  }
	    return calmSpeech;
	  }
	  
	  /** Method calmAttendees: 
	   *  Takes a List of political parties (List of String) and potentially modifies it so
	   *  that it never contains both "Republican" and "Democrat". If it contains
	   *  both, it flips a coin to decide which to remove (half time it remove "Republican"
	   *  and half time it remove "Democrat"
	   *  If it contains neither,or is null, it does nothing.
	   */
	  private static boolean checker(List<String> attendingParties){
		  for(String at:attendingParties){
			  if(attendingParties.contains("Republican")||attendingParties.contains("Democrat"))return true;
		  }
		  return false;
	  }
	  public static void calmAttendees(List<String> attendingParties) {
			//todo: apply logic as described above
		  if(!attendingParties.isEmpty()){
			  boolean decide=checker(attendingParties);
			  if(decide){
				  double decider=Math.random();
				  if(decider<=0.5){
					  for(int i=0;i<attendingParties.size();i++){
						  if(attendingParties.get(i).contains("Republican"))
						  attendingParties.remove(i);
					  }
				  }
				  else{
						  for(int i=0;i<attendingParties.size();i++){
							  if(attendingParties.get(i).contains("Democrat"))
							  attendingParties.remove(i);
						  }
					  }
				  }
			  }
			  
		  }
		  
	  
	  
	  private App() {} // Class cannot be instantiated: only static methods
	}
