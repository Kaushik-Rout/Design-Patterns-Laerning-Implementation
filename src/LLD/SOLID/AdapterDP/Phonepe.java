package LLD.SOLID.AdapterDP;

import LLD.SOLID.AdapterDP.ThirdPartyBank.HDFCBank;

public class Phonepe {

    public static BankAPI bankAPI= new HDFCAdapter();

    public static void main(String[] args) {

        bankAPI.sendMoney("Aman", "Papa", 80000.50);
        bankAPI.getBalance("8564128");
        bankAPI.registerAccount("9692107969");
    }

}
