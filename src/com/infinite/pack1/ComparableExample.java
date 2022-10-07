package com.infinite.pack1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparableExample {
    public static void main(String[] args) {
        Employee employee1 = new Employee(341, "John", 35000.00);
        Employee employee2 = new Employee(103, "Sam", 30000.00);
        Employee employee3 = new Employee(221, "Albert", 40000.00);
        List<Employee> employeeList = new ArrayList<Employee>();
        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
// Below sort() method uses compareTo() method to sort the given objects
        Collections.sort(employeeList);
// Sorted objects are displayed below.
        for (Employee e : employeeList) {
            System.out.println(e.employeeId + " " + e.name + " " + e.salary);
        }

        Employee1 employee12 = new Employee1(341, "John", 35000.00);
        Employee1 employee22 = new Employee1(103, "Sam", 30000.00);
        Employee1 employee32 = new Employee1(221, "Albert", 40000.00);
        List<Employee1> employeeList1 = new ArrayList<Employee1>();
        employeeList1.add(employee12);
        employeeList1.add(employee22);
        employeeList1.add(employee32);

        Collections.sort(employeeList1, new NameComparator());
        System.out.println("Employee1=========");
        for (Employee1 e : employeeList1) {
            System.out.println(e.employeeId + " " + e.name + " " + e.salary);
        }
        Collections.sort(employeeList1, new IdComparator());
        System.out.println("Employee1=========");
        for (Employee1 e : employeeList1) {
            System.out.println(e.employeeId + " " + e.name + " " + e.salary);
        }
    }
}
class Employee implements Comparable<Employee> {
    Integer employeeId;
    String name;
    Double salary;
    Employee(Integer employeeId, String name, Double salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.salary = salary;
    }
    @Override
    public int compareTo(Employee employee) {
        //compareTo() receives another Employee object as an argument to compare with the current Employee object.
        if (employeeId == employee.employeeId)
            return 0;
        else if (employeeId > employee.employeeId) {
            return 1;}
        else
            return -1;
    }

}

class Employee1 {
    Integer employeeId;
    String name;
    Double salary;

    Employee1(Integer employeeId, String name, Double salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.salary = salary;
    }


}
class NameComparator implements Comparator<Employee1>{

    @Override
    public int compare(Employee1 o1, Employee1 o2) {
        return o1.name.compareTo(o2.name);
    }
}

class IdComparator implements Comparator<Employee1>{

    @Override
    public int compare(Employee1 o1, Employee1 o2) {
        if (o1.employeeId == o2.employeeId)
            return 0;
        else if (o1.employeeId > o2.employeeId) {
            return 1;}
        else
            return -1;
    }
}
