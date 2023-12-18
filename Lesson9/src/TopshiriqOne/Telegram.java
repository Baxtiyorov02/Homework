package TopshiriqOne;

import java.util.Arrays;
import java.util.Scanner;

public class Telegram {
    User user;
    User[] users=new User[]{};
    public Telegram() {

    }

    public  boolean creatAccaunt(User user){
        if (!isExist(user.getPhoneNumber())){
            checkSMSCode(user);
        }
        return isExist(user.getPhoneNumber());
    }
    private  boolean isExist(String  phoneNumber){
        boolean isExcite=false;
        for (User value : users) {
            if (phoneNumber == value.getPhoneNumber())
                isExcite = true;
        }
        return isExcite;
    }


    private  void checkSMSCode(User user){
        Scanner scanner=new Scanner(System.in);
        System.out.println("kodni kiriting: ");
        String phoneNum= scanner.nextLine();
        if (phoneNum.equals(user.getPhoneNumber())){
            User[] newUsers= new User[getUserCount()+1];
            for (int i = 0; i < getUserCount() ; i++) {
                newUsers[i]=users[i];
                }
            newUsers[getUserCount()]=user;
            users=newUsers;
            System.out.println(Arrays.toString(users));
        }
        else System.out.println("ERROR!");
    }

    public  int getUserCount(){
        return users.length;
    }
    public  boolean deleteAccaunt(String phoneNumber){
        if (isExist(phoneNumber)){
            User[] newUsers=new User[getUserCount()-1];
            int index=0;
            for (int i = 0; i <getUserCount() ; i++) {
                if (phoneNumber==users[i].getPhoneNumber())
                    continue;
                else {
                    newUsers[index++]=users[i];
                }
            }
            users=newUsers;
            System.out.println(Arrays.toString(users));
        }
        return isExist(phoneNumber);
    }



}
