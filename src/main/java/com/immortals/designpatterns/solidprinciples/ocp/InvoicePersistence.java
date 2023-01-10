package com.immortals.designpatterns.solidprinciples.ocp;

import com.immortals.designpatterns.solidprinciples.srp.Invoice;

public interface InvoicePersistence{


    void save( Invoice invoice );
}
