package LLD.SOLID.AdapterDP.ThirdPartyBank;

public class HDFCBank {

    public void transderMoney(String to, String from, Double money) {
        System.out.println("Transfered "+ money + " to "+ to + " from " + from);
    }

    public void newAccount(String AccNo){
        System.out.println("New Account created "+AccNo);
    }

    public Double accBalance(String AccNo){
        System.out.println("Balance of  "+AccNo);
        return 0.0;
    }
}
