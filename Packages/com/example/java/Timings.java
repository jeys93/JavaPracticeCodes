package com.example.java;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.SplittableRandom;

public class Timings {
    public static void main (String[] args){
        /**for(String zoneid : ZoneId.getAvailableZoneIds()){
            ZoneId zoneId1 = ZoneId.of(zoneid);
            String zoneIdDisp = zoneId1.getDisplayName(TextStyle.FULL, Locale.US);
            System.out.println(zoneid + " - "+ zoneIdDisp);
        }**/
        ZoneId zoneId1 = ZoneId.of("Asia/Aden");
        LocalDateTime ldt = LocalDateTime.now();
        ZonedDateTime zdt1 = ZonedDateTime.of(ldt, zoneId1);
        System.out.println(zdt1);

        LocalDateTime ldt1 = LocalDateTime.MIN;
        System.out.println(ldt1);
    }
}