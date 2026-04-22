package viikko4.lab;
public abstract class Animal {
    private String name;
    public Animal(String name){
        if(name==null||name.trim().isEmpty()){
            throw new IllegalArgumentException("Name cannot be empty.");
        }
        this.name=name;
    }
    public abstract String sound();
    public String getName(){
        return name;
    }
}
