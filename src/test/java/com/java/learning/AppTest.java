package com.java.learning;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class AppTest
{
	@Test
	public void testIsPrime() {
		// It should tell us when a number is prime. 
		int primes[] = {3,5,7,11,23,73};
		for(int prime : primes) {
			assertTrue(prime + " did not register as prime", App.isPrime(prime));
		}
	}
	
	@Test
	public void testIsNotPrime() {
		// What happens when we give it a number that's "not prime" (by our definition)
		int nonPrimes[] = {-1,0,1,2,4,6,8,9,10,500,2424};
		for(int nonPrime : nonPrimes) {
			assertFalse(nonPrime + " did register as prime", App.isPrime(nonPrime));
		}
	}
	
	@Test
	public void testFindNextPrimeLessThan3() {
		// What happens when we give it a number 2 or less?
		int lessThan2[] = {-500, -100, -10, -1, 0, 1, 2};
		for(int toTest : lessThan2) {
			int nextPrime = App.findNextPrime(toTest);
			assertEquals("We didn't get the next prime, it should be 3", 3, nextPrime);
		}
	}
	
	@Test
	public void testFindNextPrime() {
		int primeSets[][] = {{3,5},{5,7},{7,11}};
		for(int[] set : primeSets) {
			int firstPrime = set[0];
			int expected = set[1];
			int actual = App.findNextPrime(firstPrime);
			assertEquals("Next Prime gave an unexpected value.", expected, actual);
		}
	}
}
