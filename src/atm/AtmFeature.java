package atm;

import card.Card;

public interface AtmFeature {
    void boot(String username, String password);
    void shutdown(String username, String password);
    void plugInCard(Card card);
    void plugOutCard();
    void doWithdrawal();
    void doDeposit();
    void doECash();
}
