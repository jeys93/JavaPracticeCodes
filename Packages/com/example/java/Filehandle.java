package com.example.java;
import java.io.*;

public class Filehandle {
    public static void main(String[] args){
        try {
            File myObj = new File("C:\\Users\\seniyapp\\Desktop\\Jeys.doc");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        try{
            FileWriter myobj = new FileWriter("C:\\Users\\seniyapp\\Desktop\\Jeys.doc");
            myobj.write("Hello ");
            myobj.close();
            System.out.println("Printed");
        }catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
