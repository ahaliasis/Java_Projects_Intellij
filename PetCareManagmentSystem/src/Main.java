import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;
public class Main{
    public static void main(String[] args) {

       /*
       🔥 8) Pet Care Management System
Σύστημα για κατοικίδια.

Ο χρήστης:
Προσθέτει κατοικίδιο

Επιλέγει υπηρεσίες (μπάνιο, grooming, εκπαίδευση)

Επιλέγει extra (νύχια, δόντια, άρωμα)

Βλέπει κόστος

Βλέπει ιστορικό επισκέψεων

Τι μαθαίνεις:
Πολλαπλά αντικείμενα ανά πελάτη

Ιστορικό

Πολλαπλές υπηρεσίες

        */

        Scanner scanner = new Scanner(System.in);
        FinalOrder finalOrder = new FinalOrder();
        PetArray  petArray = new PetArray();
        ServicesArray servicesArray = new ServicesArray();
        ExtraServicesArray extraServicesArray = new ExtraServicesArray();
        int choice = 0;
        boolean valid = false;
        boolean isRunning = true;
        Pet selectedPet = null; //prepei na kserw poio katoikidio eksipiretw gia ayto to evala

        while(isRunning){
            System.out.println("----------------------");
            System.out.println("Welcome to PetCare ");
            System.out.println("-----------------------");
            System.out.println("1-Add your pet");
            System.out.println("2-Select Pet");
            System.out.println("3-Choose Services");
            System.out.println("4-Choose Additional Services");
            System.out.println("5-History of pet");
            System.out.println("6-Total Cost");
            System.out.println("7-Exit");


            do{
                try{
                    System.out.print("Choice: ");
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

                    petArray.addPet();
                    break;

                case 2:
                   selectedPet = petArray.choosePet(scanner);
                   break;

                case 3:

                    if(selectedPet == null){
                        System.out.println("Please choose a pet first.");
                        break;
                    }

                    Services s = servicesArray.chooseService(scanner);
                    finalOrder.chooseServices(s);

                    selectedPet.addToHistory("Service: " + s.getName());
                    break;
                case 4:
                    if(selectedPet == null){
                        System.out.println("Please choose a pet first.");
                        break;
                    }

                    ExtraServices e = extraServicesArray.chooseExtraServices(scanner);
                    finalOrder.chooseExtraServices(e);

                    selectedPet.addToHistory("Extra: " + e.getName());
                    break;

                case 5:
                    if(selectedPet == null){
                        System.out.println("Please choose a pet first.");
                        break;
                    }

                    selectedPet.showHistory();
                    break;

                case 6:
                    System.out.println("Final Cost: " + finalOrder.calculateTotal());
                    break;

                case 7:
                    isRunning = false;
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("enter a valid choice");
                    break;


            }
        }

    }}


