package Topshiriq2;

public class App {
    private String appName;
    private int appSize;

    public App(String appName, int appSize) {
        this.appName = appName;
        this.appSize = appSize;
    }

    public String getAppName() {
        return appName;
    }

    public int getAppSize() {
        return appSize;
    }

    @Override
    public String toString() {
        return "App{" +
                "appName='" + appName + '\'' +
                ", appSize=" + appSize +
                '}';
    }
}
