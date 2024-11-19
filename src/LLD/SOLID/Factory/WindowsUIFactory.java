package LLD.SOLID.Factory;

import LLD.SOLID.Factory.Components.Button.Button;
import LLD.SOLID.Factory.Components.Button.WindowsOSButton;
import LLD.SOLID.Factory.Components.Menu.Menu;
import LLD.SOLID.Factory.Components.Menu.WindowsOSMenu;

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
