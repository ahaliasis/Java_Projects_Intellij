import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;
public class FruitsList {
    private ArrayList <Fruits> fruits = new ArrayList<>();
    int choice = 0;
    boolean valid = false;

    public FruitsList(){
        fruits.add(new Fruits("Bannana", 2.40));
        fruits.add(new Fruits("Apple",1.10));
        fruits.add(new Fruits("Appricot", 3.20));
        fruits.add(new Fruits("Mango",2.20));

    }
    public Fruits chooseFruits(Scanner scanner) {
        for (int i = 0; i < fruits.size(); i++) {
            System.out.println((i + 1) + " - " + fruits.get(i).getFruit() + " - " + fruits.get(i).getPrice());
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

        return fruits.get(choice - 1);
    }


}
