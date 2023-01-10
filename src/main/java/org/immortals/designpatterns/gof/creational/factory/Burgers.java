package org.immortals.designpatterns.gof.creational.factory;

public class Burgers implements FastFoodItems{
    public String name = "Burgers";
    public int price = 30;

    @Override
    public void printOrder() {
        System.out.printf("%-15s %10s %n", name, price);
    }
}
