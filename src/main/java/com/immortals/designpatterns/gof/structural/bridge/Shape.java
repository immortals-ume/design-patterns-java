package com.immortals.designpatterns.gof.structural.bridge;

public abstract class Shape{


    protected final Color color;


    protected Shape( Color color ){this.color=color;}

    abstract public String draw();
}
