package LLD.SOLID.ObserverDP;

public class InvoiceService implements OnOrderPlacedSubscriber{

    InvoiceService(){
        Flipkart flipkart = Flipkart.getInstance();
        flipkart.registerSubscriber(this);
    }
    @Override
    public void announceOrderPlaced() {
        System.out.println("Invoice is generated and sent to the customer");
    }
}
