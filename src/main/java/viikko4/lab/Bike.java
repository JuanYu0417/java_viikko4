package viikko4.lab;

public class Bike extends Vehicle{
    private double speed;
    public Bike(String name,double speed){
        super(name);
        if(speed<=0){
            throw new IllegalArgumentException("Speed must be more than 0.");
        }
        this.speed=speed;
    }

    @Override
    public double travelTime(double distance){
        if(distance<=0){
            throw new IllegalArgumentException("Distance must be more than 0.");
        }
        return distance/speed;
    }
}
