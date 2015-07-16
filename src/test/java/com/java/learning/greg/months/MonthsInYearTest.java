package com.java.learning.greg.months;

import com.java.learning.greg.months.MonthsInYear;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by einternicola on 7/15/15.
 */
public class MonthsInYearTest  {

    @Test
    public void testMonthsInYearHas12Months() {
        assertEquals(12, MonthsInYear.values().length);
    }

    @Test
    public void testJanuaryIs1() {
        assertEquals(1, MonthsInYear.January.getMonthNumber());
    }

    @Test
    public void test1IsJanuary() {
        MonthsInYear expected = MonthsInYear.January;
        MonthsInYear actual = MonthsInYear.getMonthByNumber(1);

        assertEquals(expected, actual);
    }

    @Test
    public void testGetMonthByNumber() {
        for(MonthsInYear expectedMonth : MonthsInYear.values()) {
            int expectedMonthNumber = expectedMonth.getMonthNumber();
            MonthsInYear actual = MonthsInYear.getMonthByNumber(expectedMonthNumber);

            assertEquals("Get Month By Number did not give the right month for value: " + expectedMonthNumber, expectedMonth, actual);
        }
    }

    @Test
    public void testGetMonthByNumberUsingSwitch() {
        for(MonthsInYear expectedMonth : MonthsInYear.values()) {
            int expectedMonthNumber = expectedMonth.getMonthNumber();
            MonthsInYear actual = MonthsInYear.getMonthByNumberUsingSwitch(expectedMonthNumber);

            assertEquals("Get Month By Number using switch did not give the right month for value: " + expectedMonthNumber, expectedMonth, actual);
        }
    }

    @Test
    public void testGetMonthByNumberUsingLessTyping() {
        for(MonthsInYear expectedMonth : MonthsInYear.values()) {
            int expectedMonthNumber = expectedMonth.getMonthNumber();
            MonthsInYear actual = MonthsInYear.getMonthByNumberUsingLessTyping(expectedMonthNumber);

            assertEquals("Get Month By Number using less typing did not give the right month for value: " + expectedMonthNumber, expectedMonth, actual);
        }
    }
}
