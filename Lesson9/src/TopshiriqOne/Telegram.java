package TopshiriqOne;

import java.util.Random;

public class Telegram {
    User user;
    User[] users;
    Random random=new Random(1000);
    int code;
   String phoneNumber;

    public Telegram(User user) {
        this.user = user;
    }
    public  int creatAccaunt(User user) {
        boolean isHave = false;
        for (int i = 0; i < users.length; i++) {
            if (users[i].getPhoneNumber() == user.getPhoneNumber()) isHave = true;
        }

        if (!isHave) {
            code=random.nextInt(9999);
            phoneNumber=user.getPhoneNumber();

            return code;
        }
        return 0;
    }
    private  void checkSMSCode(int code,String phoneNmber){
        if (this.code==code && this.phoneNumber==phoneNmber){
            User[] usersI=new User[users.length+1];
            usersI[users.length+1]=user;
        }
    }
}
