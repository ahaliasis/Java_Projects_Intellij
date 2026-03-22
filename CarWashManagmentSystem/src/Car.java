import java.util.ArrayList;
public class Car {
    private String name;
    private ArrayList<String> cars = new ArrayList<>();

    public Car(String name){
        this.name = name;
    }

    public void addToHistory(String entry){
        cars.add(entry);
    }

    public String getName() {
        return name;
    }

    public void showHistory(){
        if(cars.isEmpty()){
            System.out.print("No cars available");

            return;
        }
        System.out.println("History for: " + name);
        for(int i = 0 ; i < cars.size(); i++){
            System.out.println((i+1) + " - " + cars.get(i));
        }
    }

}
