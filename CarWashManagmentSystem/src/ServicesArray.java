import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;
public class ServicesArray {

    ArrayList <Services> services = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    int choice= 0 ;
    boolean valid = false;

    public ServicesArray(){
        services.add(new Services("Car Wash", 15));
        services.add(new Services("Car Wax",50));
        services.add(new Services("Interior Cleaning",10));
    }

    public Services chooseServices(Scanner scanner){
        for(int i = 0; i < services.size();i++){
            System.out.println((i+1) + " - " + services.get(i).getName() + " - " + services.get(i).getPrice());
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

        return services.get(choice - 1);
    }



}
