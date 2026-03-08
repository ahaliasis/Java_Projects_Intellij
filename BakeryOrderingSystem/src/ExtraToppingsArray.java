import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;
public class ExtraToppingsArray {
    Scanner scanner = new Scanner(System.in);

    ArrayList <ExtraToppings> extraToppings = new ArrayList<>();
    int choice = 0;
    boolean valid = false;

    public ExtraToppingsArray(){

        extraToppings.add(new ExtraToppings("Sirup",1.30));
        extraToppings.add(new ExtraToppings("Biscuits",2.10));
        extraToppings.add(new ExtraToppings("Chocolate Flavor", 3.20));

    }

    public ExtraToppings chooseExtraToppings(Scanner scanner){
        for(int i = 0; i < extraToppings.size(); i ++){
            System.out.println((i+1) + " - " + extraToppings.get(i).getExtraToppings() + " - " +extraToppings.get(i).getPrice() );
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

        return extraToppings.get(choice - 1);
    }



}
