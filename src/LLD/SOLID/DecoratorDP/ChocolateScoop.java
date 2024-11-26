package LLD.SOLID.DecoratorDP;

public class ChocolateScoop implements Icecream{
    Icecream ic;

    public ChocolateScoop(Icecream ic){
        this.ic = ic;
    }

    @Override
    public Double getCost() {
        if (ic == null){
            throw new NullPointerException("Icecream base is not created");
        }
        return ic.getCost()+60.0;
    }

    @Override
    public String getDescription() {
        if (ic == null){
            throw new NullPointerException("Icecream base is not created");
        }
        return ic.getDescription()+"+ Chocolate Scoop";
    }
}
