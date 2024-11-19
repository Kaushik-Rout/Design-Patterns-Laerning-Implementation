package LLD.SOLID.Factory;

import LLD.SOLID.Factory.Components.Button.Button;
import LLD.SOLID.Factory.Components.Button.MacOSButton;
import LLD.SOLID.Factory.Components.Menu.MacOSMenu;
import LLD.SOLID.Factory.Components.Menu.Menu;

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
