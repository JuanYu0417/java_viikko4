package viikko4.lab;

public class Phone extends Device implements Rechargeable {
    private int batteryCharge;
    public Phone(String name,int batteryCharge){
        super(name);
        if(batteryCharge>100||batteryCharge<0){
            throw new IllegalArgumentException("Battery charge must be between 0 and 100.");
        }
        this.batteryCharge=batteryCharge;
    }

    @Override
    public int getBatteryCharge(){
        return batteryCharge;
    }

    public void use(int minutes){
        if (minutes < 0) {
            throw new IllegalArgumentException("Minutes cannot be negative.");
        }
        int energyConsumption=minutes/5;
        batteryCharge-=energyConsumption;
        if (batteryCharge < 0) {
            batteryCharge = 0;
        }
    }

    @Override
    public void recharge(int minutes){
        if (minutes < 0) {
            throw new IllegalArgumentException("Minutes cannot be negative.");
        }
        int energyConsumption=minutes/2;
        batteryCharge+=energyConsumption;
        if(batteryCharge>100){
            batteryCharge=100;
        }
    }
}
