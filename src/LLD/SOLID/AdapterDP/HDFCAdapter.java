package LLD.SOLID.AdapterDP;

import LLD.SOLID.AdapterDP.ThirdPartyBank.HDFCBank;

public class HDFCAdapter implements BankAPI{

    private HDFCBank hdfcBank = new HDFCBank();

    @Override
    public void sendMoney(String from, String to, double amount) {
        hdfcBank.transderMoney(to, from, amount);
    }

    @Override
    public void registerAccount(String accountNumber) {
        hdfcBank.newAccount(accountNumber);
    }

    @Override
    public Double getBalance(String accountNumber) {
        return hdfcBank.accBalance(accountNumber);
    }
}
