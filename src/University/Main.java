package University;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Univer univer = new Univer("BRU", "Mira avenue 43", "+111222333");
        Faculty fac = new Faculty();
        for (int i = 0; i < 1; i++){
            Faculty faculty = new Faculty();
        }

        try {
            for (int i = 0; i < 1; i++){
                Student student = new Student();
                System.out.println("Input faculty name for students: ");
                String n = sc.next();
                univer.addStudent(student, n);
                if (n.length() < 3){
                    throw new ShortFacultyNameForStudents();
                }
            }
        }
        catch (ShortFacultyNameForStudents esm){
            System.out.println(esm.message);
        }

        try {
            for (int i = 0; i < 1; i++){
                Teacher teacher = new Teacher();
                System.out.println("Input faculty name for teachers: ");
                String n = sc.next();
                if (n.length() > 10){
                    throw new LongFacultyNameForTeachers();
                }
                fac.addTeacher(teacher, n);

            }
        }
        catch (LongFacultyNameForTeachers etm){
            System.out.println(etm.message);
        }

        try{
            if(univer.getAddress() != null){
                System.out.println("Here is the univer's address: " + univer.getAddress());
            }
            else throw new AddressNotFound();
        }
        catch (AddressNotFound anf){
            System.out.println(anf.message);
        }

        try{
            if(univer.getPhone() != null){
                System.out.println("Here is the univer's phone number: " + univer.getPhone());
            }
            else throw new PhoneNotFound();
        }
        catch (PhoneNotFound pnf){
            System.out.println(pnf.message);
        }
        finally {
            System.out.println("Check that phone number of univer is correct");
        }


        System.out.println("Do you want to find a student by name? Input 1");
        int n = sc.nextInt();
        try {
            if (n == 1) {
                System.out.println("Get student: Input name of student and his teacher's name: ");
                univer.getStudentByNameAndTeacherName(sc.next(), sc.next());
                System.out.println();
            }
            else throw new WrongOptionException();
        }
        catch (WrongOptionException woe){
            System.out.println(woe.message);
        }

    }
}
