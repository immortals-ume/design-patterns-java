package org.immortals.designpatterns.gof.creational.factory;

public class PartyCombos extends Combos{


    @Override
    protected void comboDetails(){
        fastFoodItems.add( new Burgers( ) );
        fastFoodItems.add( new Dessert( ) );
        fastFoodItems.add( new Fries( ) );
        fastFoodItems.add( new Beverages( ) );
    }
}
