package com.example.java;


interface Animal{
    public void animalSounds();
    public void colour();
}

class Pig implements Animal{
    public void animalSounds() {
        System.out.println("The pig sound as wee wee");
    }
    public void colour() {
        System.out.println("Black");
    }
}
public class Interfaces {
    public static void main (String[] args){
        Pig mypig = new Pig();
        mypig.animalSounds();
        mypig.colour();
    }
}