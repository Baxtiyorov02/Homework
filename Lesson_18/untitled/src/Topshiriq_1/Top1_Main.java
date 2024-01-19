package Topshiriq_1;

import java.util.LinkedList;
import java.util.List;

public class Top1_Main {
    public static void main(String[] args) {
        Money money1=new Money(1000,150);
        Money money2=new Money(2000,300);
        Money money3=new Money(5000,200);
        Money money4=new Money(10000,200);
        Money money5=new Money(100000,100);
        Money money6=new Money(200000,10);

        List<Money> moneyList=new LinkedList<>();
        moneyList.add(money1);
        moneyList.add(money6);
        moneyList.add(money4);
        moneyList.add(money3);
        moneyList.add(money5);
        moneyList.add(money2);
        ATM atm=new ATM();

        atm.setMessageInterface(new MessageInterface() {
            @Override
            public void showMessage(String message) {
                System.out.println(message);

            }
        });
        atm.setShowMoneyInfoInterface(new ShowMoneyInfoInterface() {
            @Override
            public void showMoneyData(int amoun, int count) {
               // System.out.println("\n");
                System.out.println(amoun+ " dan " + count +" ta");
            }
        });
        atm.addMoneys(moneyList);
        atm.isGetMoney(459000);
        atm.moneyInfo();



    }
}
