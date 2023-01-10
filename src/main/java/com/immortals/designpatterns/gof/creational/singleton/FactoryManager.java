package com.immortals.designpatterns.gof.creational.singleton;

public class FactoryManager{


    private static FactoryManager instance=null;

    private static final int tracks=5;

    private FactoryManager(){}

    public static FactoryManager getInstance(){
        if ( instance==null ) {
            instance=new FactoryManager( );
        }
        return instance;
    }

    public static void startTracks(){
        for ( int i=0 ; i<tracks ; ++i ) {
            Track track  = new Track();

            track.start( );
        }
    }
}
