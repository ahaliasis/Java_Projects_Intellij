import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;
public class Main{
    public static Scanner scanner = new Scanner(System.in);

    public static int readInt(String message){
        while(true){
            try{
                System.out.println(message);
                return scanner.nextInt();
            }catch (InputMismatchException e){
                System.out.println("only numbers");
                scanner.nextLine();
            }
        }
    }

    public static void main(String[] args) {

        Garage garage = new Garage();
        ServicesArray servicesArray = new ServicesArray();
        ExtraServicesArray extraServicesArray = new ExtraServicesArray();
        boolean isRunning = true;
        int choice = 0;

        while(isRunning){
            System.out.println("-------------------");
            System.out.println("Welcome to Garage Makis and paidaroi");
            System.out.println("---------------------");
            System.out.println("1 - Register a vehicle");
            System.out.println("2 - Select vehicle");   // ΝΕΟ
            System.out.println("3 - Select Service");
            System.out.println("4 - Select Extra Service");
            System.out.println("5 - See all Vehicles");
            System.out.println("6 - See Owners");
            System.out.println("7 - Calculate total");
            System.out.println("8 - Lock Service");
            System.out.println("9 - Exit");

            choice = readInt("Choice: ");

            switch (choice){
                case 1:
                    garage.registerNewVehicle();
                    break;

                case 2:
                    garage.chooseVehicle();   // ΝΕΟ
                    break;

                case 3:
                    garage.chooseService(servicesArray.chooseService(scanner));
                    break;

                case 4:
                    garage.chooseExtraServices(extraServicesArray.chooseExtraServices(scanner));
                    break;

                case 5:
                    garage.showVehicles();
                    break;

                case 6:
                    garage.showOwners();
                    break;

                case 7:
                    System.out.println("Your total is: " + garage.calculateTotal());
                    break;

                case 8:
                    garage.lockService();
                    break;

                case 9:
                    isRunning = false;
                    System.out.println("Exiting");
                    break;

                default:
                    System.out.println("Enter a valid choice");
                    break;
            }
        }
    }
}
