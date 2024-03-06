package com.example.java;

import java.util.ArrayDeque;
import java.util.Queue;

public class queues {
    public static void main(String[] args){

        Queue<String> queue = new ArrayDeque<>();
        queue.offer("One");
        queue.offer("two");
        queue.offer("three");
        System.out.println(queue);
        queue.add("four");
        System.out.println(queue);
        queue.peek();
        System.out.println(queue);
        queue.poll();
        System.out.println(queue);
    }
}
