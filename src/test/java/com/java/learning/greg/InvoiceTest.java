package com.java.learning.greg;

import static org.junit.Assert.*;

import org.junit.Test;


/**
 * Created by einternicola on 7/5/15.
 */
public class InvoiceTest {
    @Test
    public void testConstructor_nonNullArguments() {
        // Setup
        String expectedPartNumber = "OU812";
        String expectedPartDescription = "U2's Favorite Part: a guitar";
        int expectedQuantity = 1;
        double expectedPrice = 2739.99;

        // method under test
        Invoice testInvoice = new Invoice(expectedPartNumber, expectedPartDescription, expectedQuantity, expectedPrice);

        // Assertions
        assertEquals("Part Number is wrong", expectedPartNumber, testInvoice.getPartNumber());
        assertEquals("Part Description is wrong", expectedPartDescription, testInvoice.getPartDescription());
        assertEquals("Quantity is wrong", expectedQuantity, testInvoice.getQuantity());
        assertEquals("Price is wrong, BOB!", expectedPrice, testInvoice.getPrice(), 0.01);
    }

    @Test
    public void testConstructor_negativeQuantity() {
        // method under test
        Invoice testInvoice = new Invoice(null, null, -100, 0.0);

        // Assertions
        assertTrue("Quantity was negative, WTF?", testInvoice.getQuantity()>=0);
    }

    @Test
    public void testConstructor_negativePrice(){
        // method under test
        Invoice testInvoice = new Invoice(null, null, 0, -259.99);

        // Assertions
        assertTrue("Price was negative, WTF?", testInvoice.getPrice() >= 0.0);
    }


    @Test
    public void testSetQuantity_nonNegative() {
        // Setup
        Invoice testInvoice = new Invoice(null, null, 0, 0.0);

        for(int quantity=0; quantity<100; quantity++) {
            // method under test
            testInvoice.setQuantity(quantity);
            assertEquals("Quantity is invalid", quantity, testInvoice.getQuantity());
        }
    }

    @Test
    public void testSetQuantity_negative() {
        // Setup
        int expectedQuantity = 100;
        Invoice testInvoice = new Invoice(null, null, expectedQuantity, 0.0);

        // Method under test
        testInvoice.setQuantity(-500);

        // Assertions
        assertEquals("The Quantity is wrong", expectedQuantity, testInvoice.getQuantity());
    }

    @Test
    public void testSetCost_nonNegative(){
        // Setup
        Invoice testInvoice = new Invoice(null, null, 0, 0.0);

        for(double price=0.0; price<100.0; price += 5.7) {
            // method under test
            testInvoice.setPrice(price);

            // Assertions
            assertEquals("Price is invalid", price, testInvoice.getPrice(), 0.01);
        }
    }

    @Test
    public void testSetCost_negative(){
        // Setup
        double expectedPrice = 100.0;
        Invoice testInvoice = new Invoice(null, null, 0, expectedPrice);

        // Method under test
        testInvoice.setPrice(-500.04);

        // Assertions
        assertEquals("The Price is wrong, BOB!", expectedPrice, testInvoice.getPrice(), 0.01);
    }

    @Test
    public void testGetInvoiceAmount_greaterThanZero() {
        int expectedQuantity = 17;
        double expectedPrice = 2739.99;

        Invoice testInvoice = new Invoice(null, null, expectedQuantity, expectedPrice);
        assertEquals("Total Bill was wrong", (expectedQuantity * expectedPrice), testInvoice.getInvoiceAmount(), 0.01);
    }

    @Test
    public void testGetInvoiceAmount_zero() {
        Invoice testInvoice = new Invoice(null, null, 0, 0.0);

        assertEquals("Total Bill was wrong", 0.0, testInvoice.getInvoiceAmount(), 0.01);
    }
}
