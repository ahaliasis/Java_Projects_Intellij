import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.ArrayList;
public class ExtraServicesList {
    private ArrayList <ExtraServices> extraServices = new ArrayList<>();
    int choice = 0;
    boolean valid = false;

    public ExtraServicesList(){

        extraServices.add(new ExtraServices("Parking",20));
        extraServices.add(new ExtraServices("BreakFast",10));

    }
    public ExtraServices chooseExtraServices(Scanner scanner){
        for(int i = 0; i < extraServices.size(); i++){
            System.out.println((i+1) + " - " + extraServices.get(i).getExtraServices() + " - " + extraServices.get(i).getPrice());
        }
        do{
            try{
                System.out.println("Choice ");
                choice = scanner.nextInt();
                scanner.nextLine();
                valid = true;

            }catch (InputMismatchException e){
                System.out.println("Only numbers");
                scanner.nextLine();
                valid = false;

            }

        }while(!valid);
        return extraServices.get(choice - 1);

    }

}
