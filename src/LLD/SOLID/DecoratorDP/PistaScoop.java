package LLD.SOLID.DecoratorDP;

public class PistaScoop implements Icecream{
    Icecream ic;

    public PistaScoop(Icecream ic){
        this.ic = ic;
    }

    @Override
    public Double getCost() {
        if (ic == null){
            throw new NullPointerException("Icecream base is not created");
        }
        return ic.getCost()+80.0;
    }

    @Override
    public String getDescription() {
        if (ic == null){
            throw new NullPointerException("Icecream base is not created");
        }
        return ic.getDescription()+"+ Pista Scoop";
    }
}
