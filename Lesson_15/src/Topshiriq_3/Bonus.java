package Topshiriq_3;

import java.util.Arrays;

public class Bonus {
    private int winNum;
    Lid lid;

    public Bonus(int winNum) {
        this.winNum = winNum;
    }

    private int converSignToNumber(char c){
        int number;
        switch (c) {
            case 'a', 'A' -> number = 1;
            case 'b', 'B' -> number = 2;
            case 'c', 'C' -> number = 3;
            case 'd', 'D' -> number = 4;
            case 'e', 'E' -> number = 5;
            case 'f', 'F' -> number = 6;
            case 'g', 'G' -> number = 7;
            case 'h', 'H' -> number = 8;
            case 'i', 'I' -> number = 9;
            case 'j', 'J' -> number = 10;
            case 'k', 'K' -> number = 11;
            case 'l', 'L' -> number = 12;
            case 'm', 'M' -> number = 13;
            case 'n', 'N' -> number = 14;
            case 'o', 'O' -> number = 15;
            case 'p', 'P' -> number = 16;
            case 'q', 'Q' -> number = 17;
            case 'r', 'R' -> number = 18;
            case 's', 'S' -> number = 19;
            case 't', 'T' -> number = 20;
            case 'u', 'U' -> number = 21;
            case 'v', 'V' -> number = 22;
            case 'w', 'W' -> number = 23;
            case 'x', 'X' -> number = 24;
            case 'y', 'Y' -> number = 25;
            case 'z', 'Z' -> number = 26;
            default -> {
                number = c;
                number -= 48;
            }
        }
        return number;
    }

    public boolean check(Lid lid){
        if (winNum!=0){
            boolean t=false;
            String s=lid.getKode();
            int [] numbers=new int[s.length()];
            char[] chars=new char[s.length()];

            for (int i = 0; i <s.length() ; i++) {
                chars[i]=s.charAt(i);
            }

            for (int i = 0; i <chars.length ; i++) {
                numbers[i]=converSignToNumber(chars[i]);
            }
            int summ1=0,summ2=0;
            for (int i =0; i <4 ; i++) {
                summ1+=numbers[i];
            }
            for (int i =4; i <8 ; i++) {
                summ2+=numbers[i];
            }
            if (summ1==summ2){
                t=true;
                winNum--;
            }
            return  t;

        }
        else {
            System.out.println("yutuqlar tugadi!");

        }

       return false;


    }

}

