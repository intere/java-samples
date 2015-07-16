
package com.java.learning.greg.temperature;

import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * Temperature1Test runs and tests the Temperture1 class.
 * 
 * @author Greg Willis
 * @version 1.0
 *
 */
public class Temperture1Test {

	public static void main(String[] args) {
		double inputTemperature = 0.0;
		Scanner input = new Scanner(System.in); 
        Temperature1 t1;
        String temperatureType = "";
        boolean moreTemperatures = true;

        while(moreTemperatures) {
        	System.out.print("Enter a temperature type (C = Celsius, " +
                    "F = Fahrenheit, K = Kelvin, Q = Quit): "); 
            temperatureType = input.next();
            if(temperatureType.equalsIgnoreCase("q")) {
            		moreTemperatures = false;
            		System.out.println("\nProgram ended.");
            } else {
            	System.out.println("Enter a temperature: ");
            	try {
            		inputTemperature = input.nextDouble();
            	}
            	catch (InputMismatchException e) {
            		System.err.println(e + " : You entered an invalid temperature." + 
            				"\nIt must be a numeric value.");
            		System.exit(1);
            	}
            	try {	
                	t1 = new Temperature1(temperatureType, inputTemperature);
                	if(temperatureType.equalsIgnoreCase("f")) {
                		System.out.println("You entered " + inputTemperature + 
                				" degrees Fahrenheit"); 
                		System.out.println("which is " + t1.getDegreesCelsius() + 
                				" degrees Celsius."); 
                		System.out.println("and " + t1.getDegreesKelvin() + 
                			" degrees Kelvin.");
                	} else if(temperatureType.equalsIgnoreCase("c")) {
                		System.out.println("You entered " + inputTemperature + 
                				" degrees Celsius"); 
                		System.out.println("which is " + t1.getDegreesFahrenheit() + 
                				" degrees Fahrenheit."); 
                		System.out.println("and " + t1.getDegreesKelvin() + 
                				" degrees Kelvin.");
                	} else if(temperatureType.equalsIgnoreCase("k")) {
                		System.out.println("You entered " + inputTemperature + 
                				" degrees Kelvin"); 
                		System.out.println("which is " + t1.getDegreesCelsius() + 
                				" degrees Celsius."); 
                		System.out.println("and " + t1.getDegreesFahrenheit() + 
                				" degrees Fahrenheit.");
                	} 
                } 
                catch (InvalidTemperatureTypeException e) {
                	System.err.println(e);
                	System.exit(1);
                }
                catch (InvalidTemperatureException e) {
                	System.err.println(e);
                	System.exit(1);
                }
            }
       }
	}
}
