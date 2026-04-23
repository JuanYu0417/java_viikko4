package viikko4.lab;
import java.util.LinkedList;

public class StudentRegister {
    private LinkedList<Student> students;

    public StudentRegister(){
        students=new LinkedList<>();
    }
    public void addStudent(String name,Integer points){
        Student student=new Student(name,points);
        students.add(student);
    }

}
