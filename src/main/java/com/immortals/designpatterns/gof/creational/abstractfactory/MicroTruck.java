package com.immortals.designpatterns.gof.creational.abstractfactory;

public class MicroTruck extends Truck{


    public MicroTruck( TruckModel model,Location location ){
        super( model,location );
        construct( );
    }

    @Override
    protected void construct(){
        System.out.println( "Connecting to Micro Truck" );

    }
}
