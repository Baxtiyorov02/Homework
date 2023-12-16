package Topshiriq3;

public class Car {
    private String CarName;
    private String CarNumber;

    public Car(String carName, String carNumber) {
        CarName = carName;
        CarNumber = carNumber;
    }

    public String getCarName() {
        return CarName;
    }

    public String getCarNumber() {
        return CarNumber;
    }

    @Override
    public String toString() {
        return "Car{" +
                "CarName='" + CarName + '\'' +
                ", CarNumber='" + CarNumber + '\'' +
                '}';
    }
}
