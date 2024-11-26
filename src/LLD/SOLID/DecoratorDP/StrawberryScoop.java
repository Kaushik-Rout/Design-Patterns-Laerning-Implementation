package LLD.SOLID.DecoratorDP;

public class StrawberryScoop implements Icecream{
    Icecream ic;

    public StrawberryScoop(Icecream ic){
        this.ic = ic;
    }

    @Override
    public Double getCost() {
        if (ic == null){
            throw new NullPointerException("Icecream base is not created");
        }
        return ic.getCost()+70.0;
    }

    @Override
    public String getDescription() {
        if (ic == null){
            throw new NullPointerException("Icecream base is not created");
        }
        return ic.getDescription()+"+ Chocolate Scoop";
    }
}
