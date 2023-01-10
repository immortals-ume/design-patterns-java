package com.immortals.designpatterns.gof.creational.factory;

import java.util.ArrayList;
import java.util.List;

public abstract class Combos {

    protected List<FastFoodItems> fastFoodItems = new ArrayList<>();

    public  Combos(){
        comboDetails();
    }

    protected abstract void comboDetails();

    public void printOrder(){
        System.out.printf("%-15s %10s %n","Type", "Price");
        for(int i = 1; i < fastFoodItems.size(); i++){
            fastFoodItems.get(i).printOrder();
        }
        System.out.println("___________________________ \n");
    }
}
