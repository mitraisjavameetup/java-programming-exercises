package com.mitrais.cdc.java;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;

import com.mitrais.cdc.java.App;

/**
 * Unit test for simple App.
 */
public class AppTest{
	/**
	 * Test calmString method
	 */
	@Test
	public void testCalmString()
    {
        /* todo:
         * Please create jUnit code
         * to test calmString method on App.java
         * at least create 4 test cases using 'assertThat' (modern approach)
         * and 4 test cases using 'assertEquals' (traditional approach)
         */
		assertThat("foo", is(App.calmString("!foo!!")));
		assertThat("boom", is(App.calmString("boom!")));
		assertThat("hey you", is(App.calmString("hey! you!")));
		assertThat("sup", is(App.calmString("sup!!!")));
		
		assertEquals(App.calmString("!foo!!"), "foo");
		assertEquals(App.calmString("boom!"), "boom");
		assertEquals(App.calmString("hey! you!"), "hey you");
		assertEquals(App.calmString("sup!!!"), "sup");
    }
	/**
	 * Test calmAttendees method
	 */
	@Test
	public void testCalmAttendees()
    {
        /* todo:
         * Please create jUnit code using modern approach
         * to test calmAttendees method on App.java
         * at least create 3 test case using 'assertThat'
         */
		List<String> attendingParties = new ArrayList<String>(Arrays.asList("Republican", "Democrat", "Nasdem"));
		List<String> partaiIndo = new ArrayList<String>(Arrays.asList("Republican", "Demokrat", "Golkar"));
		List<String> partaiIndo2 = new ArrayList<String>(Arrays.asList("PDIP", "Democrat", "Nasdem"));
		List<String> partaiIndo3 = null;
		App.calmAttendees(attendingParties);
		App.calmAttendees(partaiIndo);
		App.calmAttendees(partaiIndo2);
		App.calmAttendees(partaiIndo3);
		assertThat(2, is(attendingParties.size()));
		assertThat(3, is(partaiIndo.size()));
		assertThat(3, is(partaiIndo2.size()));
		assertThat(null, is(equalTo(partaiIndo3)));
		
    }
}
