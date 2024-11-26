package LLD.SOLID.DecoratorDP;

public class Client {

    public static void main(String[] args) {

        Icecream ic =
                new CherryTop(
                        new PistaScoop(
                                new StrawberryScoop(
                                        new ChocolateScoop(
                                                new OrangeCone(
                                                        new ChocoSyrup(
                                                                new ChocoCone()
                                                        )
                                                )
                                        )
                                )
                        )
                );

        System.out.println(ic.getCost());
        System.out.println(ic.getDescription());
    }
}
