package Topshiriq_4;

public class Kvadrat implements Shape {

    private  double a;

    public Kvadrat(double a) {
        this.a = a;
    }

    @Override
    public double getPerimetr() {
        return 4*a;
    }

    @Override
    public double getSquare() {
        return a*a;
    }
}
