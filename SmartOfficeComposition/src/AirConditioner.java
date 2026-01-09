public class AirConditioner {
    private boolean isOn;
    private double temperature;
    public AirConditioner(boolean isOn, double temperature){
        this.isOn = isOn;
        this.temperature = temperature;
    }
    public void turnOn(){
        isOn= true;
        System.out.println("The Ac is on");
    }
    public void turnOff(){
        isOn = false;
        System.out.println("The Ac is off");
    }
    public void setTemperature(int temperature2){
        if(temperature2 < 16 || temperature2 > 30){
            System.out.println("Temperature must be between 16 and 30");
            return;
        }
        temperature = temperature2;
        System.out.println("Temp is now " + temperature);
    }

    public double getTemperature(){
        return temperature;
    }
    public void printStatus2(){
        System.out.println("the temperature is: " + temperature);
        System.out.println("the ac is: " + isOn);
    }

}