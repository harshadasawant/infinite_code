package com.infinite.code;

enum Color {
    RED("red"),
    GREEN,
    BLUE("blue");

    String name;
//
//    // enum constructor called separately for each
//    // constant
    private Color()
    {
        System.out.println("Constructor called for : "
                + this.toString());
    }
    private Color(String name)
    {
        this.name = name;
        System.out.println("Constructor called for parameter : "
                + name);
    }

    public void colorInfo()
    {
        System.out.println("Universal Color= "+name);
    }
}

public class EnumExample {
    public static void main(String[] args)
    {
        Color c1 = Color.BLUE;
        System.out.println("c1.ordinal() = " + c1.ordinal());
        System.out.println(c1);
        c1.colorInfo();
        System.out.println(Color.valueOf("BLUE"));
//
//

        Color c2 = Color.GREEN;
        System.out.println(c2);
        c2.colorInfo();

        Color arr[] = Color.values();

        // enum with loop
        for (Color col : arr) {
            // Calling ordinal() to find index
            // of color.
            System.out.println(col + " at index "
                    + col.ordinal());
        }
    }
}
