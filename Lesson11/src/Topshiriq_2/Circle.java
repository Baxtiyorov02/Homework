package Topshiriq_2;

public class Circle extends  Shape{
    public Circle(double a) {
        super(a);
    }
    @Override
    public double getArea() {
        return Math.PI+getA()*getA();
    }
    @Override
    public double getPerimetr() {
        return 2*getA();
    }
}
