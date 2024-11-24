package LLD.SOLID.StrategyDP;

public class GoogleMaps {

    public void findRoute(String from, String to, String mode){
        PathFinderStrategy pathFinderStrategy = PathFinderFactory.getPathFinderMode(mode);

        pathFinderStrategy.findPath(from, to);
    }
}
