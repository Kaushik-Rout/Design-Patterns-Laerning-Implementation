package LLD.SOLID.AdapterDP;

import LLD.SOLID.AdapterDP.ThirdPartyBank.ICICIBank;

public class ICICIAdapter implements BankAPI{

    private ICICIBank iciciBank = new ICICIBank();

    @Override
    public void sendMoney(String from, String to, double amount) {
        iciciBank.transderMoney(to, from, amount);
    }

    @Override
    public void registerAccount(String accountNumber) {
        iciciBank.newAccount(accountNumber);
    }

    @Override
    public Double getBalance(String accountNumber) {
        return iciciBank.accBalance(accountNumber);
    }
}
