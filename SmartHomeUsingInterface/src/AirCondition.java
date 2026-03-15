public class AirCondition implements SmartHome{
    private boolean isOn = false;
    private double energyUsed = 0;
    private double wattsPerUse = 7;
    private int secondsinUse = 0;


    @Override
    public void turnOn() {
        isOn = true;
        energyUsed += wattsPerUse;
        System.out.println("The aircondition is on");

    }

    @Override
    public void turnOff() {
        isOn = false;
        System.out.println("The aircondition is off");

    }
    public void setTimer(int seconds){
        this.secondsinUse = seconds;
        energyUsed += (seconds * 0.1); // απλό παράδειγμα
        System.out.println("Timer set to " + seconds + " seconds");
    }

    public double getEnergyUsed() {
    return energyUsed;
    }

    @Override
    public void getStatus() {

        String open = "on";
        String closed = "off";


        if(isOn == true) {
            System.out.println("the AirCondition is " + open);
        }else {
            System.out.println("the Aircondition is: " + closed);
        }
        System.out.println("The energy used was: " + energyUsed);

        System.out.println("Timer: " + secondsinUse + " seconds");


    }

}
