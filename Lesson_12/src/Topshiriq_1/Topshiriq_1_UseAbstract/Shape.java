package Topshiriq_1.Topshiriq_1_UseAbstract;

public abstract class Shape {

    private  double a;
    private  double b;

    public Shape(double a, double b) {
        this.a = a;
        this.b = b;
    }
    public  abstract  double getPerimetr();
    public  abstract  double getSquare();
    public  abstract  double getSideCount();

     Shape(double a) {
        this.a = a;
    }
    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }


}
