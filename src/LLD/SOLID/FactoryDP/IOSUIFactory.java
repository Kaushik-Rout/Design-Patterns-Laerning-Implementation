package LLD.SOLID.FactoryDP;

import LLD.SOLID.FactoryDP.Components.Button.Button;
import LLD.SOLID.FactoryDP.Components.Button.IOSButton;
import LLD.SOLID.FactoryDP.Components.Menu.IOSMenu;
import LLD.SOLID.FactoryDP.Components.Menu.Menu;

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
