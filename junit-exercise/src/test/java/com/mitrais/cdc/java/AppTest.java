package com.mitrais.cdc.java;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import java.util.ArrayList;
import java.util.List;

import org.hamcrest.Matcher;
import org.junit.Test;
import com.mitrais.cdc.java.App;
/**
 * Unit test for simple App.
 */
public class AppTest{
	
	@Test
	public void testCalmString()
    {
		String notCalmString="!!FOOOO!!!";
		String notCalmString2="!FOO!OO";
		String notCalmString3="!!FOOOO";
		String notCalmString4="FOOOO";
		assertNotNull(App.calmString(notCalmString));
		assertEquals("FOOOO",App.calmString(notCalmString));
		assertTrue(!App.calmString(notCalmString).contains("!"));
		assertTrue(App.calmString(notCalmString).length()>0);
		
		assertNotNull(App.calmString(notCalmString2));
		assertEquals("FOOOO",App.calmString(notCalmString2));
		assertTrue(!App.calmString(notCalmString2).contains("!"));
		assertTrue(App.calmString(notCalmString2).length()>0);
		
		assertNotNull(App.calmString(notCalmString3));
		assertEquals("FOOOO",App.calmString(notCalmString3));
		assertTrue(!App.calmString(notCalmString3).contains("!"));
		assertTrue(App.calmString(notCalmString3).length()>0);
		
		assertNotNull(App.calmString(notCalmString4));
		assertEquals("FOOOO",App.calmString(notCalmString4));
		assertTrue(!App.calmString(notCalmString4).contains("!"));
		assertTrue(App.calmString(notCalmString4).length()>0);
        /* todo:
         * Please create jUnit code
         * to test calmString method on App.java
         * at least create 4 test cases using 'assertThat' (modern approach)
         * and 4 test cases using 'assertEquals' (traditional approach)
         */
		
    }
	
	@Test
	public void testCalmAttendees()
    {
		List<String> parties=new ArrayList<String>();
		parties.add("Republican");
		parties.add("Democrat");
		parties.add("notRepublican");
		parties.add("notRepublican");
		parties.add("Democrat");
		parties.add("Republican");
        /* todo:
         * Please create jUnit code using modern approach
         * to test calmAttendees method on App.java
         * at least create 3 test case using 'assertThat'
         */
		
		assertThat(6,is(parties.size()));
		App.calmAttendees(parties);
		assertThat(4,is(parties.size()));
		ArrayList<String> parties2=new ArrayList<String>();
		parties2.add("Republican");
		parties2.add("Democrat");
		App.calmAttendees(parties2);
		assertThat(1,is(parties2.size()));
		
    }

	
}
