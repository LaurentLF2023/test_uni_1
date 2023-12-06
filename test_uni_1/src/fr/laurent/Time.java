package fr.laurent;

import java.time.LocalTime;

public class Time {
    public static boolean whenAreWe(LocalTime timeToCheck){

        LocalTime now = java.time.LocalTime.now();
        return now.isBefore(timeToCheck);
    }

}
