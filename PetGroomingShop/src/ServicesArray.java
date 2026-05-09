import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;
public class ServicesArray {
    int choice =0;
    boolean valid = false;
    Scanner scanner = new Scanner(System.in);
    ArrayList <Services> services = new ArrayList<>();

    public ServicesArray(){
        services.add(new Services("bath",15));
        services.add(new Services("nails grooming",12));
        services.add(new Services("hair cut",25));
    }

    public Services chooseServices(Scanner scanner){
        for(int i = 0; i < services.size();i ++){
            System.out.println((i +1) + " - " + services.get(i).getName() + " - " + services.get(i).getPrice());
        }
        do{
            try{
                System.out.println("Choice: ");
                choice = scanner.nextInt();
                scanner.nextLine();
                valid = true;

            }catch (InputMismatchException e){
                System.out.println("Only numbers");
                scanner.nextLine();
                valid = false;
            }

        }while(!valid);
        return services.get(choice -1);
    }


}
