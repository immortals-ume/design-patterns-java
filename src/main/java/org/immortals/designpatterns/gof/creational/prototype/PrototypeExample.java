package org.immortals.designpatterns.gof.creational.prototype;

public class PrototypeExample{


    // 3. Populate the "registry"
    public static void initializePrototypes(){
        PrototypeModule.addPrototype( new This( ) );
        PrototypeModule.addPrototype( new That( ) );
    }

    public static void main( String[] args1 ){
        initializePrototypes( );
        System.out.println(
                "Get Object assigned : "+PrototypeModule.get( "This" ) );
        System.out.println( );
        String[] strArr={ "This","That" };
        Object[] objects=new Object[9];
        int total=0;

        for ( int i=0 ; i<strArr.length ; i++ ) {
            objects[total]=PrototypeModule.findAndClone( strArr[i] );
            if ( objects[total]!=null )
                total++;
        }
        for ( int i=0 ; i<total ; i++ ) {
            ((Command) objects[i]).execute( );
        }
    }
}
