package com.immortals.designpatterns.gof.creational.factory;

public class LteCombos extends Combos{


    @Override
    protected void comboDetails(){
        fastFoodItems.add( new Burgers( ) );

        fastFoodItems.add( new Fries( ) );
        fastFoodItems.add( new Beverages( ) );
    }
}
