import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;
public class SmartHomeOrder {

    ArrayList <SmartHome> devices = new ArrayList<>();
    Kitchen kitchen = new Kitchen();
    AirCondition airCondition = new AirCondition();
    WaterHeater waterHeater = new WaterHeater();
    Lights lights = new Lights();
    int seconds = 0;

    public SmartHomeOrder(){
        devices.add(new AirCondition());
        devices.add(new Kitchen());
        devices.add(new Lights());
        devices.add(new WaterHeater());
    }

    public void turnOnKitchen(){
        kitchen.turnOn();
    }
    public void turnOffKitchen(){
        kitchen.turnOff();
    }
    public void setTimerForKitchen(int seconds){
        kitchen.setTimer(seconds);
    }

    public void kitchenWattSpent(){
        kitchen.wattsSpent();
    }
    public void kitchenStatus(){
        kitchen.getStatus();
    }

    public void turnOnAirCondition(){
        airCondition.turnOn();
    }
    public void turnOffAircondition(){
        airCondition.turnOff();
    }
    public void setTimerForAirCondition(int seconds){
        kitchen.setTimer(seconds);
    }

    public void AirConditionWattSpent(){
        airCondition.getEnergyUsed();
    }
    public void airConditionStatus(){
        airCondition.getStatus();
    }

    public void turnOnWaterHeater(){
        waterHeater.turnOn();
    }
    public void turnOffWaterHeater(){
        waterHeater.turnOff();
    }
    public void setTimerForWaterHeater(int seconds){
        kitchen.setTimer(seconds);
    }

    public void waterHeaterWattSpent(){
        waterHeater.getEnergyUsed();
    }
    public void waterHeaterStatus(){
        waterHeater.getStatus();
    }
    public void turnOnLights(){
        lights.turnOn();
    }
    public void turnOffLights(){
        lights.turnOff();
    }
    public void setTimerForLights(int seconds){
        kitchen.setTimer(seconds);
    }

    public void lightsWattSpent(){
        lights.getEnergyUse();
    }
    public void lightsStatus(){
        lights.getStatus();
    }

    public double calculateTotalEnergy(){
        double total = 0;
        total +=kitchen.wattsSpent();
        total += airCondition.getEnergyUsed();
        total += waterHeater.getEnergyUsed();
        total+= lights.getEnergyUse();

        return total;


    }








}
