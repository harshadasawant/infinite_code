package com.infinite.code;

import java.util.Arrays;
import java.util.Scanner;

public class ForLoopExample {
    public static void main(String[] args) {
//        loop-> start point, End point, increment/decrement
        for(int i=1;i<=10;i++) {
            System.out.println("hello "+i);
        }
        System.out.println("out of loop");

//        while loop
        int j=1;
        while(j<=10){
            System.out.println("hello "+j);
            j++;
        };
        System.out.println("out of while");

//        do- while loop
        int k=1;
        do{
            System.out.println("hello "+k);
            k++;
        }while(k<=10);

        ForLoopExample obj = new ForLoopExample();
        obj.array();
        obj.MultiDimensionArray();
        obj.switchCase();
        obj.ArrayObject();
        ArraysFunction();
    }

    void array(){
        int a1[] = new int[5];
        a1[0]=34;
        a1[3]=56;
        a1[4]=87;

        int a[]= {1,12,3,6,7,8,6,7,87};

        for(int i=0;i<=5;i++){
            System.out.println("a["+i+"] = " + a[i]);
        }
        for(int b: a){
            System.out.println("b = " + b);
        }

    }

    public void MultiDimensionArray(){
        int arr[][]={{1,2,3,5},
                {5,6,7},
                {6,7,5,4,3},
                {67,7,9,5}
        };
        System.out.println("arr.length = " + arr.length);
        for(int i=0;i<arr.length;i++){ //row
            System.out.println("arr[i].length = " +  arr[i].length);
           for(int j=0;j<arr[i].length;j++){ //column
               System.out.print("arr["+i+"]["+j+"] = " + arr[i][j]+", ");
           }
            System.out.println();
        }


        // create a 3d array
        int[][][] test = {
                {
                        {1, -2, 3},
                        {2, 3, 4}
                },
                {
                        {-4, -5, 6, 9},
                        {1},
                        {2, 3}
                }
        };

        // for..each loop to iterate through elements of 3d array
        for (int[][] array2D: test) {
            for (int[] array1D: array2D) {
                for(int item: array1D) {
                    System.out.print(item+"  ");
                }
                System.out.println();
            }
             System.out.println();
        }

    }

    void switchCase(){
        int ch=2;

        switch (ch){
            case 1:
                System.out.println(" this is from case 1");
                break;
            case 2:
                System.out.println("this is from case 2");
                break;
            case 3:
                System.out.println("this is from case 3");
                break;
            default:
                System.out.println("this is from defauklt");
                break;
        }

    }

    void ArrayObject() {
        System.out.println("inside function");
        Account accArray[] = new Account[3];
        accArray[0] = new Account();
        accArray[0].setData("Ella", 345234);
        accArray[1] = new Account();
        accArray[1].setData("Scarlet", 345278);

        accArray[2] = new Account();
        accArray[2].setData("Harper", 345897);
        System.out.println("Account holder's information");
        System.out.println();
        for (Account account : accArray) {
            account.display();
            System.out.println();
        }
    }

       static void ArraysFunction(){
            int[] numArr = {6,8,9,10,40,66};
            int resultIndex = Arrays.binarySearch(numArr, 50);
            System.out.println("resultIndex = " + resultIndex);
            int[] numArr1 = {6,8,9,10,40,66};
            int[] numArr2 = {6,8,9,10,40,66};
            boolean resultCompare = Arrays.equals(numArr1, numArr2);
            System.out.println(resultCompare); //prints true or false
           int[] numArr3 = {20,5,30,50,10,8};
            Arrays.sort(numArr3);
           for (int a:numArr3){
               System.out.print(a+" ");
           }


        }
}
class Account{
    String name;
    long accountNumber;

    void setData(String custName,int accNum) {
        this.name = custName;
        this.accountNumber = accNum;
    }
    void display() {
        System.out.println("Name :- "+name);
        System.out.println("Account Number :- "+accountNumber);
    }
}

class A1{
    public static void main(String[] args) {
        ForLoopExample obj = new ForLoopExample();
        obj.MultiDimensionArray();
    }
}