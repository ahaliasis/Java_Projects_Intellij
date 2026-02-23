import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.ArrayList;
public class CarCategoryArrayList {
    Scanner scanner = new Scanner(System.in);
    ArrayList <CarCategory> carCategories = new ArrayList<>();
    int choice = 0 ;
    boolean valid = false;

    public CarCategoryArrayList(){
        carCategories.add(new CarCategory("City car",80));
        carCategories.add(new CarCategory("Family car",130));
        carCategories.add(new CarCategory("Suv",180));
        carCategories.add(new CarCategory("Roadster",250));
    }

    public CarCategory chooseCategory(Scanner scanner){
        for(int i = 0 ; i < carCategories.size(); i++){
            System.out.println((i+1) + " - " + carCategories.get(i).getCategory() + " - " + carCategories.get(i).getPrice());

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

        return carCategories.get(choice -1);
    }

}
