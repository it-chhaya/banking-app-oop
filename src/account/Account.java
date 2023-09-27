package account;

import card.Card;
import util.IO;

public abstract class Account implements Transaction {
    private Integer id;
    private String owner;
    private Double balance;
    private Card card;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    @Override
    public Double withdrawal(Double amount) {
        if (amount > balance) {
            IO.error("Insufficient balance..!");
            return null;
        }
        balance -= amount;
        return amount;
    }

    @Override
    public void deposit(Double amount) {
        balance += amount;
    }
}
