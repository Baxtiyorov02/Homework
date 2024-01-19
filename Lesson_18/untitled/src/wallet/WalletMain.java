package wallet;

import java.util.LinkedList;
import java.util.List;

public class WalletMain {
    public static void main(String[] args) {
        Card card1=new Card("Islom","3682",200000);
        Card card2=new Card("Islom","3680",100000);
        Card card3=new Card("Islom","3690",500600);
        List<Card> cards=new LinkedList<>();
        cards.add(new Card("Islom","0011",500));
        cards.add(new Card("Islom","0010",1200000));
        cards.add(new Card("Islom","3690",500600));

        Wallet wallet=new Wallet();
        wallet.setLongInterface(new LongInterface() {
            @Override
            public void sendMessage(String message) {
                System.out.println(message);

            }
        });
        wallet.setShowCardInterface(new ShowCardInterface() {
            @Override
            public void showCardData(Card card) {
                System.out.println("\n");
                System.out.println(card);

            }
        });
       // wallet.addCard(card1);
        wallet.addCard(card2);
        wallet.addCard(card3);
       // wallet.addCards(cards);
       // wallet.getAllCards();
        wallet.addBalance(15000);
        System.out.println(wallet.getTotalBalance());
        wallet.spendMoney(56000);
        wallet.spendMoneyFromCard(card1,550000);
    }
}
