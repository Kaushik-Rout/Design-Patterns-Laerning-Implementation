package LLD.SOLID.DecoratorDP;

public class OrangeCone implements Icecream{
    Icecream ic;

    //default - for base as chococone
    public OrangeCone(){}

    //parameterized - for cone as topping
    public OrangeCone(Icecream ic){
        this.ic = ic;
    }


    @Override
    public Double getCost() {
        if (ic != null){
            return ic.getCost()+20.0;
        }
        return 20.0;
    }

    @Override
    public String getDescription() {
        if(ic != null){
            return ic.getDescription()+"+ Orange Cone";
        }
        return "Orange Cone +";
    }
}
