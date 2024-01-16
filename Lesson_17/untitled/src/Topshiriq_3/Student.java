package Topshiriq_3;

public class Student {
    private  String firstName;
    private  String lastName;
    private  int age;
    private  int course;
    public  void showInfo(){
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", course=" + course +
                '}';
    }


}
