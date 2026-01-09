public class SmartOffice {


    private Light light;
    private AirConditioner ac;
    private CoffeeMachine coffee;

    public SmartOffice() {
        this.light = new Light(true);
        this.ac = new AirConditioner(true, 28);
        this.coffee = new CoffeeMachine(60, false);
    }


    public void startDay(){
        light.turnOn();
        ac.setTemperature(25);
        ac.turnOn();
        coffee.brewCoffee();
    }
    public void shutDownOffice(){
        light.turnOff();
        ac.turnOff();

    }
    public void printStatus(){
        light.printStatus();
        ac.printStatus2();
        coffee.printStatus();
    }
    public void turnLightOn(){
        light.turnOn();
    }
    public void turnAcOn(){
        ac.turnOn();
    }
    public void setAc(int temp){
        ac.setTemperature(temp);
    }
    public void makeCoffee(){
        coffee.brewCoffee();
    }
    public void refilWater(){
        coffee.refilWater();
    }


}
