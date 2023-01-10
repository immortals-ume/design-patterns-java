package com.immortals.designpatterns.gof.creational.factory;

public class FamilyCombos extends Combos{


    @Override
    protected void comboDetails(){
        fastFoodItems.add( new Burgers() );
        fastFoodItems.add( new Dessert() );
        fastFoodItems.add( new Fries() );
        fastFoodItems.add( new Beverages());
    }
}
