package LLD.SOLID.AdapterDP;

public interface BankAPI {
    void sendMoney(String from, String to, double amount);
    void registerAccount(String accountNumber);
    Double getBalance(String accountNumber);
}
