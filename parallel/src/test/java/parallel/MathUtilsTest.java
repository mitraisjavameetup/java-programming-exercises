package parallel;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.mitrais.cdc.java.MathUtils;

public class MathUtilsTest {

	@Test
	public void test_markPrimesSerial() {
		int lowerIndex = 2;
		int upperIndex = 10;
		int size = upperIndex + 1;
		boolean[] primeFlags = new boolean[size];
		MathUtils.markPrimesSerial(primeFlags,lowerIndex,upperIndex);
		assertFalse(primeFlags[0]);
		assertFalse(primeFlags[1]);
		assertTrue(primeFlags[2]);
		assertTrue(primeFlags[3]);
	}
	
	@Test
	public void test_markPrimesSerial_singleParam() {
		int upperIndex = 10;
		boolean[] primeFlags = new boolean[upperIndex+1];
		MathUtils.markPrimesSerial(primeFlags);
		assertFalse(primeFlags[0]);
		assertFalse(primeFlags[1]);
		assertTrue(primeFlags[2]);
		assertTrue(primeFlags[3]);
		assertFalse(primeFlags[4]);
		assertTrue(primeFlags[5]);
	}
	
	@Test
	public void test_markPrimesParallel_singleParam() {
		int upperIndex = 10;
		boolean[] primeFlags = new boolean[upperIndex+1];
		
		MathUtils.markPrimesParallel(primeFlags);
		
		assertFalse(primeFlags[0]);
		assertFalse(primeFlags[1]);
		assertTrue(primeFlags[2]);
		assertTrue(primeFlags[3]);
		assertFalse(primeFlags[4]);
		assertTrue(primeFlags[5]);
	}
	
	@Test
	public void test_collectPrimes() {
		int upperIndex = 1000;
		boolean[] primeFlags = new boolean[upperIndex];
		MathUtils.markPrimesSerial(primeFlags);
		List<Integer> primeList = MathUtils.collectPrimes(primeFlags);
		assertTrue(primeList.size() == 168);
		assertTrue(primeList.get(primeList.size() - 1) == 997);
	}
	
	@Test
	public void test_findPrimesSerial_booleanArrayParameter() {
		int upperIndex = 1000;
		boolean[] primeFlags = new boolean[upperIndex];
		List<Integer> primeList = MathUtils.findPrimesSerial(primeFlags);
		assertTrue(primeList.size() == 168);
		assertTrue(primeList.get(primeList.size() - 1) == 997);
	}
	
	@Test
	public void test_findPrimesSerial_sizeParameter() {
		int upperIndex = 1000;
		List<Integer> primeList = MathUtils.findPrimesSerial(upperIndex);
		assertTrue(primeList.size() == 168);
		assertTrue(primeList.get(primeList.size() - 1) == 997);
	}
	
	@Test
	public void test_findPrimesParallel_booleanArrayParameter() {
		int upperIndex = 1000;
		boolean[] primeFlags = new boolean[upperIndex];
		List<Integer> primeList = MathUtils.findPrimesParallel(primeFlags);
		assertTrue(primeList.size() == 168);
		assertTrue(primeList.get(primeList.size() - 1) == 997);
		
	}
	
	@Test
	public void test_findPrimesParallel_sizeParameter() {
		int upperIndex = 1000;
		List<Integer> primeList = MathUtils.findPrimesParallel(upperIndex);
		assertTrue(primeList.size() == 168);
		assertTrue(primeList.get(primeList.size() - 1) == 997);
	}

}
