package viikko4.lab;

public class Car extends Vehicle{
    private double speed;
    public Car(String name,double speed){
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