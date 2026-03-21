import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;
public class ServicesArray {

    Scanner scanner = new Scanner(System.in);
    ArrayList <Services> services = new ArrayList<>();
    int choice = 0;
    boolean valid = false;

    public ServicesArray(){
        services.add(new Services("bath",20));
        services.add(new Services("grooming",25));
        services.add(new Services("training",100));
    }

    public Services chooseService(Scanner scanner){
        for(int i = 0; i < services.size(); i++){
            System.out.println((i+1) + " - " + services.get(i).getName() + " - " + services.get(i).getPrice());
        }

        do{
            try{
                System.out.print("Choice: ");
                choice = scanner.nextInt();
                scanner.nextLine();
                valid = true;

            }catch (InputMismatchException e){
                System.out.println("Only numbers");
                scanner.nextLine();
                valid = false;
            }

        }while(!valid);

        return services.get(choice - 1);

    }


}
