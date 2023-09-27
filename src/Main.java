import account.Account;
import account.PayrollAccount;
import atm.AtmBank;
import card.Card;
import card.CreditCard;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        AtmBank atmBank = new AtmBank();
        atmBank.boot("admin", "admin@123");
        //-------------------------
        //-------------------------
        Card card = new CreditCard();
        card.setPin(1234);
        card.setIssuedAt(LocalDate.of(2022, 1, 1));
        card.setThruAt(card.getIssuedAt().plusYears(2));
        card.setLimitExpense(5000.00);
        atmBank.plugInCard(card);
        atmBank.doWithdrawal();
        atmBank.doDeposit();
    }
}
