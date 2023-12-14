package TopshiriqOne;

public class User {
    private  String lastName;
    private  String firtName;
    private  int age;
    private  String phoneNumber;

    public User(String lastName, String firtName, int age, String phoneNumber) {
        this.lastName = lastName;
        this.firtName = firtName;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirtName() {
        return firtName;
    }

    public int getAge() {
        return age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
