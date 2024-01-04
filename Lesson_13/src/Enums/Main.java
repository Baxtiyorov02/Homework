package Enums;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        BankCardTipe [] bankCardTipes=BankCardTipe.values();
        System.out.print("Bizda quidagi karta xizmatlari bor:  ");
        System.out.println(Arrays.toString(bankCardTipes));
        System.out.println("o`zingiz uchun ma`qulini tanlang ");
        String s= scanner.nextLine();
        BankCardTipe bankCardTipe=BankCardTipe.valueOf(s.toUpperCase());
        System.out.println("siz "+ bankCardTipe +"  karta turini tanladingiz");

    }
}
