package topshiriq2;


import java.util.Arrays;

public class Basket {

    Fruit[] fruits;
    Capacity capacity;

    public Basket(Capacity capacity) {
        this.capacity=capacity;
        this.fruits=new Fruit[]{};
            }
    public  boolean isFull(){
        return fruits.length==capacity.getCapacity();
    }
    public  boolean isEmpty(){
        return this.fruits.length==0;
    }
    private  void showInfo(){
        System.out.println(Arrays.toString(fruits));
    }
    public   void addFruite(Fruit fruit){
        if (!isFull()) {
            Fruit[] addFruit = new Fruit[fruits.length + 1];
            for (int i = 0; i < fruits.length; i++) {
                addFruit[i] = fruits[i];
            }
            addFruit[fruits.length] = fruit;
            this.fruits = addFruit;
            showInfo();
        }
        else {
            System.out.println("joy yo`q");
        }
    }
    public  void addFruites(Fruit[] fruitsI){
        if (!isFull()){
            Fruit[] addFruits=new Fruit[fruits.length+fruitsI.length];
            for (int i = 0; i <fruits.length ; i++) {
                addFruits[i]=fruits[i];
            }
            for (int i = 0; i <fruitsI.length ; i++) {
                addFruits[i]=fruitsI[i];
            }
            this.fruits=addFruits;
            showInfo();
        }
    }
    public  void showFruits(){
        for (int i = 0; i <fruits.length ; i++) {
            System.out.println(fruits[i]);

        }

        }
    }
