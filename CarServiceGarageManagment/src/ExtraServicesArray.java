import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;
public class ExtraServicesArray {
    Scanner scanner = new Scanner(System.in);
    int choice =0;
    boolean valid = false;
    ArrayList <ExtraServices> extraServices = new ArrayList<>();

    public ExtraServicesArray(){
        extraServices.add(new ExtraServices("Tyres change",500));
        extraServices.add(new ExtraServices("Car washing",20));
        extraServices.add(new ExtraServices("Car Waxing", 50));
        extraServices.add(new ExtraServices("Color correction",150));
    }

    public ExtraServices chooseExtraServices(Scanner scanner){
        for(int i = 0; i < extraServices.size(); i++){
            System.out.println((i + 1) + " - " + extraServices.get(i).getName() + " - " + extraServices.get(i).getPrice());
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
        return extraServices.get(choice - 1);

    }
}
