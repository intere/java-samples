package com.java.learning;

/**
 * 
 */
public class App 
{
    public static void main(String[] args)
    {
        if(args.length < 1) {
        	System.out.println("Incorrect Application Usage, please rerun again with the number of primes to find");
        	System.exit(1);
        }
        
        int numPrimes = Integer.parseInt(args[0]);
        if(numPrimes<0) {
        	System.out.println("Incorrect Application Usage: please provide a number greater than 0");
        }
        int primeCount = 0;
        int currentPrime = 0;
        while(primeCount< numPrimes) {
        	currentPrime = findNextPrime(currentPrime);
        	++primeCount;
        	System.out.println("Prime #" + primeCount + " = " + currentPrime);
        }
    }
    
    /**
     * This method will find you the next prime number that is higher than the number you provided.
     * @param number The number to begin checking (it starts at "number + 1").
     * @return The next prime number (or overflow INTEGER).
     */
    public static int findNextPrime(int number) {
    	int next = number + 1;
    	while(!isPrime(next)) {
    		++next;
    	}
    	return next;
    }
    
    /**
     * This method will tell you if the provided number is prime or not.
     * @param number The number to check to see if it's prime.
     * @return True if the provided number is prime (and greater than 2) and False otherwise.
     */
    public static boolean isPrime(int number)
    {
    	int countTo = number;
    	if(number > 4) {
    		countTo = (int)Math.ceil(Math.sqrt(number))+1;
    	}
    	for(int i=2; i<countTo; i++) {
    		if(number % i == 0) {
    			return false;
    		}
    	}
    	if(number > 1) {
    		return true;
    	} else {
    		return false;
    	}
    }
}
