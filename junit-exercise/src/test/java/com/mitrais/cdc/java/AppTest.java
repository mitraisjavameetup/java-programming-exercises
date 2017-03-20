package com.mitrais.cdc.java;

import com.mitrais.cdc.java.App;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

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
		assertEquals("Hello", App.calmString("Hello!"));
		assertEquals("off", App.calmString("o!f!f"));
		assertEquals("foo", App.calmString("!foo!"));
		assertEquals("zab", App.calmString("zab"));
		
		assertThat("Hello", is(equalTo(App.calmString("He!l!lo!"))));
				
    }
	
	@Test
	public void testCalmAttendees()
    {
        /* todo:
         * Please create jUnit code using modern approach
         * to test calmAttendees method on App.java
         * at least create 3 test case using 'assertThat'
         */
		List<String> politics = new ArrayList<>();
		politics.add("Democrat");
		politics.add("Increase");
		politics.add("Elite");
		politics.add("Politic");
		int awal = politics.size();
		App.calmAttendees(politics);
		assertThat(awal, is(equalTo(politics.size())));
		
		politics.add("Republican");		
		App.calmAttendees(politics);		
		assertThat(awal, is(equalTo(politics.size())));
		
		politics.add("Republican");
		politics.add("Democrat");
		awal = politics.size() - 1;
		App.calmAttendees(politics);
		assertThat(awal, is(equalTo(politics.size())));
    }
}
