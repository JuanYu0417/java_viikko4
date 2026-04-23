package viikko4.lab;

public abstract class Device {
    private String name;
    public Device(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public abstract int getBatteryCharge();
}
