package LLD.SOLID.StrategyDP;

public class BikePathFinder implements PathFinderStrategy{
    @Override
    public void findPath(String from, String to) {
        System.out.println("Bike Path Found from " + from + " to " + to);
    }
}
