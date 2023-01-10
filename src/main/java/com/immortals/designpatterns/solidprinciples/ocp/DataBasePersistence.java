package com.immortals.designpatterns.solidprinciples.ocp;

import com.immortals.designpatterns.solidprinciples.srp.Invoice;

public class DataBasePersistence implements InvoicePersistence{


    public void save( Invoice invoice ){
        // implement the Save Functionality For DB
    }
}
