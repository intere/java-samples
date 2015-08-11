package com.java.learning.greg.credit;

import java.util.Scanner;

public class CreditLimitCalculatorDriver {

	public static void main(String[] args) {
		boolean continueDataEntry = true;
		Scanner input = new Scanner(System.in);
		CreditLimitCalculator acct1 = new CreditLimitCalculator();
		
		while(continueDataEntry == true) {
			acct1.getAccountInfo();
			acct1.calculateNewBalance();
			acct1.doesBalanceExceedLimit();
			acct1.displayAccountInfo();
			
		System.out.print("Another entry? (Y/N\n");
			if(input.next().equalsIgnoreCase("y")) {
				continueDataEntry = true;
			} else {
				continueDataEntry = false;
			}
		}
	}

}
