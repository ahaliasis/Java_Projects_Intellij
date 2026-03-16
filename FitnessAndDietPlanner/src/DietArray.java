import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;
public class DietArray {
    Scanner scanner = new Scanner(System.in);
    boolean valid = false;
    int choice = 0;

    ArrayList <Diet> diets = new ArrayList<>();

    public DietArray(){
        diets.add(new Diet("High-Protein",200));
        diets.add(new Diet("Low-Carb",-150));
        diets.add(new Diet("Balanced",0));
        diets.add(new Diet("Vegan", -100));


    }

    public Diet chooseDiet(Scanner scanner){
        for(int i = 0; i < diets.size(); i++){
            System.out.println((i + 1) + " - " + diets.get(i).getName() + " - " + diets.get(i).getCalories());
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
        return diets.get(choice - 1);
    }
}
