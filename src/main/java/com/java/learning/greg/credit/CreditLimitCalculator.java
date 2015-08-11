package com.java.learning.greg.credit;

import java.util.Scanner;

public class CreditLimitCalculator {

	private int accountNumber;
	private int beginningBalance;
	private int totalCharges;
	private int totalCredits;
	private int creditLimit;
	private int newBalance;
	
	public CreditLimitCalculator () {
		this(0, 0, 0, 0, 0);
	}
	
	public CreditLimitCalculator(int accountNumber, int beginningBalance, int totalCharges
			, int totalCredits, int creditLimit) {
		setAccountNumber(accountNumber);
		setBeginningBalance(beginningBalance);
		setTotalCharges(totalCharges);
		setTotalCredits(totalCredits);
		setCreditLimit(creditLimit);
	}
	
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public void setBeginningBalance(int beginningBalance) {
		this.beginningBalance = beginningBalance;
	}
	
	public void setTotalCharges(int totalCharges) {
		this.totalCharges = totalCharges;
	}
	
	public void setTotalCredits(int totalCredits) {
		this.totalCredits = totalCredits;
	}
	
	public void setCreditLimit(int creditLimit) {
		this.creditLimit = creditLimit;
	}
	
	public int getAccountNumber() {
		return accountNumber;
	}
	
	public int getBeginningBalance() {
		return beginningBalance;
	}
	
	public int getTotalCharges() {
		return totalCharges;
	}
	
	public int getTotalCredits() {
		return totalCredits;
	}
	
	public int getCreditLimit() {
		return creditLimit;
	}
	
	public int calculateNewBalance() {
		newBalance = beginningBalance + totalCharges - totalCredits;
		return newBalance;
	}
	
	public void getAccountInfo() {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter account number: \n");
		if(input.hasNextInt()){
			accountNumber = input.nextInt();
		}
		System.out.print("Enter beginning balance: \n");
		if(input.hasNextInt()){
			beginningBalance = input.nextInt();
		}
		System.out.print("Enter charges: \n");
		if(input.hasNextInt()){
			totalCharges = input.nextInt();
		}
		System.out.print("Enter credits: \n");
		if(input.hasNextInt()){
			totalCredits = input.nextInt();
		}
		System.out.print("Enter credit limit: \n");
		if(input.hasNextInt()){
			creditLimit = input.nextInt();
		}
	}
	
	public void doesBalanceExceedLimit() {
		if(creditLimit < newBalance) {
			System.out.print("Credit limit exceeded!\n");
		}
	}
	
	public void displayAccountInfo() {
		System.out.printf("Account  Prev Balance  Charges  Credits  Credit Limit  New Balance%n" );
		System.out.printf("%-9d$%-,13d$%-,8d$%-,8d$%-,13d$%-,11d%n", accountNumber, beginningBalance, totalCharges, 
				totalCredits, creditLimit, newBalance);
	}
}
