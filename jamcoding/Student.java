package jamcoding;

public class Student {
    private String schoolName;  // 학교 이름
    private String studentName; // 학생 이름
    private int studentAge;     // 학생 나이
    private String comment;     // 학생에 대한 평가
    private String studentID;   // 학번

    public Student(String schoolName, String studentName, int studentAge, String comment, String studentID) {
        this.schoolName = schoolName;
        this.studentName = studentName;
        this.studentAge = studentAge;
        this.comment = comment;
        this.studentID = studentID;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public String getStudentName() {
        return studentName;
    }

    public int getStudentAge() {
        return studentAge;
    }

    public String getComment() {
        return comment;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    @Override
    public String toString() {
        return "Student{" +
                "schoolName='" + schoolName + '\'' +
                ", studentName='" + studentName + '\'' +
                ", studentAge=" + studentAge +
                ", comment='" + comment + '\'' +
                ", studentID='" + studentID + '\'' +
                '}';
    }
}