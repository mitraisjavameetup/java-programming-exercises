package com.mitrais.cdc.java;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;

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
		
		assertThat(App.calmString("!foo!!"), is("foo"));
		assertThat(App.calmString("foo"),is("foo"));
		assertThat(App.calmString(null), is(nullValue()));
		assertThat(App.calmString("!"), is(""));
		
		assertEquals(App.calmString("!foo!!"), "foo");
		assertEquals(App.calmString(null), null);
		assertEquals(App.calmString("foo"),"foo");
		assertEquals(App.calmString("!"), "");
		assertNull(App.calmString(null));
		assertFalse(App.calmString("!foo!!"),false);
		assertTrue(App.calmString("!foo!!"),true);
    }
	
	@Test
	public void testCalmAttendees()
    {
        /* todo:
         * Please create jUnit code using modern approach
         * to test calmAttendees method on App.java
         * at least create 3 test case using 'assertThat'
         */
		List<String> attendingParties = new ArrayList<String>(Arrays.asList("Democrat","Republican","Another party"));
		App.calmAttendees(attendingParties);
		assertThat(attendingParties.size(), is(2));
		assertThat(attendingParties.isEmpty(), is(false));
		assertThat(attendingParties.contains("Another party"), is(true));
    }
}
