package com.example.java;

import java.util.Scanner;

public class Comparingstrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the String-1: ");
        String ip1 = scanner.nextLine();
        int l1 = ip1.length();
        char str1[] = ip1.toCharArray();

        System.out.print("Enter the String-2: ");
        String ip2 = scanner.nextLine();
        int l2 = ip2.length();
        char str2[] = ip2.toCharArray();

        if (l1 == l2) {
            for (int i=0;i<=l1;i++) {
                for (int j=i; j<=i;j++) {
                    if (str1[i] == str2[j]) {
                        System.out.println("Two Strings are equal and identical");
                    }
                    else if(str1[i] != str2[j])  {
                        System.out.println("Two String are equal but not identical");
                    }
                }
            }
        }
        System.out.println("Strings are not equal and identical");
    }
}