package Topshiriq_3;

public class Top_3_Main {
    public static void main(String[] args) {
        Computer comp1=new Asus("coreI3",512);
        Computer com2=new Hp("coreI5",1024);
        comp1.showInfo();
        com2.showInfo();
    }
}
