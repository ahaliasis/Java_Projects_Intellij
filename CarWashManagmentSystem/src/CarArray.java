import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;
public class CarArray {

    private ArrayList<Car> cars = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    int choice = 0;
    boolean valid = false;


    public void addCar(){
        System.out.print("Car brand: ");
        String brand = scanner.nextLine();
        cars.add(new Car(brand));

        System.out.println(brand + " added");
    }

    public  Car chooseCar(Scanner scanner){
        if(cars.isEmpty()){
            System.out.println("No cars available");

            return  null;
        }


        for(int i = 0; i < cars.size(); i++){
            System.out.println((i+1) + " - " + cars.get(i).getName());
        }

        do{
            try{
                System.out.print("Choice: ");
                choice = scanner.nextInt();
                scanner.nextLine();
                valid = true;

            }catch (InputMismatchException e){
                System.out.print("Only numbers");
                scanner.nextLine();
                valid = false;
            }

        }while(!valid);
        return cars.get(choice - 1);
    }


}
