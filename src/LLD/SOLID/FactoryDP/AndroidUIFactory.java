package LLD.SOLID.FactoryDP;

import LLD.SOLID.FactoryDP.Components.Button.AndroidOSButton;
import LLD.SOLID.FactoryDP.Components.Button.Button;
import LLD.SOLID.FactoryDP.Components.Menu.AndroidOSMenu;
import LLD.SOLID.FactoryDP.Components.Menu.Menu;

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
