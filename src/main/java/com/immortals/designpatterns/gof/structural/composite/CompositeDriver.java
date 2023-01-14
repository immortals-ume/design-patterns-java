package com.immortals.designpatterns.gof.structural.composite;

public class CompositeDriver{


    public static void main( String[] args ){
        Department cseDepartment=new CseDepartment( 1,"CSE department" );

        Department eceDepartment=new EceDepartment( 2,"ECE department" );

        Department mechDepartment=new MechanicalDepartment( 4,"Mech Department" );
        HeadDepartments departments=new HeadDepartments( 3,"head Departments" );
        departments.addDepartments( cseDepartment );
        departments.addDepartments( eceDepartment );
        departments.addDepartments( mechDepartment );
        departments.removeDepartments( cseDepartment );
        departments.getDepartment( );
    }

}
