package LLD.SOLID.Factory;

import LLD.SOLID.Factory.Components.Button.Button;
import LLD.SOLID.Factory.Components.Menu.Menu;

public interface UIFactory {

    // factory methods
    Button createButton(); //Return object of corresponding button

    Menu createMenu(); //Return object of corresponding Menu

}
