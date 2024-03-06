package com.example.java;

public class MaxValues {
    public static void main(String[] args) {
        byte b = 123;
        //System.out.println("The byte value is " + b);
        if(b< Byte.MAX_VALUE) {
            b++;
            System.out.println("The byte value is " + b);
        }
        System.out.println("The byte value is " + b);
    }
}
