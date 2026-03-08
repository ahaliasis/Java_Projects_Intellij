import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;
public class SweetArray {
    Scanner scanner = new Scanner(System.in);
    ArrayList <Sweet> sweets = new ArrayList<>();
    int choice = 0;
    boolean valid = false;

    public SweetArray(){
        sweets.add(new Sweet("Ice-Cream",4.80));
        sweets.add(new Sweet("Chocolate cake",7.60));
        sweets.add(new Sweet("Profiterol",10));
        sweets.add(new Sweet("Banna-Bread",5.60));
    }

    public Sweet chooseSweet(Scanner scanner){
        for(int i = 0 ; i < sweets.size(); i++){
            System.out.println((i+1) + " - " + sweets.get(i).getSweet() + " - " + sweets.get(i).getPrice());
        }
        do{
            try{
                System.out.print("Choice: ");
                choice = scanner.nextInt();
                scanner.nextLine();
                valid = true;

            }catch(InputMismatchException e){
                System.out.println("Only numbers");
                scanner.nextLine();
                valid = false;

            }
        }while(!valid);

        return sweets.get(choice - 1);

    }




}
