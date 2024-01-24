package Topshiriq_2;

import java.util.LinkedList;

public class Top2_Main {
    public static void main(String[] args) {
        LinkedList<String> footballPlayers;
        footballPlayers = new LinkedList<>();
        footballPlayers.add("Ulug`bek");
        footballPlayers.add("Bobur");
        footballPlayers.add("Erkin");
        footballPlayers.add("Ismoil");
        footballPlayers.add("Eldor");

        LinkedList<String> tennisPlayers= new LinkedList<>();
        tennisPlayers.add("Bobur");
        tennisPlayers.add("Jalol");
        tennisPlayers.add("Eldor");
        tennisPlayers.add("Dilshod");
        tennisPlayers.add("Sardor");
        tennisPlayers.add("Kamol");
        LinkedList<String> allPlayers=new LinkedList<>();
       footballPlayers.removeAll(tennisPlayers);
        System.out.println("Faqat football ga boradigan o`quvchilar: "+footballPlayers);
        footballPlayers.addAll(tennisPlayers);
        System.out.println("Jami o`quvchilar soni: "+(footballPlayers.size()));




    }
}
