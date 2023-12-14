package topshiriq1Package;

public class File {
    private String fileName;
    private  int size;

    public File(String fileName, int size) {
        this.fileName = fileName;
        this.size = size;
    }

    public String getFileName() {
        return fileName;
    }

    public int getSize() {
        return size;
    }

}
