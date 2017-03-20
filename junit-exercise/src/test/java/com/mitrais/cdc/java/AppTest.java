package com.mitrais.cdc.java;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest{
	@Test
	public void testCalmString()
    {
        /* todo:
         * Please create jUnit code
         * to test calmString method on App.java
         * at least create 4 test cases using 'assertThat' (modern approach)
         * and 4 test cases using 'assertEquals' (traditional approach)
         */
		String[] words = {"!!foo","!app!","!boom!!","!!!byar!!!"};
		for (int i = 0; i < words.length; i++) {
			assertThat(words[i].replace("!",""),is((App.calmString(words[i]))));
			assertEquals(App.calmString(words[i]),words[i].replace("!",""));
		}
		
    }
	
	@Test
	public void testCalmAttendees()
    {
        /* todo:
         * Please create jUnit code using modern approach
         * to test calmAttendees method on App.java
         * at least create 3 test case using 'assertThat'
         */
		List<String> attendingParties = new ArrayList<String>();
		attendingParties.add("Democrat");
		attendingParties.add("Republican");
		attendingParties.add("Golkar");
		
		List<String> attendingParties2 = new ArrayList<String>();
		attendingParties2.add("PDIP");
		attendingParties2.add("Democrat");
		attendingParties2.add("Golkar");
		
		List<String> attendingParties3 = new ArrayList<String>();
		attendingParties3.add("PKB");
		attendingParties3.add("Democrat");
		attendingParties3.add("PDIP");
		
		App.calmAttendees(attendingParties);
		App.calmAttendees(attendingParties2);
		App.calmAttendees(attendingParties3);
		
		assertThat(2,is(attendingParties.size()));
		assertThat(3,is(attendingParties2.size()));
		assertThat(3,is(attendingParties3.size()));
    }
}
