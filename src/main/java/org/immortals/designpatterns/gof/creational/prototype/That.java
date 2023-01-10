package org.immortals.designpatterns.gof.creational.prototype;

public class That implements Prototype, Command{


    @Override
    public void execute(){
        System.out.println( "That: execute : "+this );
    }

    @Override
    public Object clone(){
        return new That( );
    }

    @Override
    public String getName(){
        return "That";
    }
}
