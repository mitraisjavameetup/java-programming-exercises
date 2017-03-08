package mypackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class MultiTypeVariablesTest {

	@Test
	public void test_multiTypeVariables() {
		MultiTypeVariables vars = new MultiTypeVariables();
		String result = vars.runMultiTypeVars();
		assertNotNull(result);
		assertTrue(vars.runMultiTypeVars().getClass().equals(String.class));
	}

}
