package card;

import account.Account;

import java.time.LocalDate;

public abstract class Card {

    private Integer pin;
    private LocalDate issuedAt;
    private LocalDate thruAt;
    private Double limitExpense;
    private Account account;

    public Integer getPin() {
        return pin;
    }

    public void setPin(Integer pin) {
        this.pin = pin;
    }

    public LocalDate getIssuedAt() {
        return issuedAt;
    }

    public void setIssuedAt(LocalDate issuedAt) {
        this.issuedAt = issuedAt;
    }

    public LocalDate getThruAt() {
        return thruAt;
    }

    public void setThruAt(LocalDate thruAt) {
        this.thruAt = thruAt;
    }

    public Double getLimitExpense() {
        return limitExpense;
    }

    public void setLimitExpense(Double limitExpense) {
        this.limitExpense = limitExpense;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}
