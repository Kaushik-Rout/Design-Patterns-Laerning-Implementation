package LLD.SOLID.Factory;

public class Flutter {

    // non-factory methods

    void UIRefresh(){
        System.out.println("UI Refreshed");

    }

    void setTheme(){
        System.out.println("Set Theme");
    }

    // Factory methid to get corresponding factoru
    public UIFactory getUIFactory(Platform platform){
        return UIFactoruFactory.getUIFactory(platform);
    }

}
