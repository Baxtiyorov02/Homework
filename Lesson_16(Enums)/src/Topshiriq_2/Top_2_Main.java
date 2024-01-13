package Topshiriq_2;

import java.util.Arrays;
import java.util.Scanner;

public class Top_2_Main {
    public static void main(String[] args) {
        Animals[] animals=Animals.values();
        System.out.println(Arrays.toString(animals));
        System.out.print("qaysi hayvonni ovozini o`xshatib beray? ");
        Scanner scanner=new Scanner(System.in);
        String animal= scanner.nextLine();
        String voice="";
        for (int i = 0; i < animals.length ; i++) {
            if(animals[i].toString().equals(animal.toUpperCase())){
                voice=animals[i].getVoice();
            }
        }
        System.out.println(voice);





    }


}
