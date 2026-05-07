import java.util.ArrayList;
public class Owner {
    private String name;
    private ArrayList <Vehicle> vehicles = new ArrayList<>();

    public Owner(String name){
        this.name = name;
    }

    public void addVehicle(Vehicle v){
        vehicles.add(v);
    }

    public ArrayList <Vehicle> getVehicles(){
        return vehicles;
    }

    public String getName() {
        return name;
    }
}
