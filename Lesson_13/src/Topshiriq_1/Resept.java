package Topshiriq_1;

public class Resept {
    private  double sugarRatio;
    private  double milkRatio;

    public Resept( double milkRatio,double sugarRatio) {
        this.sugarRatio = sugarRatio;
        this.milkRatio = milkRatio;
    }

    public double getSugarRatio() {
        return sugarRatio;
    }

    public double getMilkRatio() {
        return milkRatio;
    }
}
