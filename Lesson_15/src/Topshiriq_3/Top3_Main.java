package Topshiriq_3;

public class Top3_Main {
    public static void main(String[] args) {
        Lid lid=new Lid("abba1221");

        Bonus bonus=new Bonus(1);
        System.out.println(bonus.check(lid));
        System.out.println(bonus.check(new Lid("ww119999")));

    }
}
