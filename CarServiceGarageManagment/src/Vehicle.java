public class Vehicle {
    private String plate;
    private String model;
    private Owner owner;
    private double lastServiceTotal = 0;

    public Vehicle(String plate,String model, Owner owner){
        this.plate = plate;
        this.model = model;
        this.owner = owner;
    }

    public void setLastServiceTotal(double total) {
        this.lastServiceTotal = lastServiceTotal;
    }

    public double getLastServiceTotal() {
        return lastServiceTotal;
    }

    public Owner getOwner() {
        return owner;
    }

    public String getModel() {
        return model;
    }

    public String getPlate() {
        return plate;
    }
}
