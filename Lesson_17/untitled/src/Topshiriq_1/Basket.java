package Topshiriq_1;

public class Basket {

   private Fruit[] myFruits=new Fruit[]{};
     public final int maxWeight;
     private int emptySize;

    public Basket(int maxWeight) {
        this.maxWeight = maxWeight;
        emptySize=maxWeight;
    }
    public  boolean isEmpty(){
        return emptySize==maxWeight;
    }
    public boolean isFull(){
        return  emptySize==0;
    }
    public boolean addFruit(Fruit fruit){
        if(emptySize>fruit.getWeight()){
            Fruit[] fruits1=new Fruit[myFruits.length+1];
            int index=0;
            for (int i = 0; i < myFruits.length ; i++) {
                fruits1[index++]=myFruits[i];
            }
            fruits1[index]=fruit;
            myFruits=fruits1;
            emptySize-=fruit.getWeight();
            return true;
        }
        else return false;
    }
    public  int getEmptySize(){
        return emptySize;
    }
    public  boolean addFruit(Fruit[] fruits){
        int weights = 0;
        for (int i = 0; i <fruits.length ; i++) {
            weights+=fruits[i].getWeight();
        }
        if (emptySize>weights){
            Fruit[] fruits1=new Fruit[myFruits.length+fruits.length];
            int index=0;
            for (int i = 0; i < myFruits.length ; i++) {
                fruits1[index++]=myFruits[i];
            }
            for (int i = 0; i <fruits.length ; i++) {
                fruits1[index++]=fruits[i];
                }
            myFruits=fruits;
            emptySize-=weights;
            return true;
        }
        else return false;
    }
}
