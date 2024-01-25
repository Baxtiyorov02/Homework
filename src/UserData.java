import java.util.Objects;

public class UserData {
    private final String userName;
    private final String lastName;

    public UserData(String userName, String lastName) {
        this.userName = userName;
        this.lastName = lastName;
    }

    public String getUserName() {
        return userName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UserData userData)) return false;
        return Objects.equals(getUserName(), userData.getUserName()) && Objects.equals(getLastName(), userData.getLastName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getUserName(), getLastName());
    }

    @Override
    public String toString() {
        return "UserData{" +
                "userName='" + userName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
