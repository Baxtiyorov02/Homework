package Topshiriq_1;

public class Top1_Main {
    public static void main(String[] args) {
        Milk milk=new Milk(80,2000);
        Sugar sugar=new Sugar(120, 6000);
        Resept resept=new Resept(2,1);
        Price price1=new Price(0.2,2000);
        IseCream iseCream=new IseCream(price1,resept);
        iseCream.addMilk(milk);
        iseCream.addSugar(sugar);

        System.out.println(iseCream.getCount());
        System.out.println(iseCream.buy(5));
        iseCream.getBalance();
        System.out.println(iseCream.hasIceCream());
        iseCream.getInfo();
        iseCream.getProfit();


    }
}
