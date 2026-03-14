import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;
public class ServicesArray {

    Scanner scanner = new Scanner(System.in);

    ArrayList <SelectService> selectServices = new ArrayList<>();
    int choice = 0;
    boolean valid = false;

    public ServicesArray(){
        selectServices.add(new SelectService("Cloth-Washing",5.40));
        selectServices.add(new SelectService("Cloth-Drying",4.40));
        selectServices.add(new SelectService("Cloth-Ironing",6));
    }

    public SelectService chooseService(Scanner scanner){
        for(int i = 0; i < selectServices.size(); i++){
            System.out.println((i + 1) + " - " + selectServices.get(i).getService() + " - " + selectServices.get(i).getPrice());
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

        return selectServices.get(choice - 1);
    }


}
