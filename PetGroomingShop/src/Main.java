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
                System.out.println("Only numbers");
                scanner.nextLine();
            }
        }
    }
    public static void main(String[] args) {

        Grooming grooming = new Grooming();
        ServicesArray servicesArray = new ServicesArray();
        ExtraServicesArray extraServicesArray = new ExtraServicesArray();
        int choice =0;
        boolean isRunning = true;

        while(isRunning){
            System.out.println("------------------------");
            System.out.println("Welcome to Pet Grooming");
            System.out.println("-----------------------");
            System.out.println("1-Register your Pet");
            System.out.println("2-Select Pet");
            System.out.println("3-Select Service");
            System.out.println("4-Select ExtraService");
            System.out.println("5-Calculate total");
            System.out.println("6-Lock status");
            System.out.println("7-Unlock status");
            System.out.println("8-See all the Pets");
            System.out.println("9-See all the Owners");
            System.out.println("10-Exit");

            choice = readInt("Choice: ");

            switch (choice){
                case 1:
                    grooming.registerPet();
                    break;
                case 2:
                    grooming.choosePet(scanner);
                    break;
                case 3:
                    grooming.selectServices(servicesArray.chooseServices(scanner));
                    System.out.println("Service selected");
                    break;
                case 4:
                    grooming.selectExtraServices(extraServicesArray.chooseExtraServices(scanner));
                    System.out.println("Extra services selected");
                    break;
                case 5:
                    System.out.println("Your total is: " + grooming.calculateTotal());
                    break;
                case 6:
                    grooming.lockStatus();
                    break;
                case 7:
                    grooming.unlockStatus();
                    break;
                case 8:
                    grooming.showPets();
                    break;
                case 9:
                    grooming.showOwners();
                    break;
                case 10:
                    isRunning = false;
                    System.out.println("Exiting");
                    break;
                default:
                    System.out.println("enter a valid choice");
                    break;
            }


        }

    }}


