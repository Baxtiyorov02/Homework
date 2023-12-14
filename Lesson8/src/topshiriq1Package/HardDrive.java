package topshiriq1Package;

public class HardDrive {
   private File file;
    private  int hardDriveSize;
    private  int filesSize;

    public HardDrive(int hardDriveSize) {
        this.hardDriveSize = hardDriveSize;
    }
    public HardDrive(File file, int hardDriveSize) {
        this.file = file;
        this.hardDriveSize = hardDriveSize;
    }



    private void showInfo(String s){
        System.out.println(s+" nomli fayl  qo`shildi!");
    }
    public  void  write(File file){
        filesSize+=file.getSize();
        System.out.println();
        showInfo(file.getFileName());
    }
    public  void remove(int  size){
        filesSize-=size;
    }
    public  boolean isEmpty(){
        return filesSize==0;
    }
    public  boolean isFull(){
        return filesSize==hardDriveSize;
    }
    public  void getUsedSpace(){
        System.out.println("xotiraning " +(filesSize) +" GB joyi band");
    }
    public  void getFreeSpace(){
        System.out.println("xotiraning " +(hardDriveSize-filesSize) +" GB joyi bosh");
    }
}
