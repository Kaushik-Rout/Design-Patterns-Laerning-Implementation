package LLD.SOLID.FactoryDP;

import LLD.SOLID.FactoryDP.Components.Button.Button;
import LLD.SOLID.FactoryDP.Components.Button.MacOSButton;
import LLD.SOLID.FactoryDP.Components.Menu.MacOSMenu;
import LLD.SOLID.FactoryDP.Components.Menu.Menu;

public class MacUIFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Menu createMenu() {
        return new MacOSMenu();
    }
}
