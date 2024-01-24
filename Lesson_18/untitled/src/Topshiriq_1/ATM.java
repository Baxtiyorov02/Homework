package Topshiriq_1;

import java.util.*;

public class ATM {


    MessageInterface messageInterface=null;
    ShowMoneyInfoInterface showMoneyInfoInterface=null;
    List<Money> moneyList=new LinkedList<>();


    private  boolean hasMessListeener(){ return messageInterface!=null;}
    private  boolean hasShovMoneyListeener(){ return showMoneyInfoInterface!=null;}

    public void setMessageInterface(MessageInterface messageListener){
        if(!hasMessListeener()){
            this.messageInterface=messageListener;
        }
    }
    public   void setShowMoneyInfoInterface(ShowMoneyInfoInterface moneyListener){
        if (!hasShovMoneyListeener()){
            this.showMoneyInfoInterface=moneyListener;
        }
    }

    public void addMoneys(List<Money> moneys){
            moneyList.addAll(moneys);






            Collections.sort(moneyList);
            moneyList=moneyList.reversed();
        messageInterface.showMessage("Pul qo`shildi!");
    }
    public void isGetMoney(int getSumm){

        if(getSumm<=getBalance()){

            for (int i = 0; i <moneyList.size() ; i++) {
                int moneyAmount=moneyList.get(i).getAmount();
                if(getSumm>=moneyAmount){
                    int count=getSumm/moneyAmount;
                    moneyList.get(i).setCount(-count);
                    getSumm=getSumm% moneyAmount;
                }
                            }

            if(getSumm==0){
                messageInterface.showMessage("Done");

            }
            else {
                messageInterface.showMessage("Kiritilgan summaga mos valyuta yetarli emas!");
            }

        }
        else {
            messageInterface.showMessage("Balansda mablag`  yetarli emas!");

        }

    }
    public void moneyInfo(){
        for (Money money : moneyList) {
            showMoneyInfoInterface.showMoneyData(money.getAmount(), money.getCount());
        }
        }
        public int getBalance(){
        int summ=0;
            for (int i = 0; i <moneyList.size() ; i++) {
                summ+=moneyList.get(i).getAmount()*moneyList.get(i).getCount();
            }
        return summ;
        }

}
