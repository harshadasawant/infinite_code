package com.infinite;

public class VarArgs {
    //This method will calculate percentage
    // method will calculate total marks and will display the information
    static void display(int rollNumber,String name, double ...marks) {

        System.out.println("Student Information");
        System.out.println("Name : "+name);
        System.out.println("Roll Number : "+rollNumber);
        double totalMarks=0.0;

        for (double num : marks) {
            totalMarks =totalMarks+num;

        }

        //percentage calculation
        double percentage = (totalMarks/marks.length);
        System.out.println("Percentage : "+percentage);
    }

    public static void main(String[] args) {
        //method will call display
        display(24,"Jack");
        System.out.println();
        display(45, "Ron", 78.5,45,8.6f);
    }

}

class Emp{
    String name;
    int empId;
    Address obj; ///has -a


}

class Address{

}