package com.immortals.designpatterns.gof.creational.abstractfactory;

public class UsaFactory{


    protected static Truck buildTruck( TruckModel truckModel ){
        Truck truck=null;
        switch( truckModel ) {
        case MICRO:
            truck=new MicroTruck( TruckModel.MICRO,Location.USA );
            break;

        case MINI:
            truck=new MiniTruck( TruckModel.MINI,Location.USA );
            break;

        case MEGA:
            truck=new MegaTruck( TruckModel.MEGA,Location.USA );
            break;

        default:
            break;

        }
        return truck;

    }
}
