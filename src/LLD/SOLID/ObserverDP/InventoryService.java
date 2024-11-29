package LLD.SOLID.ObserverDP;

public class InventoryService implements OnOrderPlacedSubscriber{

    InventoryService(){
        Flipkart flipkart = Flipkart.getInstance();
        flipkart.registerSubscriber(this);
    }
    @Override
    public void announceOrderPlaced() {
        System.out.println("Inventory has been updated");
    }
}
