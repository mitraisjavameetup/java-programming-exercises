package com.mitrais.cdc.java;


import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

	@Test
	public void testCalmString()
    {
        /* todo:
         * Please create jUnit code
         * to test calmString method on App.java
         * at least create 4 test cases using 'assertThat' (modern approach)
         * and 4 test cases using 'assertEquals' (traditional approach)
         */
		String[] words = {"!foo", "bar!!", "!brown!", "!!dogs!!"};
		
		for (int i = 0; i < words.length; i++) {			
			assertThat(words[i].replaceAll("!", ""), is(equalTo(App.calmString(words[i]))));
			assertEquals(App.calmString(words[i]), words[i].replaceAll("!", ""));
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
		
		// 1st case
		List<String> li = new ArrayList<String>();
		li.add("Democrat");
		li.add("Democrat");
		li.add("Regular People");
		li.add("Republican");
		
		App.calmAttendees(li);
		assertThat(4, not(equalTo(li.size())));
		assertNotEquals(li.size(), 4);
		
		// 2nd case
		li = new ArrayList<String>();
		li.add("Non Voter");
		li.add("Non Voter");
		li.add("Swing Voter");
		li.add("Republican");
		
		App.calmAttendees(li);
		assertThat(4, is(equalTo(li.size())));
		assertEquals(li.size(), 4);
		
		// 3rd case
		li = new ArrayList<String>();
		li.add("Non Voter");
		li.add("Non Voter");
		li.add("Swing Voter");
		li.add("Immigrant");
		
		App.calmAttendees(li);
		assertThat(4, is(equalTo(li.size())));
		assertEquals(li.size(), 4);
		
		// 4th case
		li = null;
		
		App.calmAttendees(li);
		assertThat(null, is(equalTo(li)));
		assertEquals(li, null);
		
    }
}
