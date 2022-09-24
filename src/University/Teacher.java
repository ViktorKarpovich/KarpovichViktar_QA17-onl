package University;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class Teacher {
    Scanner sc = new Scanner(System.in);
    private String teacherName;
    private long teacherId;
    private Faculty faculty;

    public Faculty getFaculty() {
        return faculty;
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }

    public long getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(long teacherId) {
        this.teacherId = teacherId;
    }

    public Teacher(){
        System.out.println("Input name of prepod: ");
        this.teacherName = sc.next();
        this.teacherId = Math.abs(new Random().nextLong());
    }

    public String getTeacherName(){
        return teacherName;
    }

    public void setTeacherName(String teacherName){
        this.teacherName = teacherName;
    }
}
