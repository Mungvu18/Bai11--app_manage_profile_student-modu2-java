import java.util.ArrayList;

public class ManageProfile {
    public static final String BIRTH_YEAR_IS_1985 = "1985";
    public static final String NOT_EXITS = "Not exits";
    public static final String CLASS_IS_10A_2 = "10A2";
    public static final String THAI_NGUYEN = "Thai Nguyen";
    ArrayList<ProfileOfStudent> profileOfStudentsLists = new ArrayList<>();

    public void addNew(ProfileOfStudent profileOfStudent) {
        profileOfStudentsLists.add(profileOfStudent);
    }

    public void displayAll() {
        for (ProfileOfStudent profileOfStudent : profileOfStudentsLists) {
            System.out.println(profileOfStudent);
        }
    }

    public void showStudentHaveBirthYearIs1985AndHomeTownIsThaiNguyen() {
        boolean testBirthYearAndHomeTown = false;
        for (ProfileOfStudent profile : profileOfStudentsLists) {
            boolean testBirthYearIs1985 = testBirthYear(profile);
            boolean testHomeTownIsThaiNguyen = testHomTown(profile);
            testBirthYearAndHomeTown = testBirthYearIs1985 && testHomeTownIsThaiNguyen;
            if (testBirthYearAndHomeTown) {
                System.out.println(profile);
                break;
            }
        }
        if (!testBirthYearAndHomeTown) {
            System.out.println(NOT_EXITS);
        }
    }

    private boolean testHomTown(ProfileOfStudent profile) {
        Student student = profile.getStudent();
        String homeTown = student.getHomeTown();
        boolean tesHomeTown = homeTown.equalsIgnoreCase(THAI_NGUYEN);
        return tesHomeTown;
    }

    private boolean testBirthYear(ProfileOfStudent profile) {
        boolean testBirthYear;
        Student student = profile.getStudent();
        String birthDay = student.getBirthDay();
        String birthYear = birthDay.substring(6, 10);
        testBirthYear = birthYear.equalsIgnoreCase(BIRTH_YEAR_IS_1985);
        return testBirthYear;
    }

    public void showStudentHaveClassIs10A2() {
        boolean testClassIs10A2 = false;
        for (ProfileOfStudent profile : profileOfStudentsLists) {
            String classOfStudent = profile.getClassOfStudent();
            testClassIs10A2 = classOfStudent.equalsIgnoreCase(CLASS_IS_10A_2);
            if (testClassIs10A2) {
                System.out.println(profile);
                break;
            }
        }
        if (!testClassIs10A2) System.out.println(NOT_EXITS);
    }
}
