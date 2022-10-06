package com.infinite.code;

@FunctionalInterface
interface calculator{
    int sum(int a, int b);

    default  void sub(int a, int b){
    System.out.println(a-b);
}
    default  void sub1(int a, int b){
        System.out.println(a-b);
    }
}
public class FunctionalInterfaceExample implements calculator {

    @Override
    public int sum(int a, int b) {
        return a+b;
    }

    @Override
    public void sub(int a, int b) {
        System.out.println(a-b);
    }

    public static void main(String[] args) {
        FunctionalInterfaceExample obj = new FunctionalInterfaceExample();
        System.out.println(obj.sum(2,4));

        calculator calc = new FunctionalInterfaceExample();
        System.out.println(calc.sum(2,4));

        calculator c = new calculator() {
            @Override
            public int sum(int a, int b) {
                System.out.println("from anonymous class");
                return a+b;
            }
         };

        System.out.println(c.sum(4,5));
        c.sub(8,4);

        calculator c1 = ( a,  b)-> {
                System.out.println("from lambda  class");
                return a+b;
            };

        System.out.println(c1.sum(4,5));
    }
}
