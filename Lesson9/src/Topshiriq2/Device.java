package Topshiriq2;

import java.util.ArrayList;
import java.util.Arrays;

public class Device {

    private int DeviceMemory;
    private App[] apps=new App[]{};
    private ArrayList<String> appInfo=new ArrayList<>();


    public Device(int deviceMemory) {
        DeviceMemory = deviceMemory;
    }

    private  boolean isExist(String appName){
        boolean isExist=false;
        for (int i = 0; i <apps.length ; i++) {
            if (appName==apps[i].getAppName()) isExist=true;
        }
        return isExist;
    }
    public  boolean install(App app){
        if (!isExist(app.getAppName())){
            App[] newApps= new App[apps.length+1];
            for (int i = 0; i <apps.length ; i++) {
                newApps[i]=apps[i];
                }
            newApps[apps.length]=app;
            apps=newApps;
            return true;
        }
        else return false;
    }
    public  void showInfo(){
        System.out.println(Arrays.toString(apps));
    }
    public boolean unInstall(String appName){
        if (isExist(appName)){
            int index=0;
            App[] newApps= new App[apps.length-1];
            for (int i = 0; i <apps.length ; i++) {
                if (isExist(apps[i].getAppName()))
                    continue;
                newApps[index++]=apps[i];
            }
            apps=newApps;
            return true;
        }
        else return false;
    }
    public  void run(String appName){
        for (int i = 0; i <apps.length ; i++) {
            if (appName==apps[i].getAppName()){
                System.out.println(apps[i].getAppName()+" Ishga tushdi");
            appInfo.add(apps[i].getAppName());
            }
        }
    }
    public  void info(){
        for (int i = 0; i <appInfo.size() ; i++) {
            System.out.println(appInfo.get(i)+ " hozirgi vaqtda ishlamoqda! ");
        }
        System.out.println(appInfo.size());
    }

    public static void main(String[] args) {
        App app=new App("Click",38);
        App app1=new App("Uzum",26);
        Device device=new Device(3200);
        System.out.println(device.install(app));
        System.out.println(device.install(app1));
        device.showInfo();
        device.run("Click");
        device.info();
    }


}
