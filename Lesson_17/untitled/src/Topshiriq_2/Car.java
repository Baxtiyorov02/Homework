package Topshiriq_2;

public class Car {
    private final String name;
    private final  int maxCapasity;
    private  int busyCapasity;
    private static Car instance;
    private Car(String name, int maxCapasity, int busyCapasity) {
        this.name = name;
        this.maxCapasity = maxCapasity;
        this.busyCapasity = busyCapasity;
    }
    public static Car getInstnce(String name, int maxCapasity, int busyCapasity){
        if(instance==null){
            instance=new Car(name,  maxCapasity, busyCapasity);
        }
        return instance;
    }

    public  boolean isActive(){
        return busyCapasity!=0;
    }
    public  boolean refuel(int addPetrol){
        if (addPetrol<maxCapasity-busyCapasity){
            busyCapasity+=addPetrol;
            return  true;
        }
        else return false;
    }
    public  void getMaxWay(int value){
        System.out.println( " 1 kmga "+value + " litr qobiliyat bilan bizning mashina "
                + busyCapasity/value +" km masofani bosa oladi");
    }
}
