package viikko4.lab;

public class Student {
    private String name;
    private Integer points;
    public Student(String name,Integer points){
        if(name==null||name.trim().isEmpty()){
            throw new IllegalArgumentException("Name cannot be empty.");
        }
        if(points==null||points<0){
            throw new IllegalArgumentException("Points cannot be empty or negative.");
        }
        this.name=name;
        this.points=points;
    }
    public String getName(){
        return name;
    }
    public Integer getPoints(){
        return points;
    } 
}
