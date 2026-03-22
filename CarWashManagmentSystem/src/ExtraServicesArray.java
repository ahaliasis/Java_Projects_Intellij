import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;
public class ExtraServicesArray {

    ArrayList<ExtraServices> extraServices = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    int choice= 0 ;
    boolean valid = false;

    public ExtraServicesArray(){
        extraServices.add(new ExtraServices("Window Cleaning", 20));
        extraServices.add(new ExtraServices("Perfume", 4));
        extraServices.add(new ExtraServices("Wheel Cleaning", 17));
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
                System.out.print("Only numbers");
                scanner.nextLine();
                valid = false;
            }

        }while(!valid);

        return extraServices.get(choice -1);
    }

}
