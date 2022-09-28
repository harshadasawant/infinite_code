package com.infinite.pack1;

import com.infinite.code.DataTypes;

import java.util.stream.Stream;
//import com.infinite.code.ForLoopExample;

public class Test {
    public static void main(String[] args) {
        com.infinite.code.ForLoopExample obj = new com.infinite.code.ForLoopExample();
//        obj.MultiDimensionArray();
        DataTypes d = new DataTypes();
        f1();
    }

   static void f1(){
       String[][][] dArray = new String[10][20][30];
       String name = "Oliver";
       String ab = name.concat(" Carter");
       System.out.println(ab);

       StringBuilder name1 = new StringBuilder();
       name1.append("Oliver");
       name1.append(" Carter");
       System.out.println(name1);

       System.out.println();
        System.out.println("------------"+"Java 11 String methods"+"------------");
        String one = "amazon";
        System.out.println("Repeat method used to repeat the string having count passed as parameter");
        System.out.println("Repeat string one 3 times :-"+one.repeat(3));

        System.out.println();
        String two = "Antarctica";
        System.out.println("isBlank() tells us whether the string contains only Blank spaces");
        System.out.println("Checking isBlank() with string two :- "+two.isBlank());
        String blank="     ";
        System.out.println("Checking isBlank() with string blank :- "+blank.isBlank());

        System.out.println();
        String whiteSpaceLeadingAndTrailing = "   Pacific  ";
        String whiteSpaceLeading = "   Pacific";
        String whiteSpaceTrailing = "Pacific    ";
        System.out.println("In Java 11, we have three methods to remove extra white-spaces\n"
                + "1.strip() => All the leading and trailing white-spaces are removed.\n"
                + "2.stripLeading() => All the leading white-spaces are removed.\n"
                + "3.stripTrailing() => All the trailing white-spaces are removed.\n"
                + "These methods are extension to the trim() method which we have already seen\n");

        System.out.println("----Demo----");
        System.out.println("Using strip() :- "+whiteSpaceLeadingAndTrailing.strip());
        System.out.println("Using stripLeading() :- "+whiteSpaceLeading.stripLeading());
        System.out.println("Using stripTrailing() :- "+whiteSpaceTrailing.stripTrailing());

        System.out.println();
        System.out.println("String.lines() splits the string by its line terminators and returns a Stream of Strings");
        String str1 = " A \n B \n C \n D";
        System.out.println("Use String.lines() on string str1");
        Stream<String> lines = str1.lines();
        lines.forEach(System.out::println);

       //Creating StringBuilder Objects
       StringBuilder strOne = new StringBuilder("Java");
       StringBuilder strTwo = new StringBuilder();
       strTwo.append("Python");

       // method will return length of strOne
       Integer length = strOne.length();

       //method will insert a new string to the original string
       strTwo.insert(0,"I love ");
       System.out.println(strTwo);

       // method will append 2.0
       strOne.append(9.0);
       System.out.println(strOne);
       //to print the capacity of object we use ca`pacity()
       System.out.println(strOne.capacity());

       //this method will insert SE into strOne at specified position
       strOne.insert(length,"SE");
       System.out.println(strOne);

       //this method will create a string from start index till end index as specified
       String sub = strTwo.substring(4,9);
       System.out.println(sub);

       //this method can convert StringBuilder Object
       String str = strTwo.toString();
       System.out.println(str.getClass());

       // this method deletes characters from strOne based on the arguments specified
       strOne.delete(0,3);
       System.out.println(strOne);
       Character alphaObj = new Character('A');
       Character digitObj = new Character('5');
       boolean result1 = Character.isDigit(digitObj); // Output :- true
       System.out.println(result1);
       boolean result2 = Character.isUpperCase(alphaObj); // Output :- true
       String val = alphaObj.toString(); // val = "A"
       char beta = alphaObj.charValue(); // beta = 'A'
       char c = digitObj.toLowerCase('B'); // c = 'b';

   }

}
