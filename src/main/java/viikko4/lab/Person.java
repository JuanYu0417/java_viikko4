package viikko4.lab;
public class Person {
    private String name;
    private int age;
    public Person(String name, int age){
        if(name==null||name.trim().isEmpty()){
           throw new IllegalArgumentException("Väärä arvo!"); 
        }else if(age<0){
           throw new IllegalArgumentException("Väärä arvo!"); 
        }
        this.name=name;
        this.age=age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    
}
    
