package com.mitrais.cdc.java;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;

/**
 * Unit test for simple App.
 */
public class AppTest{

	@Test
	/**
	 * Test for CalmString
	 */
	public void testCalmString()
    {
        /* todo:
         * Please create jUnit code
         * to test calmString method on App.java
         * at least create 4 test cases using 'assertThat' (modern approach)
         * and 4 test cases using 'assertEquals' (traditional approach)
         */
		assertThat(App.calmString("egi!!"), is(equalTo("egi")));
		assertThat(App.calmString("!!egi!!"), is(equalTo("egi")));
		assertThat(App.calmString("!!e!!gi!!"), is(equalTo("egi")));
		assertThat(App.calmString("!!e!!g!!i!!"), is(equalTo("egi")));
		
		assertEquals("egi", App.calmString("egi!"));
		assertEquals("egi", App.calmString("!egi!"));
		assertEquals("egi", App.calmString("!e!gi!"));
		assertEquals("egi", App.calmString("!e!g!i!"));
    }
	
	@Test
	/**
	 * Test for CalmString
	 */
	public void testCalmAttendees()
    {
        /* todo:
         * Please create jUnit code using modern approach
         * to test calmAttendees method on App.java
         * at least create 3 test case using 'assertThat'
         */
		String[] _attendingParties1 = {"Republican of People's Democrat", "Liberalism"};
		String[] _attendingParties2 = {"National Democrat", "Dream Republican"};
	    List<String> attendingParties1 = Arrays.asList(_attendingParties1);
	    List<String> attendingParties2 = Arrays.asList(_attendingParties2);
	    int listSize1 = attendingParties1.size();
	    int listSize2 = attendingParties2.size();
	    
	    App.calmAttendees(attendingParties1);
	    App.calmAttendees(attendingParties2);
	    
		assertThat(attendingParties1, is(notNullValue()));
		assertThat(attendingParties1.size(), is(equalTo(listSize1)));
		assertThat(attendingParties2, is(notNullValue()));
		assertThat(attendingParties2.size(), is(equalTo(listSize2)));
    }
}
