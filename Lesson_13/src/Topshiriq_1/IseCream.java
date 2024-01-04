package Topshiriq_1;

public class IseCream {
    Sugar sugar;
    Milk milk;
    String info="";
    private  Price price;
    private  Resept resept;
    private  double oneLitrMilkPrice;
    private  double oneKgSugarPrice;
    private  double milkAmount;
    private  double sugarAmount;
    private  double soldOutSugar;
    private  double soldOutMilk;
    private double buyCountIceCrea=0;

    public IseCream(Price price, Resept resept) {
        this.price = price;
        this.resept = resept;
    }

    public  void addMilk(Milk milk){
        this.milkAmount+=milk.getMilkAmount();
        oneLitrMilkPrice=milk.getMilkPrice();

    }
    public  void addSugar(Sugar sugar){
        sugarAmount+=sugar.getSugarAmount();
        oneKgSugarPrice=sugar.getSugarPrice();


    }
    public  int  getCount(){
        return  findCount();

    }
    public boolean buy(int n ) {
        if(n<=findCount()){
            buyCountIceCrea+=n;
            sugarAmount-=n*resept.getSugarRatio();
            soldOutSugar+=n* resept.getSugarRatio();
            milkAmount-=n*resept.getMilkRatio();
            soldOutMilk+=resept.getMilkRatio();
            info+= n+ "ta sotilgan va "+ price.getGetOneIceCreamPrice()
                    +"dan bo`lsa "+ n*price.getGetOneIceCreamPrice()+ "\n";
            return true;
        }
        else {
            return false; }


    }
    public  boolean hasIceCream(){
        return getCount()>0;
    }
    public  void getProfit(){
        double spentForSugarMoney =0;
        spentForSugarMoney = spentForSugarMoney + oneKgSugarPrice* soldOutSugar/10;
        double spentForMilkMoney = 0;
        spentForMilkMoney= spentForMilkMoney+oneLitrMilkPrice*soldOutMilk/10;
        double profit=buyCountIceCrea*price.getGetOneIceCreamPrice()-(spentForMilkMoney+spentForSugarMoney);
        System.out.println("sizning hozircha ko`rgan foydangiz: "+ profit);
    }
    public  void getInfo(){
        System.out.println(info);
    }

    public  void getBalance(){
        double balance=buyCountIceCrea*price.getGetOneIceCreamPrice();
        System.out.println(balance);
    }

    private int findCount(){
        double x= price.getOneIceCreamWeight()/(resept.getMilkRatio()+ resept.getMilkRatio());
        double forOneSugar=x* resept.getSugarRatio();
        double forOneMilk=x* resept.getMilkRatio();
        if(milkAmount/forOneMilk>= sugarAmount/forOneSugar){
            return (int)(sugarAmount/forOneSugar);
        }
             return   (int)(milkAmount/forOneMilk);
        }
    }



