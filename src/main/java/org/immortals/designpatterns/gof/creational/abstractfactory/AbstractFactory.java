package org.immortals.designpatterns.gof.creational.abstractfactory;

public class AbstractFactory{


    public static void main( String[] args ){
        System.out.println( TruckFactory.buildTruck( TruckModel.MICRO ) );
        System.out.println( TruckFactory.buildTruck( TruckModel.MINI ) );
        System.out.println( TruckFactory.buildTruck( TruckModel.MEGA ) );
    }
}
