public class WaterHeater implements SmartHome{

    private boolean isOn = false;
    private double energyUsed = 0;
    private double wattsPerUse = 10;
    private int timesPerSecond = 0;

    @Override
    public void turnOn() {
        isOn = true;
        energyUsed += wattsPerUse;
        System.out.println("The Water Heater is On");

    }

    @Override
    public void turnOff() {
        isOn = false;
        System.out.println("the water heater is off");

    }
    public void setTimer(int seconds){
        this.timesPerSecond = seconds;
        energyUsed += (seconds * 0.1); // απλό παράδειγμα
        System.out.println("Timer set to " + seconds + " seconds");
    }


    public double getEnergyUsed(){
       return energyUsed;
    }



    @Override
    public void getStatus() {

        String open = "on";
        String closed = "off";


        if(isOn == true) {
            System.out.println("the HeatWater is " + open);
        }else {
            System.out.println("the HeatWater is: " + closed);
        }
        System.out.println("The energy used was: " + energyUsed);

        System.out.println("Timer: " + timesPerSecond + " seconds");


    }
}
