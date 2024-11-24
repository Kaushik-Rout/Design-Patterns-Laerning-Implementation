package LLD.SOLID.StrategyDP;

public class WalkPathFinder implements PathFinderStrategy{
    @Override
    public void findPath(String from, String to) {
        System.out.println("Walk path found from " + from + " to " + to);
    }
}
