package account;

public interface Transaction {
    Double withdrawal(Double amount);
    void deposit(Double amount);
}
