package org.immortals.designpatterns.solidprinciples.isp;


/**
 * But we can simplify the below logic as interfaces
 */
public class FreeParkingWrong implements ParkingLot{

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
