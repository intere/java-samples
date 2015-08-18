package com.java.learning.greg.auto.sales;

import java.util.Scanner;

/**
 * Problem:  Write a program to ask a user for sales information. For each sale, have the user enter the day of the
 * week and the amount of the sale. Store total sales for each day of the week in an array, and after the last sale is
 * entered, list the sales for each day and tell which day had the highest sales. If you are looking for a tougher
 * challenge, you can also store the number of sales for each day and calculate the average amount of each sale for
 * each day of the week.
 */
public class SalesPerWeek {

	public static void main(String[] args) {
		String[] days;
		double[] salesTotal;
		int[] salesCounter;
		boolean keepGoing;
		double largest = 0;
		String bestDay = "";
		Scanner input = new Scanner(System.in);
		
		days = new String[7];
		salesTotal = new double[7];
		salesCounter = new int[7];
		
		for(int i = 0; i < 7; i++) {
			keepGoing = true;
			System.out.print("Enter day: ");
			days[i] = input.next();
			while(keepGoing) {
				System.out.print("Enter sale amount: ");
				String userInput = input.next();
				
				if(userInput.equals("*")) {
					keepGoing = false;
				} else {
					try {
						double sale = Double.parseDouble(userInput);
						salesTotal[i] += sale;
						salesCounter[i]++;
					} catch(NumberFormatException ex) {
						System.out.println("Input error, enter a valid number or * to quit");
					}
					
				} // end if-else
			} // end while
		} // end for loop
		
		for(int i = 0; i < 7; i++) {
			System.out.printf("%s had $%,.2f total sales.%n", days[i] , salesTotal[i]);
			System.out.printf("$%,.2f sales average.%n", salesTotal[i]/salesCounter[i]);
		} // end for loop
		
		for(int i = 0; i < 7; i++) {
			if(salesTotal[i] > largest) {
				largest = salesTotal[i];
				bestDay = days[i];
			} // end if
		} // end for loop
		
		System.out.printf("%s's sales of $%,.2f is the largest.", bestDay, largest);
	} // end main
} // end class
