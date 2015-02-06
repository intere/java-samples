package com.java.learning.greg;

import java.util.Scanner;
import static java.lang.System.out;
import static java.lang.System.in;


public class IsItPrime {
	
	public static void main(String args[])
	{	
		out.println("Enter -1 to exit");		
		int number = 0;
		while(true) {
			// Step 1: Get a number from the user
			number = getNumberFromUser();
			
			// Step 2: Did they enter the "goodbye" number?
			if(number == -1) {
				out.println("Goodbye");
				break;
			}	
			
			// Step 3: Is the number prime?
			boolean isPrime = isPrimeNumber(number);
			
			// Step 4: Tell the user if their number is prime:
			informUserOfPrimeStatus(number, isPrime);
		}		
	}
	
	public static void informUserOfPrimeStatus(int number, boolean isPrime) {
		if(isPrime == true)
		{
			out.println(number + " is prime.");
		}
		
		if(isPrime == false)
		{
			out.println(number + " is not prime.");
		}
	}
	
	public static int getNumberFromUser() {
		Scanner myScanner = new Scanner(in);
		out.println("Enter a number:");		
		return myScanner.nextInt();
	}
	
	public static boolean isPrimeNumber(int number) {
		boolean isPrime = false;
		
		for(int i = 2; i < number; i++)
		{			
			if(number % i != 0)
			{
				isPrime = true;
			} 
			else
			{
				isPrime = false;
				break;
			}
		}		
		
		if(number == 2)
		{
			isPrime = true;
		}
		
		return isPrime;
	}
}
