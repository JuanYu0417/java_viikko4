package viikko4.lab;
import java.util.LinkedList;
import java.util.List;

public class StudentRegister {
    private LinkedList<Student> students;

    public StudentRegister(){
        students=new LinkedList<>();
    }
    public void addStudent(String name,Integer points){
        Student student=new Student(name,points);
        students.add(student);
    }
    public List<Student> searchStudent(String name){
        if(name==null||name.trim().isEmpty()){
            return new LinkedList<>();
        }
        List<Student> result=new LinkedList<>();
        for(Student student:students){
            if(student.getName().toLowerCase().contains(name.toLowerCase())){
                result.add(student);
            }
        }
        return result;
    }
}
