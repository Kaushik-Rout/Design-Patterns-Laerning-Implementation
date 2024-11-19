package LLD.SOLID.Factory;

import LLD.SOLID.Factory.Components.Button.Button;
import LLD.SOLID.Factory.Components.Button.IOSButton;
import LLD.SOLID.Factory.Components.Menu.IOSMenu;
import LLD.SOLID.Factory.Components.Menu.Menu;

public class IOSUIFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new IOSButton();
    }

    @Override
    public Menu createMenu() {
        return new IOSMenu();
    }
}
