import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;
public class ExtraServicesArray {
    Scanner scanner = new Scanner(System.in);
    ArrayList <ExtraServices> extraServices = new ArrayList<>();
    int choice = 0;
    boolean valid = false;

    public ExtraServicesArray(){
        extraServices.add(new ExtraServices("Cloth-Folding",2.20));
        extraServices.add(new ExtraServices("Home-PickUp",10));
        extraServices.add(new ExtraServices("Home-Delivery",5));
    }

    public ExtraServices chooseExtraServices(Scanner scanner){
        for(int i = 0; i < extraServices.size(); i++){
            System.out.println((i + 1) + " - " + extraServices.get(i).getExtraService() + " - " + extraServices.get(i).getPrice());

        }

        do{
            try{
                System.out.print("Choice: ");
                choice = scanner.nextInt();
                scanner.nextLine();
                valid = true;

            }catch (InputMismatchException e){
                System.out.println("Only numbers");
                valid = false;

            }
        }while (!valid);

        return extraServices.get(choice - 1);
    }

}
