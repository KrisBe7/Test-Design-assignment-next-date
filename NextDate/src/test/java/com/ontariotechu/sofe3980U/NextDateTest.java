package com.ontariotechu.sofe3980U;


import static org.junit.Assert.*;
import org.junit.Test;

///////////////// unit test for NextDate Class
public class NextDateTest {
    private NextDate nextday = new NextDate();

    ///Examples of some valid dates being tested.
    ///// the test result should be valid
    @Test
    public void testValidDates() {
        assertEquals("1/2/1812", nextday.nextdate(1, 1, 1812));

        assertEquals("2/29/2024", nextday.nextdate(2, 28, 2024));

        assertEquals("3/1/1812", nextday.nextdate(2, 29, 1812));

        assertEquals("5/3/2021", nextday.nextdate(5, 2, 2021));

        assertEquals("12/31/1812", nextday.nextdate(12, 30, 1812));

        assertEquals("1/1/2212", nextday.nextdate(12, 31, 2211));

        assertEquals("6/11/2021", nextday.nextdate(6, 10, 2021));
    }

    //////////////////////////////////////////////////////////////////////////////////
    // Examples of some invaid dates
    /// test is ture when the expected result is invalid .
    @Test
    public void testInvalidDates() {

        assertEquals("Invalid Date", nextday.nextdate(2, 29, 2021));

        assertEquals("Invalid Date", nextday.nextdate(2, 29, 1900));


        assertEquals("Invalid Date", nextday.nextdate(6, 31, 2021));

        assertEquals("Invalid Date", nextday.nextdate(9, 31, 2021));

        assertEquals("Invalid Date", nextday.nextdate(0, 1, 1812));

        assertEquals("Invalid Date", nextday.nextdate(1, 0, 1812));

        assertEquals("Invalid Date", nextday.nextdate(1, 1, 1811));

        assertEquals("Invalid Date", nextday.nextdate(1, 1, 2213));

        assertEquals("Invalid Date", nextday.nextdate(2, 30, 2021));


        assertEquals("Invalid Date", nextday.nextdate(4, 31, 2022));

        assertEquals("Invalid Date", nextday.nextdate(11, 31, 2021));

    }

    //////////////////////////////////////////////////////////////////////////////////////////////////////
    // Example of some test boundries values
    @Test
    public void testBoundaryValues() {

        assertEquals("Invalid Date", nextday.nextdate(0, 0, 1811));

        assertEquals("Invalid Date", nextday.nextdate(13, 1, 2212));

        assertEquals("12/31/2211", nextday.nextdate(12, 30, 2211));


    }
}
