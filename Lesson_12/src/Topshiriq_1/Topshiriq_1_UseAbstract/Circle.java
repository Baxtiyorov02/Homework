package Topshiriq_1.Topshiriq_1_UseAbstract;

public class Circle extends  Shape{
    public Circle(double a) {
        super(a);
    }

    @Override
    public double getPerimetr() {
        return 2*Math.PI*getA();
    }

    @Override
    public double getSquare() {
        return Math.PI*getA()*getA();
    }

    @Override
    public double getSideCount() {
        return 1;
    }
}
