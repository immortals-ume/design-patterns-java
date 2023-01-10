package com.immortals.designpatterns.gof.creational.abstractfactory;

public class MiniTruck extends Truck{


    public MiniTruck( TruckModel model,Location location ){
        super( model,location );
        construct( );
    }


    @Override
    protected void construct(){
        System.out.println( "Connecting to Mini Truck" );
    }
}
