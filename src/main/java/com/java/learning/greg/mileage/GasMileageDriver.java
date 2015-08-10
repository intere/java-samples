
package com.java.learning.greg.mileage;

public class GasMileageDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int gallons=0;
		int miles=0;
				
		GasMileage trip1 = new GasMileage(gallons, miles);
		
		System.out.println("Welcome to the gas mileage calculator.");
		trip1.determineMilesPerGallon();
	}

}
