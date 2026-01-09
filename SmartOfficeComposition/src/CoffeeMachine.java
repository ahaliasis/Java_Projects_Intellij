public class CoffeeMachine {
    private double waterLevel;
    private boolean coffeeReady;
    public CoffeeMachine(double waterLevel, boolean coffeeReady){
        this.waterLevel = waterLevel;
        this.coffeeReady = coffeeReady;
    }
    public void brewCoffee(){
        if(waterLevel > 50){
            coffeeReady = true;
            System.out.println("Brewing coffee");
            waterLevel --;
        }else{
            System.out.println("Not enough water");
        }
    }
    public void refilWater(){
        coffeeReady = true;
        waterLevel = 60;
        System.out.println("Water Refieled");
    }
    public void printStatus(){
        System.out.println("Coffee ready: " + coffeeReady);
        System.out.println("Water Level: " + waterLevel);
    }
}
