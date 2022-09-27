package com.infinite;
//Premitive -- int, float, char, boolean, byte, short,long, double
//Non premitive-- all objects are non premi, String, array
public class DataTypes {
    public static void main(String[] args) {
        int a = 10;
        Integer obj = a; //boxing
        int g =obj;  //unboxing
        char c = 'r';
        int r = (int)c;
        System.out.println(c);
        System.out.println("r = " + r);
        double d = 3.14D;
        Double d1 = d;

        boolean t = true;
   }
}
