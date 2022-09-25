package University;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Univer{
    private String name;
    private String address;
    private String phone;

    private ArrayList<Student> studentArrayList = new ArrayList<>();
    private ArrayList<Faculty> facultyArrayList = new ArrayList<>();

    public Univer(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    Faculty fac = new Faculty();

    public Univer() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void addStudent(Student student, String facultyName1){
        for (Faculty faculty : facultyArrayList){
            if (faculty.getFacultyName().equals(facultyName1)){
                student.setFaculty(faculty);
            }
        }
        studentArrayList.add(student);
    }

    public void deleteStudent(String name){
        for (int i = 0; i < studentArrayList.size(); i++){
            if(studentArrayList.get(i).getStudentName().equals(name)){
                studentArrayList.remove(studentArrayList.get(i));
                break;
            }
        }
    }

    public Student getStudent(long id){
        for (int i = 0; i < studentArrayList.size(); i++){
            if(studentArrayList.get(i).getStudentId() == id){
                return studentArrayList.get(i);
            }
        }
        return null;

    }

    public void addDepartment(Faculty faculty){
        facultyArrayList.add(faculty);
    }

    public Faculty getFaculty(long facultyId){
        for (int i = 0; i < facultyArrayList.size(); i++){
            if(facultyArrayList.get(i).getFacultyId() == facultyId){
                return facultyArrayList.get(i);
            }
        }
        return null;
    }

    public ArrayList<Faculty> getAllDepartments(){
        return facultyArrayList;
    }

    public Student getStudentByNameAndTeacherName(String studentName, String teacherName){
        Faculty faculty = null;
        ArrayList<Student> studlist = new ArrayList<>();

        for (Student student : studentArrayList){
            if(student.getStudentName().equals(studentName)){
                studlist.add(student);
            }
        }

        for(int i = 0; i <  facultyArrayList.size(); i++){
            faculty = facultyArrayList.get(i);
            ArrayList<Teacher> teacherList = faculty.getTeachersArrayList();
            for (Teacher teacher1 : teacherList){
                if (teacher1.getTeacherName().equals(teacherName)){
                    faculty = facultyArrayList.get(i);
                    break;
                }
            }
        }

        for (int i = 0; i < studlist.size(); i++){
            if(studlist.get(i).getFaculty().equals(faculty) && studlist.get(i).getStudentName().equals(studentName)){
                return studlist.get(i);
            }
        }
        return null;


    }

    public void getStudentsPlusTeachers(){
        Map<Student, ArrayList<Teacher>> StudentsPlusTeachers = new HashMap<>();
        //ArrayList<Teacher> teachlist = new ArrayList<>();
        //teachlist = fac.getAllTeachers();
        StringBuilder sb = new StringBuilder();
        for (Student student : studentArrayList){
            StudentsPlusTeachers.put(student, fac.getTeachersArrayList());
        }
        for (Student student : StudentsPlusTeachers.keySet()){
            for (int i = 0; i < StudentsPlusTeachers.get(student).size(); i++){
                sb.append(StudentsPlusTeachers.get(student).get(i).getTeacherName());
            }
            System.out.println("Names of students: " + student.getStudentName() + "\nNames of teachers: "
                    + fac.getTeachers(fac.getAllTeachers()));
        }
        /*for (int i = 0; i < teachlist.size(); i++){
            System.out.println(teachlist.get(i));
        }*/
    }
}
