package Topshiriq_4;

public class Triangle implements  Shape{
    private  double a;
    private  double  b;
    private  double  c;

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double getPerimetr() {
        return a+b+c;
    }

    @Override
    public double getSquare() {
        double p=getPerimetr();
        double S=Math.sqrt(p*(p-a)*(p-b)*(p-c));
        return S;
    }
}
