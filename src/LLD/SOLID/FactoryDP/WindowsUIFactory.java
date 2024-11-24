package LLD.SOLID.FactoryDP;

import LLD.SOLID.FactoryDP.Components.Button.Button;
import LLD.SOLID.FactoryDP.Components.Button.WindowsOSButton;
import LLD.SOLID.FactoryDP.Components.Menu.Menu;
import LLD.SOLID.FactoryDP.Components.Menu.WindowsOSMenu;

public class WindowsUIFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new WindowsOSButton();
    }

    @Override
    public Menu createMenu() {
        return new WindowsOSMenu();
    }
}
