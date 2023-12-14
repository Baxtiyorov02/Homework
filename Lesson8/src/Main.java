import topshiriq2.Basket;
import topshiriq2.Capacity;
import topshiriq2.Fruit;

public class Main {
    public static void main(String[] args) {
        Capacity capacity=new Capacity(150);
        Fruit olma=new Fruit("olma","qizil",3);
        Fruit banan= new Fruit("banan","sariq", 10);
        Basket  basket=new Basket(capacity);
       /* System.out.println(basket.isEmpty());
        basket.addFruite(olma);
        basket.addFruite(banan);
        System.out.println(basket.isEmpty());
        System.out.println(basket.isFull());
        basket.showFruits();*/
        Fruit[] arrayFruits={olma,banan};
        basket.addFruites(arrayFruits);



    }
}
