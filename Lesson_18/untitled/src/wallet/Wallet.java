package wallet;

import java.util.LinkedList;
import java.util.List;

public class Wallet {
    LongInterface longInterface=null;
    ShowCardInterface showCardInterface=null;
    List<Card> cardList=new LinkedList<>();
    private  double cashMoneyAmount;



    private  boolean hasLogListener(){
        return longInterface!=null;
    }
    private  boolean hasShowCardLinstener(){
        return  showCardInterface!=null;
    }
    public void setLongInterface(LongInterface logListener){
        if(!hasLogListener()) {
            this.longInterface = logListener;
        }
    }
    public void setShowCardInterface(ShowCardInterface cardListener){
        if(!hasShowCardLinstener()){
            this.showCardInterface=cardListener;
        }
    }
    public  void addCard(Card card){
        if (!cardList.contains(card)){
            cardList.add(card);
            longInterface.sendMessage("karta qo`shildi!");
        }
        else {
            longInterface.sendMessage("Quidagi karta sizda mavjud!");
            showCardInterface.showCardData(card);
        }
    }
    public  void addCards(List<Card> cards){
        for (Card card : cards) {
            addCard(card);
        }
    }
    public  void addBalance(double addBalance){
        cashMoneyAmount+=addBalance;
    }
    public  double getTotalBalance(){
        double totalBalance = 0.0;
        for (Card card : cardList) {
            totalBalance += card.getAmount();
        }
        return totalBalance;
    }
    public  void getAllCards(){
        for (Card card : cardList) {
            showCardInterface.showCardData(card);
        }

    }
    public  void spendMoney(double money){
        if(money<=cashMoneyAmount){
            cashMoneyAmount-=money;
        }
        else {
            longInterface.sendMessage(money-cashMoneyAmount +" summa yetmaydi");
        }
    }
    public  void spendMoneyFromCard(Card card, int spendMoney){
        if (cardList.contains(card)){
            if(spendMoney<=card.getAmount()){
                card.setAmount(-spendMoney);
                showCardInterface.showCardData(card);
            }
            else {
                longInterface.sendMessage("cardda "+ (spendMoney-card.getAmount())+"  shuncha summa yetmaydi! ");

            }
        }
        else {
            longInterface.sendMessage(" karta topilmadi!");

        }
    }


}
