package viikko4.lab;

public class TravelUtils {
    private TravelUtils() {
    }
    public static double sum(Vehicle[] vehicles,Double distance){
        if(vehicles==null||distance==null||distance<=0){
            throw new IllegalArgumentException("Invalid input.");
        }
        double sum=0.0;
        for(Vehicle v:vehicles){
            if(v==null){
                continue;
            }
            sum+=v.travelTime(distance);
        }
        return sum;
    }
    
}
