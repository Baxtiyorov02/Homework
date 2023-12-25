package Topshiriq_1;

public class Milk {
    private  double milkAmount=0;
    private  double milkPrice;

    public Milk() {
    }

    public Milk(double milkAmount, double milkPrice) {
        this.milkAmount = milkAmount;
        this.milkPrice = milkPrice;
    }

    public double getMilkAmount() {
        return milkAmount;
    }

    public double getMilkPrice() {
        return milkPrice;
    }
}
