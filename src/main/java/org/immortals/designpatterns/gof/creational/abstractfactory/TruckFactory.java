package org.immortals.designpatterns.gof.creational.abstractfactory;

public class TruckFactory{


    private TruckFactory(){

    }

    public static Truck buildTruck( TruckModel truckModel ){
        Truck truck=null;

        Location location=Location.INDIA;

        switch( location ) {
        case USA:
            truck=UsaFactory.buildTruck( truckModel );
            break;

        case INDIA:
            truck=IndiaFactory.buildTruck( truckModel );
            break;

        default:
            break;

        }

        return truck;

    }
}
