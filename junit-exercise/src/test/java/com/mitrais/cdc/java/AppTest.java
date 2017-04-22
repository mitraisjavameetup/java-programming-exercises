package com.mitrais.cdc.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.*;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
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
		String s1 = "!!!qwe!qwe!";
		String s2 = "zxc!!";
		String s3 = "abc";
		String s4 = "po!iuy!";
		String s5 = null;
		
		assertThat("qweqwe",is(equalTo(App.calmString(s1))));
		assertThat("zxc",is(equalTo(App.calmString(s2))));
		assertThat("abc",is(equalTo(App.calmString(s3))));
		assertThat("poiuy",is(equalTo(App.calmString(s4))));
		assertThat(null,is(equalTo(App.calmString(s5))));

		assertEquals(App.calmString(s1),"qweqwe");
		assertEquals(App.calmString(s2),"zxc");
		assertEquals(App.calmString(s3),"abc");
		assertEquals(App.calmString(s4),"poiuy");
		assertEquals(App.calmString(s5),null);
    }
	
	@Test
	public void testCalmAttendees()
    {
        /* todo:
         * Please create jUnit code using modern approach
         * to test calmAttendees method on App.java
         * at least create 3 test case using 'assertThat'
         */
		List<String> attendingParties =
				new ArrayList<>(Arrays.asList("Republican", "Republican", "Democrat", "Democrat", "Democrat"));
		List<String> attendingParties2=
				new ArrayList<>(Arrays.asList("Democrat", "Democrat", "Democrat", "Democrat"));
		List<String> attendingParties3 =
				new ArrayList<>(Arrays.asList("Republican", "Republican", "Republican", "Republican"));
		List<String> attendingParties4 = null;
		
		List<String> parties = App.calmAttendees(attendingParties);
		
		assertThat(parties.contains("Republican") && parties.contains("Democrat"), is(equalTo(false)));
		assertThat(attendingParties2, is(equalTo(App.calmAttendees(attendingParties2))));
		assertThat(attendingParties3, is(equalTo(App.calmAttendees(attendingParties3))));
		assertThat(null, is(equalTo(App.calmAttendees(attendingParties4))));
    }
}
