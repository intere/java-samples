package com.java.learning.greg.months;

import java.util.Scanner;

public class MonthsOfTheYearDriver {
	public static void main(String[] args) {
		int monthNumber;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter month number: ");
		if(input.hasNextInt()) {
			monthNumber = input.nextInt();

			MonthsInYear yourMonth = MonthsInYear.getMonthByNumber(monthNumber);

			if(null != yourMonth) {
				System.out.println("The month is: " + yourMonth);
			} else {
				System.out.println("Invalid Month Selected: " + monthNumber);
			}
		}
		else {
			System.out.print("Entry is not valid.");
		}
	}
}
