package LLD.SOLID.StrategyDP;

public class PathFinderFactory {

    public static PathFinderStrategy getPathFinderMode(String mode){
        if (mode.equals("Car")){
            return new CarPathFinder();
        }
        else if (mode.equals("Walk")){
            return new WalkPathFinder();
        }
        else if (mode.equals("Bike")){
            return new BikePathFinder();
        }
        return null;
    }
}
