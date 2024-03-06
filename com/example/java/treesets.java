package com.example.java;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class treesets {
    public static void main(String[] args){
        Set<Integer> ts = new TreeSet<>();
        ts.add(23);
        ts.add(21);
        ts.add(43);
        System.out.println(ts);

        Set<String> ts1 = new TreeSet<>(Comparator.comparing(String::length));
        ts1.add("Lion");
        ts1.add("Eleph");
        ts1.add("cat");
        ts1.add("Apeans");
        System.out.println(ts1);


    }
}
