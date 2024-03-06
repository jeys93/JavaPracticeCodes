package com.example.java;

import java.util.ArrayList;
import java.util.function.Consumer;

public class lamb {
    public static void main(String[] args){
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(34);
        numbers.add(43);
        Consumer<Integer> method = (n) -> {System.out.println(n); };
        numbers.forEach (method);
        }
    }