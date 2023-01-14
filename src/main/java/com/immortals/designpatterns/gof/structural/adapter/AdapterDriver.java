package com.immortals.designpatterns.gof.structural.adapter;

import java.util.logging.Level;
import java.util.logging.Logger;

public class AdapterDriver{


    private static final Logger logger=Logger.getLogger( AdapterDriver.class.getName( ) );

    public static void main( String[] args ){
        CurrencyConvertor usd=new USDCurrency( );
        CurrencyConvertorAdapter ukd=new CurrencyConvertorAdapterImpl( usd );
        logger.log( Level.INFO,String.valueOf( ukd.getCurrency( ) ) );
    }
}
