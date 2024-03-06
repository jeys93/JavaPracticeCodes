package com.example.java;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class stacks {
    public static void main(String[] args){
        Deque<String> stack = new ArrayDeque<>();
        stack.push("First");
        stack.push("Second");
        stack.push("Third");
        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack.descendingIterator());
        System.out.println(stack.pop());
        stack.pop();
        System.out.println(stack);
    }
}