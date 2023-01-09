package org.immortals.solidprinciples.isp;


/**
 * Our parking lot interface was composed of 2 things: Parking related logic (park car, unpark car, get capacity) and
 * payment related logic.
 *
 * But it is too specific. Because of that, our FreeParking class was forced to implement payment-related methods
 * that are irrelevant. let's resolve this .
 */
public class FreeParking implements  ParkingLot{

    @Override
    public void parkCar(){

    }
    @Override
    public void unparkCar(){

    }
    @Override
    public void getCapacity(){

    }
    @Override
    public double calculateFee( Car car ){
        return 0;
    }
    @Override
    public void doPayment( Car car ) throws Exception{
        throw new Exception("Parking lot is free");
    }
}
