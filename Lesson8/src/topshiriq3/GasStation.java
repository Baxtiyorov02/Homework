package topshiriq3;

public class GasStation {
    private int petrolAmount;

    public GasStation(int petroAmount) {
        this.petrolAmount = petroAmount;
    }
    public  boolean isEmpty(){
        return petrolAmount==0;
    }
    public boolean toSell(Car car){
        if(petrolAmount>=car.getOil()){
            petrolAmount-= car.getOil();
            showInfo(" mashina baki  toldirildi!");
            return true;
        }
        else {
            showInfo("GasStationda yetarli yoqilg`i mavjud emas");
            return false;
        }
    }
    public void addPetrol(int addValue){
        petrolAmount+=addValue;

    }
    
    private  void showInfo(String s){
        System.out.println(s);

    }
}
