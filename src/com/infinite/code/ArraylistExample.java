package com.infinite.code;

import java.util.ArrayList;
import java.util.List;

public class ArraylistExample {

    public static void main(String[] args) {

        ArrayList<String> nameList = new ArrayList<String>();

        nameList.add("Harrison");
        nameList.add("srgffdgfgytfy");
        nameList.add("Sirius");
        nameList.add("James");
        nameList.add("Lily");
        nameList.add("Cho");
        nameList.add("Hermione");
//
//        nameList.add(12);
//        nameList.add(true);
        findLongestString(nameList);
    }

    public static void findLongestString(List<String> list) {
        String longest = "";
        for (String object : list) {
            if(object.length() > longest.length()) //Line1
                longest = object;
        }
        System.out.println("The string having the maximum length is "+ longest);
    }

}
 class EqualityTester<T> {
    T value1;  //declaring instance variable of T type
    T value2;
    public EqualityTester(T value1, T value2) {
        this.value1=value1;
        this.value2=value2;
    }
    public boolean checkEquals() {
        return value1.equals(value2);
    }

     public static void main(String[] args) {
         EqualityTester<Integer> tester1 = new EqualityTester<Integer>(10, 20);
         System.out.println(tester1.checkEquals()); //prints false
         EqualityTester<String> tester2 = new EqualityTester<String>("Ten", "Twenty");
         System.out.println(tester2.checkEquals()); //prints false

         EqualityTester<Float> tester3 = new EqualityTester<Float>(2.5f, 5.4f);
         System.out.println(tester2.checkEquals()); //prints false

     }
}
class Employee{
    private int empId;
    public Employee(int empId){
        this.empId = empId;
    }

    public static void main(String[] args) {
        ArrayList<Employee> elist = new ArrayList<Employee>();
        elist.add(new Employee(101));
        elist.add(new Employee(102));
        elist.add(new Employee(103));


    }
}

class ArraysLengthTester<T1,T2> { //T1,T2 are two data types


    //method takes two array type parameters of type T1,T2
    public String lengthTester(T1[] arr1,T2[] arr2) {
        return (arr1.length==arr2.length?"Equal":"Not Equal");
    }
    public static void main(String[] args) {
        String[] sarr = {"A","B","C"};
        Integer[] numarr1 = {1,2,3,4};
        Integer[] numarr2 = {4,5,6,7};

        ArraysLengthTester<String,Integer> tester1 = new
                ArraysLengthTester<String,Integer>();
        System.out.println(tester1.lengthTester(sarr, numarr1));

        ArraysLengthTester<Integer,Integer> tester2 = new
                ArraysLengthTester<Integer,Integer>();
        System.out.println(tester2.lengthTester(numarr1, numarr2));

    }
}



