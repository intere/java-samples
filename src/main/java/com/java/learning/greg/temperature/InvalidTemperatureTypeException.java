
package com.java.learning.greg.temperature;

/**
 * This is an exception that gets thrown if a user tried to creat a Temperature1
 * object using an invalid temperature type.
 * 
 * @author Greg Willis
 * @version 1.0
 */
public class InvalidTemperatureTypeException extends Exception {
	/**
	 * default constructor for InvalidTemperatureTypeException objects.
	 * It creates an InvalidTemperatureTypeException with a null detail message.
	 */
	public InvalidTemperatureTypeException() {
		
		super();
	}
	/**
	 * Constructor for InvalidTemperatureTypeException objects.
	 * It creates and InvalidTemperatureTypeException object with the 
	 * specified detail message.
	 */
	public InvalidTemperatureTypeException(String message) {
		
		super(message);
	}

}
