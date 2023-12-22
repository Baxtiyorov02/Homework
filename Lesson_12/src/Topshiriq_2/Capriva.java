package Topshiriq_2;

public class Capriva extends  Car{

    private  double capacity=12;
    public Capriva(int maxCapacity, int busyCapacity) {
        super(maxCapacity, busyCapacity);
    }

    @Override
    public String maxLongestWay() {
        return "mashina " + 100*getBusyCapacity()/capacity +" km yura oladi!";
    }

    @Override
    public String getMaxOilFromRefill() {
        return " shaxobchadan  " + (getMaxCapacity()-getBusyCapacity()) + " litr yoqilg`i ola oladi!";
    }
}
