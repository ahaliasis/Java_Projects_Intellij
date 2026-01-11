public class AirConditioner {
    private boolean isOn;
    private double temperature;

    public AirConditioner(boolean isOn, double temperature){
        this.isOn = isOn;
        if((temperature < 15) || (temperature > 30)){
            System.out.println("Temperature must be: " + temperature);
        }else {
            this.temperature = temperature;
        }
    }
    public void turnOn(){
        isOn = true;
        System.out.println("Aircondition is on");
    }
    public void turnOff(){
        isOn = false;
        System.out.println("Aircondition is off");
    }
    public void setTemperature(double temp){
        temperature = temp;
        System.out.println("Temperature is now: " + temperature);
    }
    public void printStatus(){
        System.out.println("AirConditioner: " + isOn);
        System.out.println("Temperature: " + temperature);
    }
}
