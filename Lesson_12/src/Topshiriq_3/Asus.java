package Topshiriq_3;

public class Asus extends Computer{

    public Asus(String processesModel, int diskSize) {
        super(processesModel, diskSize);
    }


    @Override
    public void showInfo() {
        System.out.println(" bu Computer nomi Asus, processesModel: " +getProcessesModel() +", diskSize: "+getDiskSize());
    }
}
