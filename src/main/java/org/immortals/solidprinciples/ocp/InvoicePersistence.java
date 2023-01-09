package org.immortals.solidprinciples.ocp;

import org.immortals.solidprinciples.srp.Invoice;

public interface InvoicePersistence{

    void save( Invoice invoice);
}
