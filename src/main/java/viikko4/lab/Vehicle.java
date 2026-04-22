package viikko4.lab;

public abstract class Vehicle {
    private String name;
    public Vehicle(String name){
        if(name==null||name.trim().isEmpty()){
            throw new IllegalArgumentException("Name cannot be empty.");
        }
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public abstract double travelTime(double distance);
}
