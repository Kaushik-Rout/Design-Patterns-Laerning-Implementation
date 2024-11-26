package LLD.SOLID.DecoratorDP;

public class ChocoCone implements Icecream{
    Icecream ic;

    //default - for base as chococone
    public ChocoCone(){}

    //parameterized - for cone as topping
    public ChocoCone(Icecream ic){
        this.ic = ic;
    }


    @Override
    public Double getCost() {
        if (ic != null){
            return ic.getCost()+30.0;
        }
        return 30.0;
    }

    @Override
    public String getDescription() {
        if(ic != null){
            return ic.getDescription()+"+ Choco Cone";
        }
        return "Choco Cone ";
    }
}
