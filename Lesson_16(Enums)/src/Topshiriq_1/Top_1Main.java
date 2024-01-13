package Topshiriq_1;

import java.util.Scanner;

public class Top_1Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("oy raqamini kiring: ");
        int n= scanner.nextInt();


        MonthEnum[] monthEnums=MonthEnum.values();
        MonthEnum thisMonth=monthEnums[n-1];
        String season=thisMonth.getSeason();

        System.out.println(thisMonth);
        System.out.println(season);





    }
}
