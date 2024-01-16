package Topshiriq_1;

public abstract class  Fruit {
    private  String name;
    private  String color;
    private  int weight;
    Fruit[] fruits;

    public Fruit(String name, String color, int weight) {
        this.name = name;
        this.color = color;
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public final void showInfo(){
        System.out.printf("name="+ name);
        System.out.printf("color="+ color);
        System.out.printf("weight="+ weight);

    }
}
