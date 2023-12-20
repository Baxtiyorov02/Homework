package Topshiriq_2;

public class Triangle extends Shape {

    public Triangle(double a, double b, double c) {
        super(a, b, c);
    }

    @Override
    public double getArea() {
        double p=getPerimetr()/2;
        return Math.sqrt(p*(p-getA())*(p-getB())*(p-getC()));
    }

    @Override
    public double getPerimetr() {
        return getA()+getB()+getC();
    }
}
