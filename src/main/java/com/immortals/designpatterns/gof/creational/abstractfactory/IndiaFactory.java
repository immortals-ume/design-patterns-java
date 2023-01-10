package com.immortals.designpatterns.gof.creational.abstractfactory;

public class IndiaFactory{


    protected static Truck buildTruck( TruckModel truckModel ){
        Truck truck=null;
        switch( truckModel ) {
        case MICRO:
            truck=new MicroTruck( TruckModel.MICRO,Location.INDIA );
            break;

        case MINI:
            truck=new MiniTruck( TruckModel.MINI,Location.INDIA );
            break;

        case MEGA:
            truck=new MegaTruck( TruckModel.MEGA,Location.INDIA );
            break;

        default:
            break;

        }
        return truck;

    }
}
