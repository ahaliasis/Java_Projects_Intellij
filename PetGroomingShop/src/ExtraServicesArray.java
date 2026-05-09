import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;
public class ExtraServicesArray {
    int choice =0;
    boolean valid = false;
    Scanner scanner = new Scanner(System.in);
    ArrayList <ExtraServices> extraServices = new ArrayList<>();

    public ExtraServicesArray(){
        extraServices.add(new ExtraServices("teeth cleaning",6));
        extraServices.add(new ExtraServices("paws softening",10));
        extraServices.add(new ExtraServices("ears cleaning",10));
    }

    public ExtraServices chooseExtraServices(Scanner scanner){
        for(int i = 0; i < extraServices.size(); i++){
            System.out.println((i+1) + " - " + extraServices.get(i).getName() + " - " + extraServices.get(i).getPrice());
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
        return extraServices.get(choice -1);

    }

}
