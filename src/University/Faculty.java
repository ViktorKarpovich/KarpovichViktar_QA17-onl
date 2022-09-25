package University;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Faculty {

    Scanner sc = new Scanner(System.in);
    private String facultyName;
    private long facultyId;


    private ArrayList<Teacher> teachersArrayList = new ArrayList<>();
    private ArrayList<Faculty> facultyArrayList = new ArrayList<>();

    public Faculty(){
        System.out.println("Input name of faculty: ");
        this.facultyName = sc.next();
        this.facultyId = Math.abs(new Random().nextLong());
    }




    public ArrayList<Teacher> getTeachersArrayList() {
        return teachersArrayList;
    }

    public void setTeachersArrayList(ArrayList<Teacher> teachersArrayList) {
        this.teachersArrayList = teachersArrayList;
    }

    public long getFacultyId() {
        return facultyId;
    }

    public void setFacultyId(long facultyId) {
        this.facultyId = facultyId;
    }

    public String getFacultyName(){
        return facultyName;
    }

    public void setFacultyName(String facultyName){
        this.facultyName = facultyName;
    }

    /*public void addTeacher(Teacher teacherName, String next){
        teachersArrayList.add(teacherName);
    }*/

    public void addTeacher(Teacher teacher, String facultyName1){
        for (Faculty faculty : facultyArrayList){
            if (faculty.getFacultyName().equals(facultyName1)){
                teacher.setFaculty(faculty);
            }
        }
        teachersArrayList.add(teacher);
    }

    public Teacher getTeacher(long id){
        for (int i = 0; i < teachersArrayList.size(); i++){
            if(teachersArrayList.get(i).getTeacherId() == id){
                return teachersArrayList.get(i);
            }
        }
        return null;
    }

    public ArrayList<Teacher> getTeachers(ArrayList<Teacher> teachersArrayList){
        for (int i = 0; i < teachersArrayList.size(); i++){
            System.out.println(teachersArrayList.get(i));
            }
        return teachersArrayList;
    }



    public void removeTeacher(long id){
        for (int i = 0; i < teachersArrayList.size(); i++){
            if(teachersArrayList.get(i).getTeacherId() == id){
                teachersArrayList.remove(teachersArrayList.get(i));
                break;
            }
        }
    }

    public ArrayList<Teacher> getAllTeachers(){
        return teachersArrayList;
    }

    @Override
    public String toString() {
        return "Faculty{" +
                "facultyName='" + facultyName + '\'' +
                '}';
    }
}
