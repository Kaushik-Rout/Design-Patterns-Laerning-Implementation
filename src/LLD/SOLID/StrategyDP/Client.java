package LLD.SOLID.StrategyDP;

public class Client {

    public static void main(String[] args) {
        GoogleMaps googleMaps = new GoogleMaps();
        googleMaps.findRoute("Alaska", "India", "Car");
    }
}
