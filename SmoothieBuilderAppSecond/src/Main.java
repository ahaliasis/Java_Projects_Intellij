import java.util.InputMismatchException;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        BaseList baseList = new BaseList();
        FruitsList fruitsList = new FruitsList();
        SuperFoodsList superFoodsList = new SuperFoodsList();
        FinalOrder finalOrder = new FinalOrder();
        boolean isRunning = true;
        int choice = 0;
        boolean valid = false;
        Scanner scanner = new Scanner(System.in);

        while (isRunning){
            System.out.println("Welcome to Juice4u");
            System.out.println("1-Select base");
            System.out.println("2-Select fruits");
            System.out.println("3-Select superFoods");
            System.out.println("4-Calculate total");
            System.out.println("5-Exit");

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

            switch (choice){
                case 1:
                    System.out.println("Choose your Base: ");
                    finalOrder.chooseBase(baseList.chooseBase(scanner));
                    System.out.println("Base Selected");
                    break;
                case 2:
                    if(finalOrder.getBase() == null){
                        System.out.println("You must select the base first");
                        break;
                    }
                    System.out.println("Select your fruits");
                    finalOrder.chooseFruits(fruitsList.chooseFruits(scanner));
                    System.out.println("fruits selected");
                    break;
                case 3:
                    if(finalOrder.getBase() == null){
                        System.out.println("you must select a base first");
                        break;
                    }
                    System.out.println("Select your Superfoods");
                    finalOrder.chooseSuperFoods(superFoodsList.chooseSuperFoods(scanner));
                    System.out.println("Superfoods Selected");
                    break;
                case 4:
                    if(finalOrder.getBase() == null){
                        System.out.println("you must select a base");
                        break;
                    }
                    System.out.println("Your total is: " + finalOrder.calculateTotal());
                    break;
                case 5:
                    isRunning = false;
                    System.out.println("Exiting... thank you");
                    break;
                default:
                    System.out.println("enter a valid choice");
                    break;

            }


        }

scanner.close();

    }}


