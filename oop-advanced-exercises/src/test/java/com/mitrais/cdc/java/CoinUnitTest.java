package com.mitrais.cdc.java;

import static org.junit.Assert.*;

import org.junit.Test;

import com.mitrais.cdc.java.enums.*;

public class CoinUnitTest {
	@Test
	public void test() {
		assertNotNull(Coin.HEADS);
		assertNotNull(Coin.TAILS);
		
		//Also need check whether trainee created flip method that returns Coin.HEADS and Coin.TAILS with equal probability
	}
}
