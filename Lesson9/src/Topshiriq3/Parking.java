package Topshiriq3;

import java.util.Arrays;

public class Parking {
    private  int maxCount;

    private Car[] carS=new Car[]{};
    Parking(int maxCount){
        this.maxCount=maxCount;
    }
    public  void addCar(Car car){
        if (!isFull()){
            Car[] newCars=new Car[carS.length+1];
            for (int i = 0; i <carS.length ; i++) {
                newCars[i]=this.carS[i];
            }
            newCars[carS.length]=car;
            this.carS=newCars;
            System.out.println("Done!");
        }
        else System.out.println("Eror!");
    }
    public void addCar(Car[] cars){
        if (cars.length+carS.length<maxCount){
            Car[] newCars=new Car[carS.length+cars.length];
            int index=0;
            for (int i = 0; i <carS.length ; i++) {
                newCars[index++]=this.carS[i];
            }
            for (int i = 0; i <cars.length ; i++) {
                newCars[index++]=cars[i];
            }
            this.carS=newCars;
            System.out.println("Done!");
        }
        else System.out.println("Eror!");
    }

    public  boolean isFull(){
        return carS.length==maxCount;
    }
    public boolean isEmpty(){
        return carS.length==0;
    }
    public  void show(){
        System.out.println(Arrays.toString(carS));
    }

    public static void main(String[] args) {
        Car malibu=new Car("Malibu","01001UZB");
        Car captiva=new Car("Captiva","01777UZB");
        Parking parking=new Parking(250);
        System.out.println(parking.isFull());
        Car[] cars={malibu,captiva};
        parking.addCar(cars);
        parking.show();
    }

}
