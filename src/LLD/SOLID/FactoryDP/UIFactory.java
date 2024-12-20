package LLD.SOLID.FactoryDP;

import LLD.SOLID.FactoryDP.Components.Button.Button;
import LLD.SOLID.FactoryDP.Components.Menu.Menu;

public interface UIFactory {

    // factory methods
    Button createButton(); //Return object of corresponding button

    Menu createMenu(); //Return object of corresponding Menu

}
