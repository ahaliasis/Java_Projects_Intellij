import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.ArrayList;
public class Main{
    public static void main(String[] args) {


        /*
        Ο χρήστης:

επιλέγει κατηγορία αυτοκινήτου

δηλώνει ημέρες ενοικίασης

βλέπει κόστος + ασφάλεια

μπορεί να προσθέσει extra (GPS, παιδικό κάθισμα)
         */
        CarCategoryArrayList carCategoryArrayList = new CarCategoryArrayList();
        ExtrasArrayList extrasArrayList = new ExtrasArrayList();
        FinalOrder finalOrder = new FinalOrder();
        int choice = 0;
        boolean valid = false;
        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;
        int days = 0;

        while(isRunning){
            System.out.println("------------------");
            System.out.println("Welcome to Car Rental");
            System.out.println("------------------");
            System.out.println("1-Choose Car Category");
            System.out.println("2-Choose Extras");
            System.out.println("3-Total Cost");
            System.out.println("4-Exit");

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

            switch (choice){

                case 1:
                    finalOrder.chooseCategory(carCategoryArrayList.chooseCategory(scanner));
                    System.out.print("How many days: ");
                    days = scanner.nextInt();
                    scanner.nextLine();
                    finalOrder.setDaysRent(days);

                    System.out.println("Car and days are selected");
                    break;

                case 2:
                    if(finalOrder.getCategory()== null){
                        System.out.println("you must select car category first");
                        break;
                    }
                    finalOrder.chooseExtras(extrasArrayList.chooseExtras(scanner));

                    System.out.println("Extras are selected");
                    break;
                case 3:
                    System.out.println("Your total is: " + finalOrder.calculateTotal());
                    break;
                case 4:
                    isRunning = false;
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Select a valid choice");
                    break;
            }


        }


    }}

