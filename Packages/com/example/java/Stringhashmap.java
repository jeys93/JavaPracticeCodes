package com.example.java;

//import com.sun.xml.internal.fastinfoset.util.StringArray;
//import jdk.nashorn.internal.runtime.regexp.joni.ast.StringNode;

//import java.lang.reflect.Array;
import java.util.HashMap;
//import java.util.List;
import java.util.Map;
//import java.util.Map.Entry;
import java.util.Arrays;

public class Stringhashmap {
    public static void main (String[] args){
        String[] cities = {"Chennai","Mumbai","UP","Delhi","Mumbai","Chennai","Delhi","UP",};
        Arrays.sort(cities);
        System.out.println(Arrays.toString(cities));
        Map<String, Integer> citycount = new HashMap <>();

        for (String city : cities) {
            citycount.put(city,citycount.getOrDefault(city, 0)+1);
        }
        /*for (String city:cities){
            System.out.println(city);
        }*/
        for (Map.Entry<String, Integer> entry : citycount.entrySet()){
            System.out.println(entry.getKey()+":" + entry.getValue());
        }
    }
}
