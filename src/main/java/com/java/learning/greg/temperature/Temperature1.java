
package com.java.learning.greg.temperature;

/**
 * Temperature stores a temperature in Fahrenheit, Celsius, 
 * and Kelvin scales
 * 
 * @author Greg Willis
 * @version 1.0
 */
public class Temperature1 {
	
	private double degreesFahrenheit; // Fahrenheit temperature
	private double degreesCelsius; // Celsius temperature
	private double degreesKelvin; // Kelvin temperature
	
	/**
	* This constructor for Temperature sets the temperature
	* values to the value in degrees, based on type
	* 
	* @param type temperature scale to use
	* @param degrees degrees Fahrenheit
	* @throws InvalidTemperatureException 
	*/
	public Temperature1(String type, double degrees) 
			throws InvalidTemperatureTypeException, InvalidTemperatureException {
	    if (!isTypeValid(type)){
	    	throw new InvalidTemperatureTypeException(type + " is not a valid type.");
	    }
	    if(type.equalsIgnoreCase("c"))
	        setDegreesCelsius(degrees);
	    else if (type.equalsIgnoreCase("F"))
	        setDegreesFahrenheit(degrees);
	    else if (type.equalsIgnoreCase("K"))
	        setDegreesKelvin(degrees);
	}
	
	/**
	 * setDegreesFahrenheit method sets the Fahrenheit temp
	 * 
	 * @param degrees the Fahrenheit value to store
	 */
	public void setDegreesFahrenheit(double degrees) throws InvalidTemperatureException {
		if(!isTemperatureValid("f", degrees)) {
			throw new InvalidTemperatureException(degrees + " is not a valid temperature.");
		} else {
			degreesFahrenheit = degrees; // set Fahrenheit value
			degreesCelsius = (degreesFahrenheit - 32.0) * 5.0 / 9.0; // set Celsius 
			degreesKelvin = degreesCelsius + 273.15; // set Kelvin value
		}
	}
	
	public void setDegreesCelsius(double degrees) throws InvalidTemperatureException {
		if(!isTemperatureValid("c", degrees)) {
			throw new InvalidTemperatureException(degrees + " is not a valid temperature.");
		} else {
			degreesCelsius = degrees;
			degreesFahrenheit = degreesCelsius * 9.0 / 5.0 + 32.0;
			degreesKelvin = degreesCelsius + 273.15;
		}
	}
	
	public void setDegreesKelvin(double degrees) throws InvalidTemperatureException {
		if(!isTemperatureValid("k", degrees)) {
			throw new InvalidTemperatureException(degrees + " is not a valid temperature.");
		} else {
			degreesKelvin = degrees;
			degreesCelsius = degreesKelvin - 273.15;
			degreesFahrenheit = degreesCelsius * 9.0 / 5.0 + 32.0;
		}
	}
	
	/**
	 * getDegreesCelsius retrieves the Celsius temp value
	 * 
	 * @return a double value containing the Celsius temp
	 */

	public double getDegreesCelsius() {
		return degreesCelsius;
	}
	
	/**
	 * getDegreesKelvin retrieves the Kelvin temp value
	 * 
	 * @return a double value containing the Kelvin temp
	 */
	public double getDegreesKelvin() {
		return degreesKelvin;
	}
	
	public double getDegreesFahrenheit() {
		return degreesFahrenheit;
	}
	
	public static boolean isTypeValid(String temperatureType) {
		if(temperatureType.equalsIgnoreCase("c") ||
				temperatureType.equalsIgnoreCase("f") ||
				temperatureType.equalsIgnoreCase("k")) {
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean isTemperatureValid(String temperatureType, double temperature) {
		if((temperatureType.equalsIgnoreCase("c") && temperature >= -273.15) ||
				(temperatureType.equalsIgnoreCase("f") && temperature >= -459.67) ||
				(temperatureType.equalsIgnoreCase("k") && temperature >= 0.0)) {
			return true;
		} else {
			return false;
		}
	}
}
