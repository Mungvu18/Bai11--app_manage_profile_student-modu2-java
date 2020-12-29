public class ProfileOfStudent {
    private Student student;
    private String classOfStudent;
    private int schoolYear;
    private String semester;

    public ProfileOfStudent(Student student, String classOfStudent, int schoolYear, String semester) {
        this.student = student;
        this.classOfStudent = classOfStudent;
        this.schoolYear = schoolYear;
        this.semester = semester;
    }

    public Student getStudent() {
        return student;
    }

    public String getClassOfStudent() {
        return classOfStudent;
    }

    @Override
    public String toString() {
        return "ProfileOfStudent{" +
                 student +
                ", classOfStudent='" + classOfStudent + '\'' +
                ", schoolYear=" + schoolYear +
                ", semester='" + semester + '\'' + "\n" +
                '}';
    }
}
