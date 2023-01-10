package org.immortals.designpatterns.gof;

import org.immortals.designpatterns.gof.creational.builder.Pizza;

public class Gof{


    public static void main( String[] args ){
        Pizza pizza=new Pizza.PizzaBuilder( "wheat","tomato" )
                .topping( "oregano" )
                .cheese( true )
                .build( );
        System.out.println( pizza );
    }
}
