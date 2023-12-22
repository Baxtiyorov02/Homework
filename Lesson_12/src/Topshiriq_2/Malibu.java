package Topshiriq_2;public class Malibu extends Car{
    private double capacity=7;


    public Malibu(int maxCapacity, int busyCapacity) {
        super(maxCapacity, busyCapacity);
    }

    @Override
    public String maxLongestWay() {
        return "mashina " + 100* getBusyCapacity()*capacity +" km yura oladi!";
    }

    @Override
    public String getMaxOilFromRefill() {
        return " shaxobchadan  " + (getMaxCapacity()-getBusyCapacity()) + " litr yoqilg`i ola oladi!";
    }


}
