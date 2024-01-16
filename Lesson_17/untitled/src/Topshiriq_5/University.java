package Topshiriq_5;

public class University {
    private String name;
    private String location;

    public University(String name, String location) {
        this.name = name;
        this.location = location;
    }
    public  class Student{
        private String firstName;
        private   String lastName;
        private  int course;

        public Student(String firstName, String lastName, int course) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.course = course;
        }

        public  void  showInfo(){
            System.out.println("University: "+ getName());
            System.out.println(toString());
        }

        @Override
        public String toString() {
            return "Student{" +
                    "firstName='" + firstName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    ", course=" + course +
                    '}';
        }
    }

    public  String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }
}
