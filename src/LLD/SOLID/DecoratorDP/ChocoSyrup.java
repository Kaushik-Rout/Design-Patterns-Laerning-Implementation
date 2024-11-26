package LLD.SOLID.DecoratorDP;

public class ChocoSyrup implements Icecream{
    Icecream ic;

    public ChocoSyrup(Icecream ic){
        this.ic = ic;
    }

    @Override
    public Double getCost() {
        if (ic == null){
            throw new NullPointerException("Icecream base is not created");
        }
        return ic.getCost()+10.0;
    }

    @Override
    public String getDescription() {
        if (ic == null){
            throw new NullPointerException("Icecream base is not created");
        }
        return ic.getDescription()+"+ Choco Syrup";
    }
}
