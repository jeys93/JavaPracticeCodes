package com.example.java;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class linkedListsprogram {
    public static void main(String[] args){
        LinkedList<String> shoppinglist = new LinkedList<>();
        shoppinglist.add("Soap");
        shoppinglist.add("comb");
        shoppinglist.addFirst("soft");
        shoppinglist.add("tree");
        shoppinglist.add(2,"wood");
        System.out.println(shoppinglist);

        List<String>syncshoplist = Collections.synchronizedList(shoppinglist);
        System.out.println(syncshoplist);

    }
}
