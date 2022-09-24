package University;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        Univer univer = new Univer("BRU", "Mira avenue 43", "+111222333");
        Faculty fac = new Faculty();
        for (int i = 0; i < 1; i++){
            Faculty faculty = new Faculty();
        }
        for (int i = 0; i < 1; i++){
            Student student = new Student();
            System.out.println("Input faculty name for students: ");
            univer.addStudent(student, sc.next());
        }
        for (int i = 0; i < 1; i++){
            Teacher teacher = new Teacher();
            System.out.println("Input faculty name for teachers: ");
            fac.addTeacher(teacher, sc.next());
        }

        System.out.println("Get student: Input name of student and his teacher's name: ");
        univer.getStudentByNameAndTeacherName(sc.next(), sc.next());
        System.out.println();
    }
}
