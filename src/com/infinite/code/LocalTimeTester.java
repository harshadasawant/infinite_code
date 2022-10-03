package com.infinite.code;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class LocalTimeTester {
    public static void main(String[] args) {
        LocalTime current = LocalTime.now();
        System.out.println("Current Time :- "+current);

        System.out.println();
        System.out.println("************"+"of()"+"************");
        System.out.println("LocalTime.of(2, 55, 29) :- "+LocalTime.of(2, 55, 29));
		/*
		 * 	of(int hour, int minute, int second, int nanoOfSecond)
			(mandatory) hour => the hour-of-day to represent, from 0 to 23
			(mandatory) minute => the minute-of-hour to represent, from 0 to 59
			(optional) 	second => the second-of-minute to represent, from 0 to 59
			(optional)  nanoOfSecond => the nano-of-second to represent, from 0 to 999,999,999
*/

        System.out.println();
        System.out.println("************"+"Functions to access date information"+"************");
        System.out.println("What is the current hour going on .... ? :- "+LocalTime.now().getHour());
		/*
			Try with different scenarios with functions such as getMinute(),getNano() etc.
		*/

        System.out.println();
        System.out.println("************"+"LocalTime Calculations"+"************");
        System.out.println("Time after 20 hours ?	 => "+LocalTime.now().plusHours(20));

/*
			Try with different scenarios with functions such as plusMinutes(),plusSeconds() etc.
		*/

        System.out.println();
        System.out.println("************"+"Difference using ChrnoUnit"+"************");
        LocalTime timeObj = LocalTime.of(23,20);
        System.out.println("Difference Between current time and timeObj :- "+ ChronoUnit.HOURS.between( LocalTime.now(),timeObj));
/*

			Exercise :-
						Thomas has to board train departing at 8:00 PM, You have to check whether he will be able to board or not.
						It takes him 2.5 hrs to reach the station and further 15 mins to reach the platform.
						Before what time should he leave his house in order to board the train ?
						(Hint :- You can use isAfter() and isBefore() methods, take reference from LocalDate tryout)

		*/
        LocalDateTime currentDate = LocalDateTime.now();
        System.out.println(currentDate); // output in default format eg. 2020-03-06T16:25:10.257251100

        System.out.println(currentDate.getDayOfWeek()); // will give today's day eg. FRIDAY


        DateTimeFormatter df1 = DateTimeFormatter.ofPattern("dd/MM/yyyy/ hh:mm:ss a");  // a is used to display 12 hr clock
        System.out.println(df1.format(currentDate)); //output in specified format eg. 06/03/2020/ 04:32:35 PM

        DateTimeFormatter df2 = DateTimeFormatter.ofPattern("eeee dd/MM/yyyy/ hh:mm:ss a");
        System.out.println(df2.format(currentDate));
        //output :- Friday 06/03/2020/ 04:50:54 PM

        DateTimeFormatter dfNew = DateTimeFormatter.ofPattern("eee dd/MM/yyyy/ hh:mm:ss a");
        System.out.println(dfNew.format(currentDate));
        //output :- Fri 06/03/2020/ 04:50:54 PM

        //output :- Friday 06/03/2020/ 04:50:54 PM
    }

}
