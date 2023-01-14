package com.immortals.designpatterns.gof.structural.adapter;

public class CurrencyConvertorAdapterImpl implements CurrencyConvertorAdapter{


    private static final double CURRENT_POUND_RATE=0.82;

    private final CurrencyConvertor convertor;

    public CurrencyConvertorAdapterImpl( CurrencyConvertor convertor ){this.convertor=convertor;}

    //returns currency conversion in pound
    private double convertToPound( double currency ){
        return currency*CURRENT_POUND_RATE;
    }

    @Override
    public double getCurrency(){
        return convertToPound( convertor.getCurrency( 50.00 ) );
    }
}
