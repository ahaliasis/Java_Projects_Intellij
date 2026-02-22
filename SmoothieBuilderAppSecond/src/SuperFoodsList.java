import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
public class SuperFoodsList {

    private ArrayList <SuperFoods> superFoods = new ArrayList<>();
    int choice = 0;
    boolean valid = false;

    public SuperFoodsList(){
        superFoods.add(new SuperFoods("Chia", 1.10));
        superFoods.add(new SuperFoods("Kurkuma", 2.20));
        superFoods.add(new SuperFoods("Ginger",1.50));

    }

    public SuperFoods chooseSuperFoods(Scanner scanner){
        for(int i = 0; i < superFoods.size(); i++){
            System.out.println((i+1) + " - " + superFoods.get(i).getSuperFood() + superFoods.get(i).getPrice());
        }

        do {
            try {
                System.out.print("choice: ");
                choice = scanner.nextInt();
                scanner.nextLine();
                valid = true;

            } catch (InputMismatchException e) {
                System.out.println("Only numbers");
                scanner.nextLine();
                valid = false;


            }

        } while (!valid);

        return superFoods.get(choice - 1);
    }
}
