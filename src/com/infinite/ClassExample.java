package com.infinite;

public class ClassExample {
    int a;
    int b;

}


class Customer{
    String name;
    int id;
    String contact_no;
    String address;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContact_no() {
        return contact_no;
    }

    public void setContact_no(String contact_no) {
        this.contact_no = contact_no;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public static void main(String[] args) {
        Customer c1 = new Customer();
        c1.setName("harshada");
        c1.setId(12);
        c1.setContact_no("2354454");
        c1.setAddress("mumbai");
        System.out.println(c1.getName());
        System.out.println(c1.getId());

        Customer c2 = new Customer();
        c2.setName("Daksh");
        c2.id = 10;
        c2.contact_no = "345435";
        c2.address = "delhi";

        System.out.println("c2.name = " + c2.name);
        System.out.println("c2.getContactNo() = " + c2.getContact_no());
        System.out.println("c2.getAddress() = " + c2.getAddress());


    }

}