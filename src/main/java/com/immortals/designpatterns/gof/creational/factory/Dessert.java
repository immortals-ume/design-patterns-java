package com.immortals.designpatterns.gof.creational.factory;

public class Dessert implements FastFoodItems{


    public String name = "Desserts";
    public int price = 300;

    @Override
    public void printOrder() {
        System.out.printf("%-15s %10s %n", name, price);
    }
}
