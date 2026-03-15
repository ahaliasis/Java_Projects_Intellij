public class Kitchen implements SmartHome{

    private boolean isOn = false;
    private double energyUsed = 0;
    private double wattsPerUse = 15;
    private int secondsPerUse = 0;

    @Override
    public void turnOn() {
        isOn = true;
        energyUsed += wattsPerUse;
        System.out.println("The kitchen is on");

    }

    @Override
    public void turnOff() {
        isOn = false;
        System.out.println("The kitchen is off");

    }

    public void setTimer(int seconds){
        this.secondsPerUse = seconds;
        energyUsed += (seconds * 0.1);
        System.out.println("Timer set to " + seconds + " seconds");
    }

    public double wattsSpent() {
        return energyUsed;
    }


    @Override
    public void getStatus() {

        String open = "on";
        String closed = "off";


        if(isOn) {
            System.out.println("the Kitchen is " + open);
        }else {
            System.out.println("the Kitchen is: " + closed);
        }
        System.out.println("The energy used was: " + energyUsed);

        System.out.println("Timer: " + secondsPerUse + " seconds");



    }
}
