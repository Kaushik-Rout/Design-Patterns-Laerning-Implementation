package LLD.SOLID.SingletonDP;

public class Client {
    public static void main(String[] args) {
        DBConnection db1 = DBConnection.getDBinstance();
        DBConnection db2 = DBConnection.getDBinstance();
        DBConnection db3 = DBConnection.getDBinstance();
        DBConnection db4 = DBConnection.getDBinstance();

        System.out.println("DEBUG");
    }
}
