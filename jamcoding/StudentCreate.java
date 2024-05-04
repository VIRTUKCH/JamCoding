package jamcoding;

public class StudentCreate {
    private static StudentManagement sm;

    public static void main(String[] args) {
        Student kbj = new Student("정광고등학교", "강병제", 17, "대단히 까붊;;", "10801");
        Student jt = new Student("금호고등학교", "김채호", 24, "대단히 멋있음", "20194397");
        Student sjg = new Student("하버드유치원", "신짱구", 5, "못 말림", "개7");

        sm = new StudentManagement();
        sm.addStudent(kbj);
        sm.addStudent(jt);
        sm.addStudent(sjg);

        sm.viewAllStudents();
    }
}