package atm;

import card.Card;
import database.User;
import util.IO;

public class AtmBank implements AtmFeature {

    private Card card;

    @Override
    public void boot(String username, String password) {
        IO.info("ATM Machine is booting...");
        for (int i = 0; i < User.COUNT; i++) {
            if (username.equals(User.USERNAMES[i])
                    && password.equals(User.PASSWORDS[i])) {
                // Load account from core banking
                IO.info("ATM Machine booted successfully.");
                return;
            }
        }
        IO.error("Username and Password is invalid..!");
    }

    @Override
    public void shutdown(String username, String password) {

    }

    @Override
    public void plugInCard(Card card) {

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
