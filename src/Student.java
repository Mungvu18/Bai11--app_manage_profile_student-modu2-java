public class Student {
    private String name;
    private String birthDay;
    private String homeTown;

    public Student(String name, String birthDay, String homeTown) {
        this.name = name;
        this.birthDay = birthDay;
        this.homeTown = homeTown;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public String getHomeTown() {
        return homeTown;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", birthDay='" + birthDay + '\'' +
                ", homeTown='" + homeTown + '\'' +
                '}';
    }
}
