package LLD.SOLID.Factory;

import LLD.SOLID.Factory.Components.Button.Button;
import LLD.SOLID.Factory.Components.Menu.Menu;

public class Client {

    public static void main(String[] args) {

        Flutter flutter = new Flutter();

        flutter.setTheme();
        flutter.UIRefresh();

        ////From flutter, we should be able to get the object of corresponding factory based on the platform.
        UIFactory winfactory = flutter.getUIFactory(Platform.Windows);

        Button button = winfactory.createButton();
        button.displayButton();

        Menu menu = winfactory.createMenu();
        menu.displayMenu();

    }
}
