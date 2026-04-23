package viikko4.lab;

public class PowerBank extends Device implements Rechargeable{
    private int batteryCharge;
    public PowerBank(String name,int batteryCharge){
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
    @Override
    public void recharge(int minutes){
        if (minutes < 0) {
            throw new IllegalArgumentException("Minutes cannot be negative.");
        }
        int energyConsumption=minutes;
        batteryCharge+=energyConsumption;
        if(batteryCharge>100){
            batteryCharge=100;
        }
    }

    public void discharge(int minutes){
        if (minutes < 0) {
            throw new IllegalArgumentException("Minutes cannot be negative.");
        }
        int energyConsumption=minutes/3;
        batteryCharge-=energyConsumption;
        if(batteryCharge<0){
            batteryCharge=0;
        }
    }
}

