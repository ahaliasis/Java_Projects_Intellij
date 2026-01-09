import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;
        boolean valid = false;
        boolean valid2 = false;
        int temp = 0;
        int choice = 0;
        SmartOffice smartOffice = new SmartOffice();

        while(isRunning){

            System.out.println("MENU");
            System.out.println("1-Start day");
            System.out.println("2-Turn light on");
            System.out.println("3-Turn Ac on");
            System.out.println("4-Set ac Temperature");
            System.out.println("5-Make Coffee");
            System.out.println("6-Refill water for Coffee machine");
            System.out.println("7-Show Status");
            System.out.println("8-ShutDown office");
            System.out.println("9-Exit");

            do{
                try{
                    System.out.print("Choice: ");
                    choice = scanner.nextInt();
                    valid = true;

                }catch (InputMismatchException e){
                    System.out.println("Only numbers");
                    scanner.nextLine();
                    valid = false;
                }

            }while(!valid);

            switch (choice){

                case 1:
                    smartOffice.startDay();
                    break;

                case 2:
                    smartOffice.turnLightOn();
                    break;

                case 3:
                    smartOffice.turnAcOn();
                    break;

                case 4:
                    do{
                        try{
                            System.out.println("Ac temp: ");
                            temp = scanner.nextInt();
                            valid2 = true;

                        }catch (InputMismatchException e){
                            System.out.println("only numbers");
                            scanner.nextLine();
                            valid2 = false;
                        }
                    }while(!valid2);
                    smartOffice.setAc(temp);
                    break;
                case 5:
                    smartOffice.makeCoffee();
                    break;

                case 6:
                    smartOffice.refilWater();
                    break;

                case 7:
                    smartOffice.printStatus();
                    break;

                case 8:
                    smartOffice.shutDownOffice();
                    break;

                case 9:
                    isRunning = false;
                    System.out.println("exiting....");
                    break;


                default:
                    System.out.println("Give a valid choice");
                    break;

            }




        }





    }
}