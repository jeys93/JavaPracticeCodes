package com.example.java;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;

public class ldate {
    public static void main(String[] args){

        LocalTime ld1 = LocalTime.now();
        LocalDate ld2 = LocalDate.of(2023,1,31);
        LocalDate ld3 = LocalDate.of(2022, Month.AUGUST, 30);

        System.out.println(ld1);
        System.out.println(ld2);
        System.out.println(ld3);
    }
}
