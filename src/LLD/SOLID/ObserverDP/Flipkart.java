package LLD.SOLID.ObserverDP;

import java.util.ArrayList;
import java.util.List;

public class Flipkart {
    private static Flipkart flipkartInstance=null;

    private List<OnOrderPlacedSubscriber> onOrderPlacedSubscribers=new ArrayList<>();

    private Flipkart(){}

    public static Flipkart getInstance(){
        if (flipkartInstance==null){
            return new Flipkart();
        }
        return flipkartInstance;
    }

    public void registerSubscriber(OnOrderPlacedSubscriber onOrderPlacedSubscriber){
        onOrderPlacedSubscribers.add(onOrderPlacedSubscriber);
    }

    public void unregisterSubscriber(OnOrderPlacedSubscriber onOrderPlacedSubscriber){
        onOrderPlacedSubscribers.remove(onOrderPlacedSubscriber);
    }

    public void notifyOrderPlaced(){
        //ns.notify();
        //es.sendEmail();

        for( OnOrderPlacedSubscriber onOrderPlacedSubscriber:onOrderPlacedSubscribers){
            onOrderPlacedSubscriber.announceOrderPlaced();
        }
    }




}
