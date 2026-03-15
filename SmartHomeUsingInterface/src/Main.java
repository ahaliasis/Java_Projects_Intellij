import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;
public class Main{
    public static void main(String[] args) {



        /*
        🔥 1) Smart Home Automation System // να το κάνω με interface για να το μάθω
Ένα σύστημα που ελέγχει συσκευές στο σπίτι.

Ο χρήστης:
Προσθέτει συσκευές (φώτα, θερμοσίφωνο, air-condition, κουζίνα)

Ορίζει χρονοδιακόπτες

Ενεργοποιεί/απενεργοποιεί συσκευές

Βλέπει κατανάλωση ρεύματος

Βλέπει συνολικό κόστος ρεύματος

Τι μαθαίνεις:
Πολύπλοκα αντικείμενα

Κατάσταση συσκευών (on/off)

Υπολογισμούς με βάση χρόνο

         */

        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        boolean valid = false;
        boolean isRunning = true;
        SmartHomeOrder smartHomeOrder = new SmartHomeOrder();
        int choice1 = 0 ;
        boolean valid1 = false;
        int timer1 =0;
        int choice2 = 0;
        boolean valid2 = false;
        int timer2 = 0;
        int choice3 = 0;
        boolean valid3 = false;
        int timer3 =0;
        int choice4 = 0;
        boolean valid4 = false;
        int timer4 =0;


        while(isRunning){
            System.out.println("____________");
            System.out.println("Welcome to your House");
            System.out.println("-----------------");
            System.out.println("1-Kitchen");
            System.out.println("2-Air Condition");
            System.out.println("3-Water Heater");
            System.out.println("4-Lights");
            System.out.println("5-Total Energy used");
            System.out.println("6-Exit");

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
                    System.out.println("1-Turn on kitchen");
                    System.out.println("2-Turn off kitchen");
                    System.out.println("3-Set timer for kitchen");
                    System.out.println("4-Status");

                    do{
                        try{
                            System.out.print("Choice: ");
                            choice4 = scanner.nextInt();
                            scanner.nextLine();
                            valid4 = true;

                        }catch(InputMismatchException e){
                            System.out.println("Only numbers");
                            scanner.nextLine();
                            valid4 = false;
                        }

                    }while(!valid4);

                    switch (choice4){
                        case 1:
                            smartHomeOrder.turnOnKitchen();
                            break;
                        case 2:
                            smartHomeOrder.turnOffKitchen();
                            break;
                        case 3:
                            System.out.print("Timer for: ");
                            timer4 = scanner.nextInt();
                            scanner.nextLine();
                            smartHomeOrder.setTimerForKitchen(timer4);
                            break;
                        case 4:
                            smartHomeOrder.kitchenStatus();
                            break;
                        default:
                            System.out.println("Enter a valid choice");
                            break;

                    }
                    break;

                    case 2:
                        System.out.println("1-Turn on Air Condition");
                        System.out.println("2-Turn off AirCondition");
                        System.out.println("3-Set timer for AirCondition");
                        System.out.println("4-Status");

                        do{
                            try{
                                System.out.print("Choice: ");
                                choice2 = scanner.nextInt();
                                scanner.nextLine();
                                valid2 = true;

                            }catch(InputMismatchException e){
                                System.out.println("Only numbers");
                                scanner.nextLine();
                                valid2 = false;
                            }

                        }while(!valid2);

                        switch (choice2){

                            case 1:
                                smartHomeOrder.turnOnAirCondition();
                                break;
                            case 2:
                                smartHomeOrder.turnOffAircondition();
                                break;
                            case 3:
                                System.out.print("Timer for: ");
                                timer2 = scanner.nextInt();
                                scanner.nextLine();
                                smartHomeOrder.setTimerForAirCondition(timer2);
                                break;
                            case 4:
                                smartHomeOrder.airConditionStatus();
                                break;
                            default:
                                System.out.println("Enter a valid choice");
                                break;
                        }
                        break;
                case 3:
                    System.out.println("1-Turn on Water Heater");
                    System.out.println("2-Turn off Water Heater");
                    System.out.println("3-Set timer for Water Heater");
                    System.out.println("4-Status");

                    do{
                        try{
                            System.out.print("Choice: ");
                            choice3 = scanner.nextInt();
                            scanner.nextLine();
                            valid3 = true;

                        }catch(InputMismatchException e){
                            System.out.println("Only numbers");
                            scanner.nextLine();
                            valid3 = false;
                        }

                    }while(!valid3);

                    switch (choice3){
                        case 1:
                            smartHomeOrder.turnOnWaterHeater();
                            break;
                        case 2:
                            smartHomeOrder.turnOffWaterHeater();
                            break;
                        case 3:
                            System.out.println("Timer for: ");
                            timer3 = scanner.nextInt();
                            scanner.nextLine();
                            smartHomeOrder.setTimerForWaterHeater(timer3);
                            break;
                        case 4:
                            smartHomeOrder.waterHeaterStatus();
                            break;
                        default:
                            System.out.println("Enter a valid choice");
                            break;
                    }
                    break;
                case 4:

                    System.out.println("1-Turn on lights");
                    System.out.println("2-Turn off Lights");
                    System.out.println("3-Set timer for lights");
                    System.out.println("4-Status");

                    do{
                        try{
                            System.out.print("Choice: ");
                            choice1 = scanner.nextInt();
                            scanner.nextLine();
                            valid1 = true;

                        }catch(InputMismatchException e){
                            System.out.println("Only numbers");
                            scanner.nextLine();
                            valid1 = false;
                        }

                    }while(!valid1);

                    switch (choice1){
                        case 1:
                            smartHomeOrder.turnOnLights();
                            break;
                        case 2:
                            smartHomeOrder.turnOffLights();
                            break;
                        case 3:
                            System.out.print("Timer for: ");
                            timer1 = scanner.nextInt();
                            scanner.nextLine();
                            smartHomeOrder.setTimerForLights(timer1);
                            break;
                        case 4:
                            smartHomeOrder.lightsStatus();
                            break;
                        default:
                            System.out.println("Enter a valid choice");
                            break;
                    }
                    break;
                case 5:
                    System.out.println("The total consumption: " + smartHomeOrder.calculateTotalEnergy());
                    break;

                case 6:
                    isRunning = false;
                    System.out.println("Bye!");
                    break;
                default:
                    System.out.println("Enter a valid choice");
                    break;









            }


        }


    }}

