package topshiriq2;

public class Fruit {
    private String  name;
    private String  color;
    private int weight;

    public Fruit(String name, String color, int weight) {
        this.name = name;
        this.color = color;
        this.weight = weight;
    }
    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", weight=" + weight +
                '}';
    }
}
