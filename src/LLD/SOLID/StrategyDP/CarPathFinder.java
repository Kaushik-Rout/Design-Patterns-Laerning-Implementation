package LLD.SOLID.StrategyDP;

public class CarPathFinder implements PathFinderStrategy{
    @Override
    public void findPath(String from, String to) {
        System.out.println("Car Path Found from "+ from + " to "+ to);
    }
}
