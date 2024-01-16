package Topshiriq_1;

public class Top1_Main {
    public static void main(String[] args) {
        Apple apple=new Apple("olma","qizil",100);
        Peach peach=new Peach("shaftoli","sariq",50);
        Pomegranat pomegranat= new Pomegranat("anor","qizil",150);
        Fruit[] fruits={apple,peach,pomegranat};

        Basket basket=new Basket(1000);
        System.out.println("basket.isEmpty() = " + basket.isEmpty());
        System.out.println("basket.isFull() = " + basket.isFull());
        System.out.println("basket.addFruit(apple) = " + basket.addFruit(apple));
        System.out.println("basket.addFruit(fruits) = " + basket.addFruit(fruits));
        System.out.println("basket.getEmptySize() = " + basket.getEmptySize());

    }
}
