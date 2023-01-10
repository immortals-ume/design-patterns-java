package org.immortals.designpatterns.gof.creational.abstractfactory;

public abstract class Truck{


    private TruckModel model=null;

    private Location location=null;

    public Truck( TruckModel model,Location location ){
        this.model=model;
        this.location=location;
    }

    protected abstract void construct();

    public TruckModel getModel(){
        return model;
    }

    public void setModel( TruckModel model ){
        this.model=model;
    }

    public Location getLocation(){
        return location;
    }

    public void setLocation( Location location ){
        this.location=location;
    }

    @Override
    public String toString(){
        return "Truck{"+
                "model="+model+
                ", location="+location+
                '}';
    }
}
