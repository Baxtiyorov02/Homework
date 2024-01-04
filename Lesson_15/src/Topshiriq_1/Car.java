package Topshiriq_1;

public class Car {
    private Battery battery=new Battery(1500);
    private final int slotNumber;
    private final int power;
    private  int countSlot=1;
    private double summCapacity=countSlot*battery.getCapacity();

    public Car(int slotNumber, int power) {
        this.slotNumber = slotNumber;
        this.power = power;
    }

    public  boolean run(int t){
        double tenton = 1.5;
        double time=(summCapacity* tenton)/power;
        if (time>=t){
            summCapacity-=(t*power)/ tenton;
            return  true;
        }
        else return false;
    }
    public  double getBatteryInfo(){
        System.out.println((int)(summCapacity*100/battery.getCapacity())+" %");
        return summCapacity;
    }
    public  boolean addBattery(double batteryCapasity){
        if(countSlot<slotNumber){
            countSlot++;
            battery.setCapacity(battery.getCapacity()+batteryCapasity);
            return true;
        }
        else return false;
    }


}
