package com.infinite;

public class BitWiseOperator {
    public static void main(String[] args) {

//         i++; //post increment
//        ++i;//pre increament

        int i = 8;
        int j = 10;
        if(++i<10 && ++j<15 ){
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        System.out.println("i = " + i);
        System.out.println("j = " + j);

        int x = 8;
        int y = 10;
        if(++x<6 || ++y<12 ){
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        System.out.println("x = " + x);
        System.out.println("y = " + y);


    }
}
