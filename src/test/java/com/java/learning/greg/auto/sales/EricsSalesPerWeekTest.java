package com.java.learning.greg.auto.sales;

import com.java.learning.greg.auto.sales.EricsSalesPerWeek.Day;
import org.junit.Test;
import static org.junit.Assert.*;


/**
 * Created by einternicola on 8/18/15.
 */
public class EricsSalesPerWeekTest {

    @Test
    public void testIsValidDay_validDayValues() {
        for(Day day : Day.values()) {
            assertTrue(Day.isValidDay(day.getDay()));
            assertTrue(Day.isValidDay(day.getAbbrev()));
        }
    }

    @Test
    public void testIsValidDay_invalidDayValues() {
        String invalidValues[] = {null, "day", "tomorrow", "today", "yesterday"};

        for(String invalidDay : invalidValues) {
            assertFalse(Day.isValidDay(invalidDay));
        }
    }
}
