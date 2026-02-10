import java.util.*;
public class Main{
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
boolean isRunning = true;
Order order = new Order();
boolean valid = false;
int choice = 0;
boolean valid1 = false;
int choice1 = 0;
boolean valid2 = false;
int choice2 = 0;
boolean valid3 = false;
int choice3 = 0;



        while(isRunning){
            System.out.println("_______________");
            System.out.println("Welcome to Coffee Shop");
            System.out.println("_______________");
            System.out.println("1-Choose a drink");
            System.out.println("2-Choose a topping");
            System.out.println("3-Calculate total");
            System.out.println("4-Exit");

            do{
                try{
                    System.out.print("Choice: ");
                    choice = scanner.nextInt();
                    scanner.nextLine();
                    valid = true;
                }catch (InputMismatchException e){
                    System.out.println("Only numbers! ");
                    scanner.nextLine();
                    valid = false;

                }

            }while(!valid);

            switch (choice){
                case 1:
                    System.out.println("1-Espresso");
                    System.out.println("2-Latte");
                    System.out.println("3-Chocolate");

                    do{
                        try{
                            System.out.print("Choice: ");
                            choice1 = scanner.nextInt();
                            scanner.nextLine();
                            valid1 = true;
                        }catch (InputMismatchException e){
                            System.out.println("Only numbers! ");
                            scanner.nextLine();
                            valid1 = false;

                        }
                    }while(!valid1);

                    System.out.println("Choose a size");
                    System.out.println("1-Normal");
                    System.out.println("2-Large");


                    do{
                        try{
                            System.out.print("Choice: ");
                            choice2 = scanner.nextInt();
                            scanner.nextLine();
                            valid2 = true;
                        }catch (InputMismatchException e){
                            System.out.println("Only numbers! ");
                            scanner.nextLine();
                            valid2 = false;

                        }
                    }while(!valid2);

                    switch (choice1){
                        case 1:
                            switch (choice2){
                                case 1:
                                    order.chooseRofima(new Rofima("Espresso","normal",2.40));
                                    break;
                                case 2:
                                    order.chooseRofima(new Rofima("Espresso","Large",3.40));
                                    break;
                            }
                            break;
                        case 2:
                            switch (choice2){
                                case 1:
                                    order.chooseRofima(new Rofima("Latte","normal",4.30));
                                    break;
                                case 2:
                                    order.chooseRofima(new Rofima("Latte","Large",5.30));
                                    break;
                            }
                            break;
                        case 3:
                            switch (choice2){
                                case 1:
                                    order.chooseRofima(new Rofima("Chocolate", "normal", 3.80));
                                    break;
                                case 2:
                                    order.chooseRofima(new Rofima("Chocolate","Large",5.00));
                                    break;
                            }

                            break;
                    }


                    System.out.println("Drink added!"); break;
                case 2:
                    if(order.getRofima() == null){
                        System.out.println("You must choose a drink first");
                        break;
                    }

                    System.out.println("1-Milk");
                    System.out.println("2-Syrop");
                    System.out.println("3-Cinamon");
                    System.out.println("4-extraShots");

                    do{
                        try{
                            System.out.print("Choice: ");
                            choice3 = scanner.nextInt();
                            scanner.nextLine();
                            valid3 = true;
                        }catch (InputMismatchException e){
                            System.out.println("Only numbers! ");
                            scanner.nextLine();
                            valid3 = false;

                        }
                    }while(!valid3);

                    switch (choice3){

                        case 1:
                            order.chooseExtras(new Extras("Milk", 0.80));
                            break;

                        case 2:
                            order.chooseExtras(new Extras("Sirop",1.10));
                            break;

                        case 3:
                            order.chooseExtras(new Extras("Cinamon",0.10));
                            break;

                        case 4:
                            order.chooseExtras(new Extras("ExtraShots",1.80));
                            break;

                    }


                             break;
                case 3:
                    System.out.println("Total: " + order.calculateTotal());
                    break;

                case 4:
                    isRunning = false;
                    System.out.println("Thank you!!");
                    break;

                default:
                    System.out.println("Enter a valid choice");
                    break;
            }









        }




    }}

