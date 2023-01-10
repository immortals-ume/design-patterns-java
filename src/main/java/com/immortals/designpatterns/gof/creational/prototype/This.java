package com.immortals.designpatterns.gof.creational.prototype;

public class This implements Prototype, Command{


    @Override
    public void execute(){
        System.out.println( "This: execute : "+this );
    }

    @Override
    public Object clone(){
        return new This( );
    }

    @Override
    public String getName(){
        return "This";
    }
}
