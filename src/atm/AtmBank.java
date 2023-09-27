package atm;

import account.Account;
import account.PayrollAccount;
import card.Card;
import database.User;
import util.IO;

import java.time.LocalDate;

public class AtmBank implements AtmFeature {

    private Account[] accounts;
    private Card card;

    private void loadAccountsFromSystem() {
        accounts = new Account[2];
        accounts[0] = new PayrollAccount();
        accounts[0].setId(1);
        accounts[0].setOwner("MR.RONALDO");
        accounts[0].setBalance(800000.00);
        accounts[0].setCard(null);
        accounts[1] = new PayrollAccount();
        accounts[1].setId(2);
        accounts[1].setOwner("MR.MESSI");
        accounts[1].setBalance(900000.00);
        accounts[1].setCard(null);
    }

    @Override
    public void boot(String username, String password) {
        IO.info("ATM Machine is booting...");
        for (int i = 0; i < User.COUNT; i++) {
            if (username.equals(User.USERNAMES[i])
                    && password.equals(User.PASSWORDS[i])) {
                // Load account from core banking
                loadAccountsFromSystem();
                IO.info("ATM Machine booted successfully.");
                return;
            }
        }
        IO.error("Username and Password is invalid..!");
    }

    @Override
    public void shutdown(String username, String password) {
        IO.info("ATM Machine is shutting down...");
        for (int i = 0; i < User.COUNT; i++) {
            if (username.equals(User.USERNAMES[i])
                    && password.equals(User.PASSWORDS[i])) {
                // remove account from core banking
                accounts = null;
                IO.info("ATM Machine shutdown successfully.");
                return;
            }
        }
        IO.error("Username and Password is invalid..!");
    }

    @Override
    public void plugInCard(Card card) {
        if (card != null) {
            Integer atmPin = IO.getInteger("Enter pin: ");
            if (atmPin.equals(card.getPin())
                    && LocalDate.now().isBefore(card.getThruAt())) {
                this.card = card;
                IO.info("You have plugged card successfully.");
                IO.info("Enjoy doing your transaction.");
                return;
            }
        }
        IO.error("Invalid card..!");
    }

    @Override
    public void plugOutCard() {

    }

    @Override
    public void doWithdrawal() {

    }

    @Override
    public void doDeposit() {

    }
    @Override
    public void doECash() {

    }
}
