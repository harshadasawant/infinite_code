package com.infinite.code;

import java.util.Objects;

public class ObjectClass {
    final String name1="The Godfather";
    int id;
    String name;
     ObjectClass(int id){
        this.id = id;
    }
    @Override
    public String toString() {
//         name1="drt";
        return "ObjectClass{ id = "+id+"}";
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ObjectClass that = (ObjectClass) o;
        return id == that.id && name.equals(that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public static void main(String[] args) {
        ObjectClass obj = new ObjectClass(5);

        System.out.println(obj);
        ObjectClass obj1 = new ObjectClass(5);
        System.out.println(obj1.toString());
        System.out.println(obj == obj1);
        System.out.println(obj.equals(obj1));

        obj1 = obj;
        System.out.println(obj == obj1);

    }
}
