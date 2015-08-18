package com.java.learning.greg.auto.sales;

import java.util.*;

/**
 * Problem:  Write a program to ask a user for sales information. For each sale, have the user enter the day of the
 * week and the amount of the sale. Store total sales for each day of the week in an array, and after the last sale is
 * entered, list the sales for each day and tell which day had the highest sales. If you are looking for a tougher
 * challenge, you can also store the number of sales for each day and calculate the average amount of each sale for
 * each day of the week.
 */
public class EricsSalesPerWeek {
    // Where we keep the sales data:
    private Map<String, List<Double>> sales = new HashMap<String, List<Double>>();

    // keep track of the current day and sale:
    private Day currentDay;
    private Double currentSale;

    // keep track of whether or not we should exit:
    private boolean exit = false;

    // Keep an input scanner reference around:
    private Scanner input = new Scanner(System.in);


    /**
     * Entry point to the program.
     * @param args
     */
    public static void main(String[] args) {
        new EricsSalesPerWeek().begin();
    }

    /**
     * This is where this class begins reading user input, this is the program loop.
     */
    public void begin() {

        // As long as we should not exit, keep adding sales:
        while(!exit) {

            // First, reset things.
            reset();

            // Note: taking advantage of short circuit: if readDay return false, readSale is never called
            if(readDay() && readSale()) {
                addSale(currentDay, currentSale);
            }
        }

        // After all is said and done, print out the summary:
        printSummary();
    }

    /**
     * Reads the sale value, sets the program exit (if the user enters the exit string), sets
     * the current sale (if valid) and returns true if things are good, false if they're not.
     * @return True if a valid sale value could be read, false otherwise.
     */
    protected boolean readSale() {
        System.out.print("Enter sale amount (enter '*' to exit): ");
        String sale = input.next();
        if(isExitString(sale)) {
            exit = true;
        } else {
            currentSale = validateSale(sale);
        }

        return null != currentSale;
    }

    /**
     * Reads the Day value, sets the program exit if the user enters the exit string,
     * sets the current day (if valid) and returns true if things are good, false if they're not.
     * @return True if a day could be read, false otherwise.
     */
    protected boolean readDay() {
        System.out.print("Enter day (enter '*' to exit): ");
        String day = input.next();
        if(isExitString(day)) {
            exit = true;
            return false;
        }
        currentDay = validateDay(day);
        return Day.isValidDay(day);
    }

    /**
     * Resets the current Day and Sale.
     */
    protected void reset() {
        currentDay = null;
        currentSale = null;
    }

    /**
     * Prints out the weekly summary.
     */
    protected void printSummary() {
        for(Day day : Day.values()) {
            // Only print a summary for the days that we have sales for:
            if(sales.containsKey(day.getDay())) {
                String dayName = day.getDay();
                double salesForDay = calculateDaysSales(sales.get(day.getDay()));
                int numberOfSales = sales.get(day.getDay()).size();

                System.out.println("Sales for " + day.getDay() + ":");
                System.out.println("\t" + numberOfSales + " sales made");
                System.out.println("\t$" + salesForDay + " in sales");
                System.out.println();
            }
        }
    }

    /**
     * Adds up the sales for the provided list of a days sales.
     * @param daySales The sales for a given day.
     * @return The sum of the sales.
     */
    protected Double calculateDaysSales(List<Double> daySales) {
        double sales = 0.0;
        for(Double sale : daySales) {
            sales += sale;
        }
        return sales;
    }

    /**
     * Is the provided string an "Exit the program" string?
     * @param checkString The string to check.
     * @return True if the user provided the exit string, false otherwise.
     */
    protected boolean isExitString(String checkString) {
        return "*".equals(checkString);
    }

    /**
     * This method will check the provided day string and give you back the day object.
     * @param day The Day String (or day abbreviatoin).
     * @return
     */
    protected Day validateDay(final String day) {
        Day date = Day.getDayByNameOrAbbreviation(day);
        if(null == date) {
            System.out.println("ERROR: Invalid Day provided: " + day);
        }
        return date;
    }

    /**
     * This method will check the provided sale string and give you back the Double value.
     * @param sale The sale to analyze.
     * @return The sale as a Double, or null if it's not valid.
     */
    protected Double validateSale(final String sale) {
        Double saleValue = null;
        try {
            saleValue = Double.parseDouble(sale);
        } catch(NumberFormatException ex) {
            System.out.println("Invalid Sale value: " + sale);
        }
        return saleValue;
    }

    /**
     * Adds a Sale to the map.
     * @param day The day of the week to add.
     * @param salePrice The sale price.
     */
    protected void addSale(Day day, double salePrice) {
        // Ensure the Map has a list for the given day.
        if(!sales.containsKey(day.getDay())) {
            sales.put(day.getDay(), new ArrayList<Double>());
        }

        // Add the sale to the list for the provided day.
        sales.get(day.getDay()).add(salePrice);
    }

    /**
     * Helper Enumeration, tells us if it's a valid day or not.
     */
    protected enum Day {
        Sunday("sunday", "sun"),
        Monday("monday", "mon"),
        Tuesday("tuesday", "tue"),
        Wednesday("wednesday", "wed"),
        Thursday("thursday", "thu"),
        Friday("friday", "fri"),
        Saturday("saturday", "sat");

        private String day;
        private String abbrev;

        Day(String day, String abbrev) {
            this.day = day;
            this.abbrev = abbrev;
        }

        public String getDay() {
            return day;
        }

        public String getAbbrev() {
            return abbrev;
        }

        /**
         * Give me a day or abbreviation string, and I'll tell you if it's a valid day of the week string.
         * @param dayOrAbbreviation The Day or abbreviation string.
         * @return True if it's a valid day, false otherwise.
         */
        public static boolean isValidDay(String dayOrAbbreviation) {
            return null != getDayByNameOrAbbreviation(dayOrAbbreviation);
        }

        /**
         * Give me a day or abbreviation string, and I'll give you back the day of the week for it.
         * @param dayOrAbbreviation The Day or abbreviation string.
         * @return The Day object that represents the day of the week.
         */
        public static Day getDayByNameOrAbbreviation(String dayOrAbbreviation) {
            if ( null != dayOrAbbreviation ) {
                for (Day day : Day.values()) {
                    if(dayOrAbbreviation.toLowerCase().equals(day.day) || dayOrAbbreviation.toLowerCase().equals(day.abbrev)) {
                        return day;
                    }
                }
            }
            return null;
        }
    }
}
