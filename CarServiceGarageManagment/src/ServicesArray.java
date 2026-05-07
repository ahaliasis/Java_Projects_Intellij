import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;
public class ServicesArray {
    Scanner scanner = new Scanner(System.in);
    int choice =0;
    boolean valid = false;
    ArrayList <Services> services = new ArrayList<>();

    public ServicesArray(){
        services.add(new Services("Basic Service",140));
        services.add(new Services("Medium Service", 220));
        services.add(new Services("High quality service",400));
    }

    public Services chooseService(Scanner scanner){
        for(int i = 0; i < services.size(); i++){
            System.out.println((i+1) + " - " + services.get(i).getName() + " - " + services.get(i).getPrice());
        }
        do{
            try{
                System.out.println("choice: ");
                choice = scanner.nextInt();
                scanner.nextLine();
                valid =true;
            }catch (InputMismatchException e){
                System.out.println("Only numbers");
                scanner.nextLine();
            }

        }while(!valid);
        return services.get(choice - 1);
    }


}
