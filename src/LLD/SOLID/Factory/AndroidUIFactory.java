package LLD.SOLID.Factory;

import LLD.SOLID.Factory.Components.Button.AndroidOSButton;
import LLD.SOLID.Factory.Components.Button.Button;
import LLD.SOLID.Factory.Components.Menu.AndroidOSMenu;
import LLD.SOLID.Factory.Components.Menu.Menu;

public class AndroidUIFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new AndroidOSButton();
    }

    @Override
    public Menu createMenu() {
        return new AndroidOSMenu();
    }
}
