package com.infinite;

public class Tester {
    int a; //instance variable it get initialised with default value=0
    void fun(){
        System.out.println(a);
    }
    public static void main(String[] args) {

        //Variable declared using var instead of data type
        var numberOne = 11; //The type of the variable is inferred by the compiler
        System.out.println("The value of numberOne is " + numberOne);

        //Uncomment the code given below and observe the output
        var numberTwo="two";
        System.out.println(" The value of numberTwo = "+numberTwo);

        //Uncomment the code given below and observe the output
//        numberOne="dfy";
        var numThree=9; //at the the declaration u have to initialized with value.
        System.out.println("numThree = " + numThree);
        int b; // local variable- you have to initialized before use
        b=0; //initializing

        System.out.println("b = " + b); // using
    }
}
