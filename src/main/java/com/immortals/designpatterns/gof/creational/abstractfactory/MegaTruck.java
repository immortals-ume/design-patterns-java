package com.immortals.designpatterns.gof.creational.abstractfactory;

public class MegaTruck extends Truck{


    public MegaTruck( TruckModel model,Location location ){
        super( model,location );
        construct( );
    }

    @Override
    protected void construct(){
        System.out.println( "Connecting to Mega Truck" );
    }
}
