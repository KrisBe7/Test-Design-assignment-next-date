package com.ontariotechu.sofe3980U;


public class App {
    public static void main(String[] args) {
        NextDate nextDate = new NextDate();

        // Some example for valid dates
        // 3/1/2021
        System.out.println(nextDate.nextdate(2, 28, 2021));
        // 2/29/2020

        System.out.println(nextDate.nextdate(2, 28, 2020));
        // 1/1/2212
        System.out.println(nextDate.nextdate(12, 31, 2211));



        //////////////////////////////////////////////////
        // examples of invalid dates
        System.out.println(nextDate.nextdate(2, 29, 2021));


        System.out.println(nextDate.nextdate(4, 31, 2021));
        System.out.println(nextDate.nextdate(13, 1, 2021));
        System.out.println(nextDate.nextdate(2, 29, 1900));


    }

}
