package LLD.SOLID.FactoryDP;

public class UIFactoruFactory {

    public static UIFactory getUIFactory(Platform platform) {
        if (platform == Platform.Windows) {
            return new WindowsUIFactory();
        }
        else if (platform == Platform.Mac) {
            return new MacUIFactory();
        }
        else if (platform == Platform.Android){
            return new AndroidUIFactory();
        }
        else if (platform == Platform.IOS){
            return new IOSUIFactory();
        }
        return null;
    }
}
