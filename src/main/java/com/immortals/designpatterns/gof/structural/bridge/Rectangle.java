package com.immortals.designpatterns.gof.structural.bridge;

public class Rectangle extends Shape{


    public Rectangle( Color color ){
        super( color );
    }

    @Override
    public String draw(){
        return "Rectangle is Drawn "+"and filled with color "+color.fill( );
    }
}
