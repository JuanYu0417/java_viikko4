package viikko4.lab;

public class DeviceUtils {
    public static int averageBatteryLevel(Device[] devices){
        if(devices==null||devices.length==0){
            throw new IllegalArgumentException("Devices cannot be null or empty.");
        }
        int count=0;
        int sum=0;
        for(Device d:devices){
            if(d==null){
                continue;
            }
            sum+=d.getBatteryCharge();
            count++;
        }
        if (count == 0) {
            throw new IllegalArgumentException("All devices were null.");
        }
        return sum/count;
    }
    
}
