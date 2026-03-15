public class Lights implements SmartHome{

    private boolean isOn = false;
    private double energyUsed = 0;
    private double wattPerUse = 5;

    private int timerSeconds = 0;


    @Override
    public void turnOn() {
        isOn = true;
        energyUsed += wattPerUse;
        System.out.println("The lights are on");
    }

    @Override
    public void turnOff() {
        isOn = false;
        System.out.println("The lights are off");

    }
    public void setTimer(int seconds){
        this.timerSeconds = seconds;
        energyUsed += (seconds * 0.1); // απλό παράδειγμα
        System.out.println("Timer set to " + seconds + " seconds");
    }

    public double getEnergyUse(){
        return energyUsed;
    }


    @Override
    public void getStatus() {

        String open = "on";
        String closed = "off";


        if (isOn == true) {
            System.out.println("the lights are " + open);
        } else {
            System.out.println("the lights are: " + closed);
        }
        System.out.println("The energy used was: " + energyUsed);

        System.out.println("Timer: " + timerSeconds + " seconds");

    }
}
