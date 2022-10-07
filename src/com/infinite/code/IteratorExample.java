package com.infinite.code;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratorExample {
    public static void main(String[] args) {
        List<String> nameList = new ArrayList<String>();
        nameList.add("Harrison");
        nameList.add("Sirius");
        nameList.add("James");

//iterating using iterator()
//Getting Iterator object
        Iterator<String> iterator = nameList.iterator();
//        iterator = null;
        System.out.println(iterator.hasNext());
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
listIte();
    }
static void listIte(){


        List<String> nameList = new ArrayList<String>();
        nameList.add("Harrison");
        nameList.add("Sirius");
        nameList.add("James");


//iterating using listIterator()
//Getting ListIterator object
        ListIterator<String> literator = nameList.listIterator();
    System.out.println(literator.hasPrevious());
    System.out.println(literator.hasNext());
//iterating in forward direction
        while(literator.hasNext()) {
            System.out.println(literator.next());
        }
//iterating in reverse direction

        while(literator.hasPrevious()) {
            System.out.println(literator.previous());
        }


    }


}
