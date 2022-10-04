package com.infinite.code;

import java.io.EOFException;
import java.io.IOException;

class Student {
final float PI=3.14f;
      public void display() throws RuntimeException {

        System.out.println("Student");
    }
    void disp(){
        System.out.println("from disp");
    }
}

class UndergraduateStudent extends Student{
    //This method overrides display() of parent Student
    @Override
   public void display() throws RuntimeException {
        System.out.println("This Student is Undergraduate");
    }


}
public class GraduateStudent extends Student{
    //This method overrides display() of parent Student
    @Override
    public void display() {
        System.out.println("This Student is Graduate");
    }
    void show(){
        System.out.println("show");
    }
    public static void main(String[] args) {

        Student student = new Student();
        student.display();

        Student obj1 = new GraduateStudent();
        GraduateStudent obj3 = new GraduateStudent();
//        GraduateStudent obj = new Student(); -- compile time error
        obj1.display();
        obj3.show();
        obj1.disp();
//        obj1.show();

        Student obj2 = new UndergraduateStudent();
        obj2.display();
    }
}
