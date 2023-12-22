package Topshiriq_3;

public class Hp extends  Computer{
    public Hp(String processesModel, int diskSize) {
        super(processesModel, diskSize);
    }

    @Override
    public void showInfo() {
        System.out.println(" bu Computer nomi Hp, processesModel: " +getProcessesModel() +", diskSize: "+getDiskSize());

    }
}
