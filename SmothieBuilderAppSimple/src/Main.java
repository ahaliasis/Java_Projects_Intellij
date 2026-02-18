import java.util.*;
public class Main{
    public static void main(String[] args) {



        /*
Ο χρήστης:

επιλέγει βάση (γάλα, νερό, χυμό)

επιλέγει φρούτα

προσθέτει superfoods

βλέπει τελικό κόστος

 */

        FinalOrder finalOrder = new FinalOrder();
        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;
        int choice = 0;
        boolean valid = false;
        int choice1 = 0;
        boolean valid1 = false;
        int choice2 = 0;
        boolean valid2 = false;
        int choice3 = 0;
        boolean valid3 = false;



        while(isRunning){
            System.out.println("Welcome to Juice4u");
            System.out.println("1-Select base");
            System.out.println("2-Select fruits");
            System.out.println("3-Select superFoods");
            System.out.println("4-Calculate total");
            System.out.println("5-Exit");

            do{
                try{
                    System.out.print("choice: ");
                    choice = scanner.nextInt();
                    scanner.nextLine();
                    valid = true;

                }catch (InputMismatchException e){
                    System.out.println("Only numbers");
                    scanner.nextLine();
                    valid = false;

                }

            }while(!valid);

            switch (choice){

                case 1:
                    System.out.println("Select your base");
                    System.out.println("1-Milk");
                    System.out.println("2-Yogurt");
                    System.out.println("3-Juice");

                    do {
                        try {
                            System.out.print("choice: ");
                            choice1 = scanner.nextInt();
                            scanner.nextLine();
                            valid1 = true;

                        } catch (InputMismatchException e) {
                            System.out.println("Only numbers");
                            scanner.nextLine();
                            valid1 = false;
                        }

                        }while (!valid1) ;

                        switch (choice1) {
                            case 1:
                                finalOrder.chooseBase(new Base("Milk", 3.10));
                                break;
                            case 2:
                                finalOrder.chooseBase(new Base("Yogurt", 3.10));
                                break;
                            case 3:
                                finalOrder.chooseBase(new Base("Juice", 2.20));
                                break;
                            default:
                                System.out.println("enter a valid choice");
                                break;
                        }
                        System.out.println("Base Selected");
                        break;


                case 2:
                    if(finalOrder.getBase() == null){
                        System.out.println("You must select a base first");
                        break;
                    }
                    System.out.println("Fruits selection");
                    System.out.println("1-Bannana");
                    System.out.println("2-Apple");
                    System.out.println("3-Appricot");
                    System.out.println("4-Mango");

                    do {
                        try {
                            System.out.print("choice: ");
                            choice2 = scanner.nextInt();
                            scanner.nextLine();
                            valid2 = true;

                        } catch (InputMismatchException e) {
                            System.out.println("Only numbers");
                            scanner.nextLine();
                            valid2 = false;
                        }

                    }while (!valid2) ;

                    switch (choice2){
                        case 1:
                            finalOrder.chooseFruits(new Fruits("Bannana",2.40));
                            break;
                        case 2:
                            finalOrder.chooseFruits(new Fruits("Apple",1.10));
                            break;
                        case 3:
                            finalOrder.chooseFruits(new Fruits("Appricot",3.20));
                            break;
                        case 4:
                            finalOrder.chooseFruits(new Fruits("Mango",2.20));
                            break;
                        default:
                            System.out.println("enter a valid choice");
                            break;

                    }
                    System.out.println("Fruits added");
                    break;
                case 3:
                    if(finalOrder.getBase() == null){
                        System.out.println("you must select a base first");
                        break;
                    }
                    System.out.println("Superfoods Selection");
                    System.out.println("1-Chia");
                    System.out.println("2-Kurkuma");
                    System.out.println("3-Ginger");


                    do {
                        try {
                            System.out.print("choice: ");
                            choice3 = scanner.nextInt();
                            scanner.nextLine();
                            valid3 = true;

                        } catch (InputMismatchException e) {
                            System.out.println("Only numbers");
                            scanner.nextLine();
                            valid3 = false;
                        }

                    }while (!valid3) ;

                switch (choice3){
                    case 1:
                        finalOrder.chooseSuperFruits(new SuperFruits("Chia",1.10));
                        break;
                    case 2:
                        finalOrder.chooseSuperFruits(new SuperFruits("Kurkuma",2.20));
                        break;
                    case 3:
                        finalOrder.chooseSuperFruits(new SuperFruits("Ginger",1.50));
                        break;
                    default:
                        System.out.println("Enter a valid choice");
                        break;
                }
                System.out.println("SuperFoods added");
                break;
                case 4:
                    System.out.println("Your total is: " + finalOrder.calculateTotal() );
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









    }}