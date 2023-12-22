package Topshiriq_1.Topshiriq_1_UseInterface;

public interface Shape {
    double a = 0;
    double b = 0;


     double getPerimetr();
     double getSquare();
     double getSideCount();

    static double getA(){
        return a;
    }
    static double getB(){
        return b;
    }
    static void setA(double a){
        a=a;
    }
    static void  setB(double b){
        b=b;
    }





}
