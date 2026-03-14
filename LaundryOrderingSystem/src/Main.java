import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;
public class Main{
    public static void main(String[] args) {

        /*
        Ο χρήστης:

επιλέγει υπηρεσία (πλύσιμο, στέγνωμα, σιδέρωμα)

δηλώνει κιλά ρούχων

βλέπει κόστος

προσθέτει extra υπηρεσίες

         */

        Scanner scanner = new Scanner(System.in);
        FinalOrder finalOrder = new FinalOrder();
        ServicesArray servicesArray = new ServicesArray();
        ExtraServicesArray extraServicesArray = new ExtraServicesArray();
        int choice = 0;
        boolean valid = false;
        boolean isRunning = true;
        double kg = 0;

        while(isRunning){
            System.out.println("_____________");
            System.out.println("Welcome to Neighborhood Laundry");
            System.out.println("_____________");
            System.out.println("1-Choose Service");
            System.out.println("2-Choose Extra Services");
            System.out.println("3-Choose Weight");
            System.out.println("4-Calculate total");
            System.out.println("5-Exit");

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

            switch (choice){
                case 1:
                    finalOrder.chooseService(servicesArray.chooseService(scanner));

                    System.out.println("Service added");
                    break;

                case 2:
                    if(finalOrder.getSelectService() == null){
                        System.out.println("you must select a service first");
                        break;
                    }
                    finalOrder.chooseExtraServices(extraServicesArray.chooseExtraServices(scanner));

                    System.out.println("Extra Service added");
                    break;

                case 3:
                    if(finalOrder.getSelectService() == null){
                        System.out.println("You must select service first");
                        break;
                    }
                    System.out.print("Cloth Kg : ");
                    kg = scanner.nextDouble();
                    scanner.nextLine();

                    finalOrder.setClothKg(kg);

                    System.out.println("Kg added");
                    break;

                case 4:
                    if(finalOrder.getSelectService() == null){
                        System.out.println("You must select service first");
                        break;
                    }
                    if(finalOrder.getClothKg() == 0){
                        System.out.println("You must enter kilos");
                        break;

                    }
                    System.out.println("Your total is: " + finalOrder.calculateTotal());
                    break;
                case 5:
                    isRunning = false;
                    System.out.println("Thank you!");
                    break;

                default:
                    System.out.println("Enter a valid choice");
                    break;

            }



        }


    }}


