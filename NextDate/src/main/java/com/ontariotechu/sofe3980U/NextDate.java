package com.ontariotechu.sofe3980U;

import javax.accessibility.AccessibleEditableText;


/////code for the next date function
public class NextDate {
    public String nextdate(int month, int day, int year) {
        // Check if date is valid
        if (!isValidDate(month, day, year)) {
            return "Invalid Date";
        }

        //This is to check for the end of months
        if (day == daysInMonth(month, year)) {
            day = 1;
            month++;

            // this checks end of year
            if (month == 13) {
                month = 1;
                year++;
            }
        } else {
            day++;
        }
        return month + "/" + day + "/" + year;
    }

////////////////////////////////////////////////////////////////////
    /////////bound check ////////
    private boolean isValidDate(int month, int day, int year) {
        //// check for the year /////
        if (year < 1812 || year > 2212) {
            return false;
        }
        // month
        if (month < 1 || month > 12) {
            return false;
        }
        // day bounds
        if (day < 1 || day > daysInMonth(month, year)) {
            return false;
        }
        return true;
    }


//////////////////////////////////////////////////////////
    private int daysInMonth(int month, int year) {
        switch (month) {
            case 2:
                return isLeapYear(year) ? 29 : 28;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            default:
                return 31;
        }
    }
////////////////// every 4 year check for the leap year
    private boolean isLeapYear(int year) {
        if (year % 4 != 0) {
            return false;
        } else if (year % 100 != 0) {
            return true;
        } else if (year % 400 != 0) {
            return false;
        } else {
            return true;
        }
    }
}
