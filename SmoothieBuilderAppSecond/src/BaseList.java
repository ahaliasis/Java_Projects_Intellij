import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.ArrayList;
public class BaseList {
    private ArrayList <Base> bases = new ArrayList<>();
    int choice = 0;
    boolean valid = false;

    public BaseList(){
        bases.add(new Base("Milk", 2.40));
        bases.add(new Base("Yogurt", 3.10));
        bases.add(new Base("Juice",2.20));
    }

    public Base chooseBase(Scanner scanner){
        for(int i = 0; i < bases.size(); i++){
            System.out.println((i + 1) + " - " + bases.get(i).getBase() + " - " + bases.get(i).getPrice());
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

        return bases.get(choice - 1);
    }


}
