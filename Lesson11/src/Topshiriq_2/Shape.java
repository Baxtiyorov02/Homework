package Topshiriq_2;

public abstract class Shape {
    private  double a;
    private double b;
    private  double c;

    public Shape(double a) {
        this.a = a;
    }

    public Shape(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public  abstract double getArea();
    public  abstract double getPerimetr();

    public  double getA() {
        return a;
    }

    protected double getB() {
        return b;
    }

    protected double getC() {
        return c;
    }
}
