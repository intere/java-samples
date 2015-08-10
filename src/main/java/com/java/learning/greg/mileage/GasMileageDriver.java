
package com.java.learning.greg.mileage;

public class GasMileageDriver {

	public static void main(String[] args) {
        //
		// Review Comment - there is no need to initialize gallons and miles here
        // I will comment out these next 3 lines, and we'll use the default (no-arg) constructor
        // for the GasMileage class.
//		int gallons=0;
//		int miles=0;
//
//		GasMileage trip1 = new GasMileage(gallons, miles);
        GasMileage trip1 = new GasMileage();
		
		System.out.println("Welcome to the gas mileage calculator.");
		trip1.determineMilesPerGallon();
	}

}
