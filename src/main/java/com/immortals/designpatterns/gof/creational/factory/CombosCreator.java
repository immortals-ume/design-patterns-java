package com.immortals.designpatterns.gof.creational.factory;

public class CombosCreator{
    public static Combos createCombos(ComboNames combo){

        switch (combo){
        case LTE:
            System.out.println("Selected Combo: LteCombo \n");
            return new LteCombos();
        case FAMILY:
            System.out.println("Selected Combo: FamilyCombo \n");
            return new FamilyCombos();
        case PARTY:
            System.out.println("Selected Combo: PARTYCombo \n");
            return new PartyCombos();
        default:
            return null;
        }

    }
}
