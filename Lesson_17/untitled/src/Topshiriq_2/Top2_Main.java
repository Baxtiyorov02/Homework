package Topshiriq_2;

public class Top2_Main {
    public static void main(String[] args) {
        Car car1=Car.getInstnce("Malibu turbo",120,15);
        car1.getMaxWay(7);
        System.out.println("car1.refuel(60) = " + car1.refuel(60));
        car1.getMaxWay(7);
        Car car2=Car.getInstnce("Gentra",150,30);
        System.out.println("car1.refuel(60) = " + car2.refuel(60));



    }


}
