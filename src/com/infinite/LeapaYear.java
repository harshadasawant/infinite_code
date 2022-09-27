package com.infinite;

public class LeapaYear {
    public static void main(String[] args) {

        int year = 1900;
        boolean leap = false;
        if(year % 4 == 0){
            //since every 100th year is not a leap year, so
            if(( year % 100 == 0) && (year%400==0))
                //checking for century year is leap year or not
                leap = true;
            else if(year % 100 != 0)
                leap = true;
            else
                leap = false;
        }
        else
            leap = false;

        if(leap)
            System.out.println(year + " is a leap year.");
        else
            System.out.println(year + " is not a leap year.");
    }

}
