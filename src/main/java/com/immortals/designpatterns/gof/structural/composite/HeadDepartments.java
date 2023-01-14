package com.immortals.designpatterns.gof.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class HeadDepartments implements Department{


    private final Integer id;

    private final String name;

    private final List< Department > childDepartments;

    public HeadDepartments( Integer id,String name ){
        this.id=id;
        this.name=name;
        this.childDepartments=new ArrayList<>( );
    }

    public void getDepartment(){
        childDepartments.forEach( Department::getDepartment );
    }

    public void addDepartments( Department department ){
        childDepartments.add( department );
    }

    public void removeDepartments( Department department ){
        childDepartments.remove( department );
    }
}
