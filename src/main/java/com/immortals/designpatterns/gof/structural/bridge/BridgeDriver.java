package com.immortals.designpatterns.gof.structural.bridge;

public class BridgeDriver{


    public static void main( String[] args ){

        Shape rectangle=new Rectangle( new Blue( ) );
        System.out.println( rectangle.draw( ) );
    }
}
