package account;

public class PayrollAccount extends Account {
    @Override
    public void deposit(Double amount) {
        Double taxAmount = amount * 0.2;
        Double grandAmount = amount - taxAmount;
        super.deposit(grandAmount);
    }
}
