package viikko4.lab;

public class Thermometer implements Measurable{
    private Double temp;
    public Thermometer(Double temp){
        if(temp==null){
            throw new IllegalArgumentException("Temperature cannot be null,");
        }
        this.temp=temp;
    }

    @Override
    public double getMeasure(){
        return temp;
    }
} 
