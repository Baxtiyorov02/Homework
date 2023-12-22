package Topshiriq_2;

public abstract class Car {
    private  double maxCapacity;
    private  double busyCapacity;


    public Car(int maxCapacity, int busyCapacity) {
        this.maxCapacity = maxCapacity;
        this.busyCapacity = busyCapacity;
    }
    public abstract String maxLongestWay();
    public abstract   String getMaxOilFromRefill();

    public double getMaxCapacity() {
        return maxCapacity;
    }

    public double getBusyCapacity() {
        return busyCapacity;
    }

}
