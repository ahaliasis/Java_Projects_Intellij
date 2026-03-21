import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;
public class ExtraServicesArray {

    Scanner scanner = new Scanner(System.in);
    ArrayList <ExtraServices> extraServices = new ArrayList<>();
    int choice = 0;
    boolean valid = false;

    public ExtraServicesArray(){
        extraServices.add(new ExtraServices("teeth cleaning",10));
        extraServices.add(new ExtraServices("nails done",12));
        extraServices.add(new ExtraServices("perfume",5));
    }

    public ExtraServices chooseExtraServices(Scanner scanner){
        for(int i = 0 ; i < extraServices.size(); i++){
            System.out.println((i+1) + " - " + extraServices.get(i).getName() + " - " + extraServices.get(i).getPrice());
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

        return extraServices.get(choice - 1);
    }

}
