package com.example.java;
import java.util.Objects;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Welcome to the Simple Calculator program...!!!");

        Scanner scanner = new Scanner(System.in); //Reading user input

        System.out.print("Enter the input-1: ");
        double ip1 = scanner.nextDouble();

        System.out.print("Enter the input-2: ");
        double ip2 = scanner.nextDouble();

        System.out.print("Enter the operation to perform (+,*,/,-,%):");
        String op = scanner.next();

        if (Objects.equals(op, "+")){
                System.out.println("Performing Addition Operation:");
                double result = ip1+ip1;
                System.out.print("The Output is:"+ result);
            }else if (Objects.equals(op,"*")) {
                System.out.println("Performing Multiplication Operation");
                double result = ip1 * ip2 ;
                System.out.print("The Output is:"+ result);
            }else if (Objects.equals(op,"/")) {
                System.out.println("Performing Division Operation");
                double result = ip1 / ip2;
                System.out.print("The Output is:" + result);
            }else if (Objects.equals(op,"%")) {
                System.out.println("Performing Modulous Operation");
                double result = ip1 % ip2;
                System.out.print("The Output is:" + result);
            }else if (Objects.equals(op,"-")) {
                System.out.println("Performing Substraction Operation");
                double result = ip1 - ip2;
                System.out.print("The Output is: " + result);
            }else {
                System.out.println("Not a valid operation");
            }

        }

    }
