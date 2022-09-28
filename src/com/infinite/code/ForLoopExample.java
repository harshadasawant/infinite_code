package com.infinite.code;

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

    }

    void switchCase(){
        int ch;
        Scanner sc = new Scanner(System.in);
        ch = sc.nextInt();
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
}
class A1{
    public static void main(String[] args) {
        ForLoopExample obj = new ForLoopExample();
        obj.MultiDimensionArray();
    }
}