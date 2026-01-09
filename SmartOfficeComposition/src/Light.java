public class Light {
    private boolean isOn;
    public Light(boolean isOn){
        this.isOn = isOn;
    }
    public void turnOn(){
        isOn= true;
        System.out.println("The light is on");
    }
    public void turnOff(){
        isOn = false;
        System.out.println("the light is off");

    }
    public void printStatus(){
        System.out.println("the light is: " + isOn);
    }
}
