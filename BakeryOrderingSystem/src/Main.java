import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;
public class Main{
    public static void main(String[] args) {

        /*
        🧁 Bakery Ordering System
Ο χρήστης:

επιλέγει γλυκό

επιλέγει μέγεθος/ποσότητα

προσθέτει extra toppings

βλέπει τελικό κόστος
         */

        FinalOrder finalOrder = new FinalOrder();
        SweetArray sweetArray = new SweetArray();
        SizeArray sizeArray = new SizeArray();
        ExtraToppingsArray extraToppingsArray = new ExtraToppingsArray();
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        boolean valid = false;
        boolean isRunning = true;

        while(isRunning){
            System.out.println("----------------------------");
            System.out.println("Welcome To Bakery Factory");
            System.out.println("----------------------------");
            System.out.println("1-Choose Sweet");
            System.out.println("2-Choose Size");
            System.out.println("3-Choose Extra Toppings");
            System.out.println("4-Calculate total");
            System.out.println("5-Exit");

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

            switch (choice){
                case 1:
                  finalOrder.chooseSweet(sweetArray.chooseSweet(scanner));
                  System.out.println("Sweet added");
                    break;
                case 2:
                    if(finalOrder.getSweet() == null){
                        System.out.println("You must choose sweet first");
                        break;
                    }
                    finalOrder.chooseSize(sizeArray.chooseSize(scanner));
                    System.out.println("Size added");
                    break;
                case 3:
                    if(finalOrder.getSweet() == null){
                        System.out.println("You must choose sweet first");
                        break;
                    }
                    finalOrder.chooseExtraToppings(extraToppingsArray.chooseExtraToppings(scanner));
                    System.out.println("Extra Topping aadded");
                    break;
                case 4:
                    System.out.println("Your total cost is: " + finalOrder.calculateTotal());
                    break;
                case 5:
                    isRunning = false;
                    System.out.println("Exiting....");
                    break;
                default:
                    System.out.println("Enter a valid choice");
                    break;

            }


        }






    }}


