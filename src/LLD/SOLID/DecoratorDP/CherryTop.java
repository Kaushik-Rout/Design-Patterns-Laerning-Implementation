package LLD.SOLID.DecoratorDP;

public class CherryTop implements Icecream{
    Icecream ic;

    public CherryTop(Icecream ic){
        this.ic = ic;
    }

    @Override
    public Double getCost() {
        if (ic == null){
            throw new NullPointerException("Icecream base is not created");
        }
        return ic.getCost()+20.0;
    }

    @Override
    public String getDescription() {
        if (ic == null){
            throw new NullPointerException("Icecream base is not created");
        }
        return ic.getDescription()+"+ Cerry Topping";
    }
}
