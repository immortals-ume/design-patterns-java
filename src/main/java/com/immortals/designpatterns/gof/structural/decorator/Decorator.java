package com.immortals.designpatterns.gof.structural.decorator;


interface AbstractSandwich{


    String make();
}


class SimpleSandwich implements AbstractSandwich{


    @Override
    public String make(){
        return "Bread";
    }
}


class SandwichDecorator implements AbstractSandwich{


    protected final AbstractSandwich customSandwich;

    SandwichDecorator( AbstractSandwich sandwich ){customSandwich=sandwich;}


    @Override
    public String make(){
        return this.customSandwich.make( );
    }
}


class MeatDecorator extends SandwichDecorator{


    public MeatDecorator( AbstractSandwich sandwich ){
        super( sandwich );
    }

    public String make(){
        return super.make( )+" + turkey";
    }

}


class DressingDecorator extends SandwichDecorator{


    DressingDecorator( AbstractSandwich sandwich ){super( sandwich );}

    public String make(){

        return super.make( )+" + mustard";
    }
}


public class Decorator{


    public static void main( String[] args ){
        SimpleSandwich simpleS=new SimpleSandwich( );
        MeatDecorator meatS=new MeatDecorator( simpleS );
        DressingDecorator fullSandwich=new DressingDecorator( meatS );
        System.out.println( fullSandwich.make( ) );
    }

}
