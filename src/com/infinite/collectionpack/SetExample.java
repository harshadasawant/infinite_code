package com.infinite.collectionpack;

import java.util.*;

public class SetExample {
    public static void main(String[] args) {
        HashSet<String> food = new HashSet<String>(); // Creating HashSet
        // Create HashSet
        food.add("Pasta"); // Add elements to the hash set
        food.add("Noodles");
        food.add("Sandwich");
        food.add("Pasta");
        food.add("Burger");
        food.add("Noodles");
        for (String tempFood : food) {
            System.out.println(tempFood);
        }
        //creating Iterator object using iterator() method
        Iterator<String> iterator = food.iterator();
//using hasNext() method to find if next element is present
        while(iterator.hasNext()) {
            //using next() method to get the next element
            System.out.println(iterator.next());
        }

        System.out.println("===========================");

        // Creating HashSet
        HashSet<String> food1 = new HashSet<String>();
//Creating List
        List<String> foodList = new ArrayList<String>();
        foodList.add("Pasta");
        foodList.add("Noodles");
        foodList.add("Sandwich");
        foodList.add("Sandwich");
        System.out.println(foodList);


// Add elements to the hashset from list
        food1.addAll(foodList);

        for (String tempFood : food1) {
            System.out.println(tempFood);
        }


    }
}

//class User implements Comparable<User> {
    class User{
    String username;
    String password;
    String email;

    public User(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(username, user.username) && Objects.equals(password, user.password) && Objects.equals(email, user.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, password, email);
    }

    public static void main(String[] args) {
        List<User> userList = new ArrayList<User>();
        userList.add(new User("Max", "fgc123", "max@hnd.com"));
        userList.add(new User("Mike", "hdgsh@", "imike@hndcom"));
        userList.add(new User("John", "ucantseeme", "jojo@hnd.com"));
        userList.add(new User("Moby", "fgc123", "iammoby@ hnd.com"));
        userList.add(new User("Moby", "fgc123", "iammoby@ hnd.com"));

        System.out.println("==="+userList);
        // creating user set from list
        Set<User> userSet = new LinkedHashSet<User>();
        userSet.addAll(userList);
        System.out.println("===============================");
    //printing all users
        for (User user : userSet) {
            System.out.println("user = "+user);
        }

//        TreeSet<User> users = new TreeSet<User>();
//        users.add(new User("Max", "fgc123", "max@hnd.com"));
//        users.add(new User("Mike", "hdgsh@", "imike@hndcom"));
//        users.add(new User("John", "ucantseeme", "jojo@hnd.com"));
//        users.add(new User("Moby", "fgc123", "iammoby@ hnd.com"));
//        users.add(new User("Moby", "fgc123", "iammoby@ hnd.com"));
//        System.out.println("TreeSet = "+users);

        TreeSet<User> users = new TreeSet<User>(new NameComparator());
        users.add(new User("Max", "fgc123", "max@hnd.com"));
        users.add(new User("Mike", "hdgsh@", "imike@hndcom"));
        users.add(new User("John", "ucantseeme", "jojo@hnd.com"));
        users.add(new User("Moby", "fgc123", "iammoby@ hnd.com"));
        users.add(new User("Moby", "fgc123", "iammoby@ hnd.com"));
        System.out.println("TreeSet = "+users);


    }

//    @Override
//    public int compareTo(User o) {
//        return username.compareTo(o.username);
//    }
}

class NameComparator implements Comparator<User>{

    @Override
    public int compare(User o1, User o2) {
        return o1.username.compareTo(o2.username);
    }
}
