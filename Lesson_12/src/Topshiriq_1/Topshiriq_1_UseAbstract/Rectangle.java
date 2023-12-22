package Topshiriq_1.Topshiriq_1_UseAbstract;

public class Rectangle extends Shape{

    public Rectangle(double a, double b) {
        super(a, b);
    }

    @Override
    public double getPerimetr() {
        return 2*(getA()+getB());
    }

    @Override
    public double getSquare() {
        return getA()*getB();
    }

    @Override
    public double getSideCount() {
        return 2;
    }
}
