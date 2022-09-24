package University;

import java.util.Random;
import java.util.Scanner;

public class Student {
    Scanner sc = new Scanner(System.in);
    private String studentName;
    private long studentId;
    private Faculty faculty;

    public Student(){
        System.out.println("Input students name: ");
        this.studentName = sc.next();
        this.studentId = Math.abs(new Random().nextLong());
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public long getStudentId() {
        return studentId;
    }

    public void setStudentId(long studentId) {
        this.studentId = studentId;
    }

    public Faculty getFaculty() {
        return faculty;
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", studentId=" + studentId +
                ", faculty=" + faculty +
                '}';
    }
}
