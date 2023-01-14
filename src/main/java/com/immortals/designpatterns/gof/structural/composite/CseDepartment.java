package com.immortals.designpatterns.gof.structural.composite;

public class CseDepartment implements Department{


    private final Integer id;

    private final String name;

    public CseDepartment( Integer id,String name ){
        this.id=id;
        this.name=name;
    }

    @Override
    public void getDepartment(){
        System.out.println( getClass( ).getSimpleName( ) );
    }
}
