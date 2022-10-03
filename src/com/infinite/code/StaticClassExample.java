package com.infinite.code;

public class StaticClassExample {
    static int  noOfObjects;
   int a;

   static void fun(){
       System.out.println(noOfObjects);
   }

    public static void main(String[] args) {
       StaticClassExample obj = new StaticClassExample();
        StaticClassExample obj1 = new StaticClassExample();
       obj.a =2;
       obj.noOfObjects = 6;
        System.out.println(noOfObjects);

        System.out.println("obj.a = " + obj.a);
        System.out.println("obj.noOfObjects = " + obj.noOfObjects);
        System.out.println("obj1.noOfObjects = " + obj1.noOfObjects);
        System.out.println(StaticClassExample.noOfObjects);
        fun();
        obj.fun();
        StaticClassExample.fun();
        System.out.println("obj1.a = " + obj1.a);
        obj1.a =10;
        obj1.noOfObjects = 11;
        System.out.println("obj1.a = " + obj1.a);
        System.out.println("obj1.noOfObjects = " + obj1.noOfObjects);
        System.out.println("obj.noOfObjects = " + obj.noOfObjects);
        System.out.println("obj.a = " + obj.a);
        fun();

    }
}

class Ford {
    private String modelNo;
    private String color;
    private static int noOfCars; // Creates a class variable

    {
        System.out.println("Normal block");
    }

    static{
        noOfCars=9;
        System.out.println("static block");
    }
    public Ford(String modelNo, String color) {
        this.modelNo = modelNo;
        this.color = color;
        noOfCars++;    // For every object created, the value of the same variable gets incremented
    }
    public static Ford orderCar(String model, String color) {
        Ford car = new Ford(model, color);
        System.out.println(car.color);
        System.out.println(car.modelNo);
        System.out.println(Ford.noOfCars);
        return car;
    }

    public static void main(String[] args) {
        Ford f1 = new Ford("abc","brown");
        System.out.println("f1.noOfCars = " + f1.noOfCars);

        Ford f2 = new Ford("xyz","pink");
        System.out.println("f1.noOfCars = " + f1.noOfCars);
        System.out.println("f2.noOfCars = " + f2.noOfCars);
        Ford f3 = new Ford("xyz","pink");
        System.out.println("f1.noOfCars = " + f1.noOfCars);
        System.out.println("f2.noOfCars = " + f2.noOfCars);
        System.out.println("f3.noOfCars = " + f3.noOfCars);

        Ford myMustang = Ford.orderCar("Mustang", "Red");
        System.out.println("Thanks for ordering a Ford ...Drive safe!");

    }
}
