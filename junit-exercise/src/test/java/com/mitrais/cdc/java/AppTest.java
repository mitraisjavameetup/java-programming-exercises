package com.mitrais.cdc.java;
import static org.junit.Assert.*;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import static org.hamcrest.CoreMatchers.*;
import org.hamcrest.core.IsEqual;
import org.junit.*;
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
		//assertThat("")
	assertThat("foo",is(App.calmString("foo!")));
	assertThat("boo",is(App.calmString("boo!")));
	assertThat("too",is(App.calmString("too!")));
	assertThat("xoo",is(App.calmString("xoo!")));
	
	assertEquals("waw", App.calmString("waw!"));
	assertEquals("waow", App.calmString("waow!"));
	assertEquals("wuw", App.calmString("wuw!"));
	assertEquals("wiw", App.calmString("wiw!"));

	

    }
	
	public void testCalmAttendees()
    {
		//assertThat("oof!"),is(equalTo(Stringutils.reverseString("oof")));
		//assertThat("rab!"),is(equalTo(Stringutils.reverseString("rab")));
		//assertThat("ber!"),is(equalTo(Stringutils.reverseString("ber")));
		//assertThat("kar!"),is(equalTo(Stringutils.reverseString("kar")));
		
		//assertEquals()
        /* todo:
         * Please create jUnit code using modern approach
         * to test calmAttendees method on App.java
         * at least create 3 test case using 'assertThat'
         */
		List<String> attendingParties = new ArrayList<>();
		attendingParties.add("Republican");
		attendingParties.add("Democrat");
		attendingParties.add("Presiden");
		attendingParties.add("Wakil");
		
		List<String> result = new ArrayList<>();
		result.add("Republican");
		result.add("Presiden");
		result.add("Wakil");
		
	assertThat(result,is(App.calmAttendees(attendingParties))));	
    
   
	}
}
