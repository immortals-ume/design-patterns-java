package com.immortals.designpatterns.solidprinciples.srp;

/**
 * helps in following the SRP rule , but does follow OCP Rule
 */
public class InvoicePersistence{

    private Invoice invoice;

    public InvoicePersistence(Invoice invoice) {
        this.invoice = invoice;
    }

    public void saveToFile(String filename) {
        // Creates a file with given name and writes the invoice
    }
}
