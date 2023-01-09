package org.immortals.designpatterns.solidprinciples.ocp;

import org.immortals.designpatterns.solidprinciples.srp.Invoice;

public interface InvoicePersistence{


    void save( Invoice invoice );
}
