import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.ArrayList;
public class ExtrasArrayList {
    Scanner scanner = new Scanner(System.in);
    ArrayList <Extras> extras = new ArrayList<>();
    int choice  = 0;
    boolean valid = false;

    public ExtrasArrayList(){
        extras.add(new Extras("Baby seat", 20));
        extras.add(new Extras("Ski bars", 30));
        extras.add(new Extras("Car insurance", 50));
        extras.add(new Extras("Gps",15));
    }

    public Extras chooseExtras(Scanner scanner){
        for(int i = 0 ; i < extras.size(); i++){
            System.out.println((i + 1) + " - " + extras.get(i).getExtras() + " - " + extras.get(i).getPrice());
        }

        do{
            try{
                System.out.print("Choice: ");
                choice = scanner.nextInt();
                scanner.nextLine();
                valid = true;

            }catch(InputMismatchException e){
                System.out.println("Only numbers!");
                scanner.nextLine();
                valid = false;

            }

        }while(!valid);

        return extras.get(choice - 1);
    }

}
