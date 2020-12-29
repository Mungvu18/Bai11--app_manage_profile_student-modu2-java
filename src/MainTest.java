import java.util.Scanner;

public class MainTest {
    public static final String SPACE = "--------------------------------------------------------------";
    public static final String ENTER_SEMESTER = "Enter semester";
    public static final String ENTER_SCHOOL_YEAR = "Enter schoolYear";
    public static final String ENTER_CLASS_OF_STUDENT = "Enter classOfStudent";
    public static final String ENTER_HOME_TOWN = "Enter homeTown";
    public static final String ENTER_BIRTHDAY = "Enter birthday have format is dd/MM/yyyy";
    public static final String ENTER_NAME = "Enter Name";
    public static final String ENTER_AMOUNT_OF_PROFILE_YOU_WANT_TO_ADD = "Enter amount of profile you want to add";
    public static final String ADD_PROFILE_STUDENT = "1. Add profileStudent";
    public static final String DISPLAY_ALL_PROFILE = "2. Display all profile";
    public static final String SHOW_PROFILE_HAVE_BIRTH_YEAR_IS_1985_AND_HOME_TOWN_IS_THAI_NGUYEN
            = "3. Show profile have birthYear is 1985 and homeTown is Thai Nguyen";
    public static final String SHOW_PROFILE_HAVA_CLASS_IS_10_A_2 = "4. Show profile hava class is 10A2";
    public static final String EXIT = "0. Exit";
    public static final String ENTER_CHOICE = "Enter choice";
    public static final int ONE = 1;
    public static final int TWO = 2;
    public static final int THREE = 3;
    public static final int FOUR = 4;
    public static final int ZERO = 0;
    public static final int TEN = 10;
    static ManageProfile manageProfile = new ManageProfile();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            menuShow();
            choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case ONE:
                    System.out.println(ENTER_AMOUNT_OF_PROFILE_YOU_WANT_TO_ADD);
                    int amount = Integer.parseInt(sc.nextLine());
                    for (int i = 0; i < amount; i++) {
                        addNew();
                    }
                    break;
                case TWO:
                    manageProfile.displayAll();
                    break;
                case THREE:
                    manageProfile.showStudentHaveBirthYearIs1985AndHomeTownIsThaiNguyen();
                    break;
                case FOUR:
                    manageProfile.showStudentHaveClassIs10A2();
                    break;
                case ZERO:
                    System.exit(ZERO);
                    break;
            }
        }while (choice!=ZERO);
    }

    private static void menuShow() {
        System.out.println(ADD_PROFILE_STUDENT);
        System.out.println(DISPLAY_ALL_PROFILE);
        System.out.println(SHOW_PROFILE_HAVE_BIRTH_YEAR_IS_1985_AND_HOME_TOWN_IS_THAI_NGUYEN);
        System.out.println(SHOW_PROFILE_HAVA_CLASS_IS_10_A_2);
        System.out.println(EXIT);
        System.out.println(ENTER_CHOICE);
    }

    public static void addNew(){
        Scanner sc1 = new Scanner(System.in);
        System.out.println(ENTER_NAME);
        String name = sc1.nextLine();
        String birthDay ="";
        do {
            System.out.println(ENTER_BIRTHDAY);
            birthDay = sc.nextLine();
        } while (birthDay.length()!= TEN);
        System.out.println(ENTER_HOME_TOWN);
        String homeTown = sc1.nextLine();
        System.out.println(ENTER_CLASS_OF_STUDENT);
        String classOfStudent = sc.nextLine();
        System.out.println(ENTER_SCHOOL_YEAR);
        int schoolYear =Integer.parseInt(sc1.nextLine());
        System.out.println(ENTER_SEMESTER);
        String semester = sc.nextLine();
        Student student = new Student(name,birthDay,homeTown);
        ProfileOfStudent profileOfStudent = new ProfileOfStudent(student,classOfStudent,schoolYear,semester);
        manageProfile.addNew(profileOfStudent);
        System.out.println(SPACE);
    }
}
