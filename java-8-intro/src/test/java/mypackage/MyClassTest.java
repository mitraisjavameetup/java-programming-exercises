package mypackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyClassTest {

	@Test
	public void test_myClass() {
		MyClass myClass = new MyClass();
		String myClassResult = myClass.runMyClass();
		assertNotNull(myClassResult);
		assertTrue(myClass.runMyClass().getClass().equals(String.class));
	}

}
