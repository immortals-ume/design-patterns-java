package org.immortals.designpatterns.solidprinciples.srp;

/**
 * A simple Class for Capturing Invoice , not following the SRP rule.
 * if print invoice method changes then the invoice class needed to be changes not compiling wth SRP rule
 * <p>
 * to solve this we would make InvoicePrinter and InvoicePersistence class
 */

public class Invoice{


    private final Book book;

    private final int quantity;

    private final double discountRate;

    private final double taxRate;

    private final double total;

    public Invoice( Book book,int quantity,double discountRate,double taxRate ){
        this.book=book;
        this.quantity=quantity;
        this.discountRate=discountRate;
        this.taxRate=taxRate;
        this.total=this.calculateTotal( );
    }

    public double calculateTotal(){
        double price=((book.getPrice( )-book.getPrice( )*discountRate)*this.quantity);

        double priceWithTaxes=price*(1+taxRate);

        return priceWithTaxes;
    }

    public Book getBook(){
        return book;
    }

    public int getQuantity(){
        return quantity;
    }

    public double getDiscountRate(){
        return discountRate;
    }

    public double getTaxRate(){
        return taxRate;
    }

    public double getTotal(){
        return total;
    }

    //public void printInvoice(){
    //    System.out.println( quantity+"x "+book.getName( )+" "+book.getPrice( )+"$" );
    //    System.out.println( "Discount Rate: "+discountRate );
    //    System.out.println( "Tax Rate: "+taxRate );
    //    System.out.println( "Total: "+total );
    //}
    //
    //public void saveToFile( String filename ){
    //    // Creates a file with given name and writes the invoice
    //}
}
