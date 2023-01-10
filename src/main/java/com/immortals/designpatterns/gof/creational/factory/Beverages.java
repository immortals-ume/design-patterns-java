package com.immortals.designpatterns.gof.creational.factory;

public class Beverages implements FastFoodItems{
    public String name = "Beverages";
    public int price = 200;

    @Override
    public void printOrder() {
        System.out.printf("%-15s %10s %n", name, price);
    }
}
