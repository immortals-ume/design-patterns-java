package com.immortals.designpatterns.gof.creational.factory;

public class FastFoodRestaurant{


    public static void main( String[] args ){
        Combos combos = CombosCreator.createCombos(ComboNames.LTE);
        combos.printOrder();

        Combos combos2 = CombosCreator.createCombos(ComboNames.FAMILY);
        combos2.printOrder();
    }
}
