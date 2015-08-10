package com.java.learning.greg.mileage;

import java.util.Scanner;


public class GasMileage {
	
	private int gallons;
	private int miles;
	private int milesPerGallon;
	private int totalGallons;
	private int totalMiles;
	
	public GasMileage(int gallons, int miles) {
		setGallons(gallons);
		setMiles(miles);
	}
	
	public void setGallons(int gallons) {
		this.gallons = gallons;
	}
	
	public void setMiles(int miles) {
		this.miles = miles;
	}
	
	public int getGallons(int gallons) {
		return gallons;
	}
	
	public int getMiles(int miles) {
		return miles;
	}
	
	public int milesPerGallon() {
		milesPerGallon = totalMiles / totalGallons;
		return milesPerGallon;
	}
	
	public void determineMilesPerGallon() {
		Scanner input = new Scanner(System.in);
		while(miles != -1 || gallons != -1) {
			System.out.print("Enter miles or -1 to quit: ");
			miles = input.nextInt();
			if(miles == -1)
				break;
			System.out.print("Enter gallons or -1 to quit: ");
			gallons = input.nextInt();
			if(gallons == -1)
				break;
			totalMiles = totalMiles + miles;
			totalGallons = totalGallons + gallons;
			
			System.out.printf("You entered %d miles and %d gallons \n", 
					miles, gallons);
			System.out.printf("%d Total miles, %d Total gallons equals %d mpg\n", totalMiles, totalGallons
					, milesPerGallon());
		}
	}
}
