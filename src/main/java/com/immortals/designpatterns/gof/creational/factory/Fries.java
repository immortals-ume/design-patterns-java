package com.immortals.designpatterns.gof.creational.factory;

public class Fries implements FastFoodItems{

    public String name = "Fries";
    public int price = 50;

    @Override
    public void printOrder() {
        System.out.printf("%-15s %10s %n", name, price);
    }
}
