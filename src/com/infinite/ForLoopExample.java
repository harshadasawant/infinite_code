package com.infinite;

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
    }

    void array(){
        int a[]= {1,12,3,6,7,8};

        for(int i=0;i<=5;i++){
            System.out.println("a["+i+"] = " + a[i]);
        }
        for(int b: a){
            System.out.println("b = " + b);
        }

    }

    void MultiDimensionArray(){
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
}
