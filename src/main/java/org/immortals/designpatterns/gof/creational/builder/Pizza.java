package org.immortals.designpatterns.gof.creational.builder;

public final class Pizza{


    private final String topping;

    private final boolean cheese;

    private final String dough;

    private final String sauce;

    public Pizza( PizzaBuilder builder ){
        this.topping=builder.topping;
        this.cheese=builder.cheese;
        this.dough=builder.dough;
        this.sauce=builder.sauce;
    }

    public String getTopping(){
        return topping;
    }

    public boolean isCheese(){
        return cheese;
    }

    public String getDough(){
        return dough;
    }

    public String getSauce(){
        return sauce;
    }

    @Override
    public String toString(){
        return "Pizza{"+
                "topping='"+topping+'\''+
                ", cheese="+cheese+
                ", dough='"+dough+'\''+
                ", sauce='"+sauce+'\''+
                '}';
    }

    public static class PizzaBuilder{


        private final String dough;

        private final String sauce;

        private String topping;

        private boolean cheese;

        public PizzaBuilder( String dough,String sauce ){
            this.dough=dough;
            this.sauce=sauce;
        }

        public PizzaBuilder topping( String topping ){
            this.topping=topping;
            return this;
        }

        public PizzaBuilder cheese( boolean cheese ){
            this.cheese=cheese;
            return this;
        }

        public Pizza build(){
            return new Pizza( this );
        }
    }
}
