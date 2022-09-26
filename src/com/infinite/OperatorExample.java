package com.infinite;

public class OperatorExample {
    public static void main(String[] args) {
        int pizzaPrice=1500;
        int quantity=2;
        long totalCost = pizzaPrice * quantity;
        System.out.println("totalCost = " + totalCost);
        if(totalCost>2000 && totalCost<=10000){
            float totalCostWithDiscount = totalCost - (totalCost * (float)5/100);
            System.out.println("totalCostWithDiscount = " + totalCostWithDiscount);
        }
        else if(totalCost>10000){
            float totalCostWithDiscount = totalCost - (totalCost * (float)10/100);
            System.out.println("totalCostWithDiscount = " + totalCostWithDiscount);
        }
        else{
            System.out.println("No Discount");
        }

    }
}


