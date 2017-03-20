package com.mitrais.cdc.java;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import com.mitrais.cdc.java.App;
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
		assertThat("Hello",is(equalTo(App.calmString("!Hello!!"))));
		assertThat("Hehe",is(equalTo(App.calmString("!Hehe!!"))));
		assertThat("World",is(equalTo(App.calmString("!World!!"))));
		assertThat("Yeah",is(equalTo(App.calmString("!Yeah!!"))));
		
		//assertThat("Test", is(app.calmString("!Test")));
		
		assertEquals("Hello",App.calmString("!Hello!!"));
		assertEquals("Hehe",App.calmString("!!!!!!!Hehe!"));
		assertEquals("World", App.calmString("!World!"));
		assertEquals("Yeah", App.calmString("Yeah!!!"));
    }
	@Test
	public void testCalmAttendees()
    {
        /* todo:
         * Please create jUnit code using modern approach
         * to test calmAttendees method on App.java
         * at least create 3 test case using 'assertThat'
         */
		List<String> guest = new ArrayList<String>();
		guest.add("Republican");
		guest.add("FirstTest");
		App.calmAttendees(guest);
		assertThat(2,is(equalTo(guest.size())));
		guest.add("SecondTest");
		App.calmAttendees(guest);
		assertThat(3,is(equalTo(guest.size())));
		guest.add("Democrat");
		App.calmAttendees(guest);
		assertThat(3,is(equalTo(guest.size())));
		
    }
}
