package com.java.learning.greg.mileage;

import java.util.Scanner;


public class GasMileage {
	
	private int gallons;
	private int miles;
	private int milesPerGallon;
	private int totalGallons;
	private int totalMiles;

    //
    // Code Review - We'll just have the no-arg constructor delegate to the other constructor
    //
    public GasMileage() {
        this(0, 0);
    }

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

        //
        // Code Review - this should be "&&", not "||"
        //
//        while(miles != -1 || gallons != -1) {
        while(miles != -1 && gallons != -1) {
			System.out.print("Enter miles or -1 to quit: ");
			miles = input.nextInt();

            //
            // Code Review: Consider this alternative flow:
            //
//			if(miles == -1)
//				break;
//			System.out.print("Enter gallons or -1 to quit: ");
//			gallons = input.nextInt();
//			if(gallons == -1)
//				break;
//			totalMiles = totalMiles + miles;
//			totalGallons = totalGallons + gallons;
//
//			System.out.printf("You entered %d miles and %d gallons \n",
//					miles, gallons);
//			System.out.printf("%d Total miles, %d Total gallons equals %d mpg\n", totalMiles, totalGallons
//					, milesPerGallon());

            if(miles != -1) {
                System.out.print("Enter gallons or -1 to quit: ");
                gallons = input.nextInt();
                if (gallons != -1) {

                    totalMiles = totalMiles + miles;
                    totalGallons = totalGallons + gallons;

                    System.out.printf("You entered %d miles and %d gallons \n",
                            miles, gallons);
                    System.out.printf("%d Total miles, %d Total gallons equals %d mpg\n", totalMiles, totalGallons
                            , milesPerGallon());
                }
            }

		}
	}
}
