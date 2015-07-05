package com.java.learning.greg;

import static org.junit.Assert.*;

import org.junit.Test;

public class IsItPrimeTest {

	@Test
	public void testIsPrime() {
		// It should tell us when a number is prime. 
		int primes[] = {2,3,5,7,11,23,73};
		for(int prime : primes) {
			assertTrue(prime + " did not register as prime", IsItPrime.isPrimeNumber(prime));
		}
	}
	
	@Test
	public void testIsNotPrime() {
		// What happens when we give it a number that's "not prime" (by our definition)
		int nonPrimes[] = {-1,0,1,4,6,8,9,10,500,2424};
		for(int nonPrime : nonPrimes) {
			assertFalse(nonPrime + " did register as prime", IsItPrime.isPrimeNumber(nonPrime));
		}
	}

}
