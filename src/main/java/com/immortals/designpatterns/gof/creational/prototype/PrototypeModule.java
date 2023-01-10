package com.immortals.designpatterns.gof.creational.prototype;

public class PrototypeModule{


    private static Prototype[] prototypes=new Prototype[9];

    private static int total=0;

    // Adds a feature to the Prototype attribute of the PrototypesModule class
    // obj The feature to be added to the Prototype attribute
    public static void addPrototype( Prototype obj ){
        prototypes[total++]=obj;
    }

    public static Object findAndClone( String name ){
        for ( int i=0 ; i<total ; i++ ) {
            if ( prototypes[i].getName( ).equals( name ) ) {
                return prototypes[i].clone( );
            }
        }
        System.out.println( name+" not found" );
        return null;
    }

    public static Object get( String name ){
        for ( int i=0 ; i<total ; i++ ) {
            if ( prototypes[i].getName( ).equals( name ) ) {
                return prototypes[i];
            }
        }
        return null;
    }
}
