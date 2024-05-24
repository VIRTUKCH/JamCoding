package java_crud;

import java.util.ArrayList;
import java.util.List;

public class StudentManagement {
    private List<Student> studentList;
    StudentManagement() {
        studentList = new ArrayList<>();
    }

    public void addStudent(Student student) {
        studentList.add(student);
    }

    public void viewAllStudents() {
        for (Student student : studentList) {
            System.out.println(student);
        }
    }
}
