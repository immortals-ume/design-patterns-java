package com.immortals.designpatterns.gof.structural.adapter;

public class USDCurrency implements CurrencyConvertor{


    private static final double CURRENT_RATE=0.012;

    @Override
    public double getCurrency( double inr ){
        return inr*CURRENT_RATE;
    }
}
