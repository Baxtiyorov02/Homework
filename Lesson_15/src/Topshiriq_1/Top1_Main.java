package Topshiriq_1;

public class Top1_Main {
    public static void main(String[] args) {
        Battery battery=new Battery(1600);
        Car kamaz=new Car(3,15);

        System.out.println(kamaz.getBatteryInfo());
        System.out.println(kamaz.addBattery(15));
        System.out.println(kamaz.run(3));
        System.out.println(kamaz.getBatteryInfo());

    }
}
