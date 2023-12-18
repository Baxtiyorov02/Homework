import TopshiriqOne.Telegram;
import TopshiriqOne.User;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        User user=new User("Islom","Baxtiyorov",23,"1939");
        User user1=new User("Asadbek","Axmedov",21,"2001");
        Telegram telegram=new Telegram();
        System.out.println(telegram.creatAccaunt(user));
        System.out.println(telegram.creatAccaunt(user1));
        System.out.println(telegram.deleteAccaunt("1939"));

    }
}
