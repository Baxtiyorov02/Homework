package Topshiriq_2;

public abstract class Shape {
    private  double a;
    private double b;
    private  double c;



    public double yuza(double a){
        return Math.PI*a*a;
    }
    public double yuza(double a, double b){
        return a+b;
    }
    public double yuza(double a,double b,double c){
        double halfPer=(a+b+c)/2;
        return Math.sqrt(halfPer*(halfPer-a)*(halfPer-b)*(halfPer-c));
    }
    public double perimetr(double a){
        return a*2;
    }
    public double perimetr(double a,double b){
        return 2*(a+b);
    }
    public double perinetr(double a, double b, double c){
        return a+b+c;
    }
}
