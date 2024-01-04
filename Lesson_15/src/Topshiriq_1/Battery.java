package Topshiriq_1;

public class Battery {
    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    private  double capacity;

    public Battery(double capacity) {
        this.capacity = capacity;
    }

    public double getCapacity() {
        return capacity;
    }

}
