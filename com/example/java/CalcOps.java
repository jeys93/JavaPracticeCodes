package com.example.java;
import com.example.java.utilities.ArithOps;
import java.util.Scanner;

public class CalcOps {
    public static void main(String[] args) {
        System.out.println("Welcome to the class based Calculator program...!!!");

        Scanner scanner = new Scanner(System.in); //Reading user input

        System.out.print("Enter the input-1: ");
        double ip1 = scanner.nextDouble();

        System.out.print("Enter the input-2: ");
        double ip2 = scanner.nextDouble();

        System.out.print("Enter the operation to perform (+,*,/,-,%):");
        String op = scanner.next();

        System.out.println("Performing " + op + " Operation");

        ArithOps a = new ArithOps();
        System.out.println("The Output is : "+a.ops(op,ip1,ip2));
        }
    }