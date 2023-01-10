package com.immortals.designpatterns.gof;

import com.immortals.designpatterns.gof.creational.builder.Pizza;

public class Gof{


    public static void main( String[] args ){
        Pizza pizza=new Pizza.PizzaBuilder( "wheat","tomato" )
                .topping( "oregano" )
                .cheese( true )
                .build( );
        System.out.println( pizza );
    }
}
