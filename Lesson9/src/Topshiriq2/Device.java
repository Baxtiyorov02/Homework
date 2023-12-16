package Topshiriq2;

import java.util.Arrays;

public class Device {

    private int DeviceMemory;
    App[] apps=new App[]{};

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

    public static void main(String[] args) {
        App app=new App("Click",38);
        App app1=new App("Uzum",26);
        Device device=new Device(3200);
        System.out.println(device.install(app));
        System.out.println(device.install(app1));
        device.showInfo();

    }


}
