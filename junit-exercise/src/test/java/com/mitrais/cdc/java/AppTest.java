package com.mitrais.cdc.java;

import org.junit.*;
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
		assertThat("foo", is(equalTo(App.calmString("!!fo!o"))));
		assertThat("Testing with jUnit", is(equalTo(App.calmString("!Te!s!ting wit!h j!!!Un!it!"))));
		assertThat("", is(equalTo(App.calmString("!!!"))));
		assertThat("12345", is(equalTo(App.calmString("!!1!234!5"))));
		
    }
	
	@Test
	public void testCalmAttendees()
    {
        /* todo:
         * Please create jUnit code using modern approach
         * to test calmAttendees method on App.java
         * at least create 3 test case using 'assertThat'
         */
		
		List<String> attendingParties =	new ArrayList<String>(Arrays.asList("Republican", "Democrat", "Test"));
		App.calmAttendees(attendingParties);
		
		assertThat(attendingParties.isEmpty(), is(equalTo(false)));
		assertThat(attendingParties.contains("Test"), is(true));
		assertThat(attendingParties.size(), is(2));
    }
}
