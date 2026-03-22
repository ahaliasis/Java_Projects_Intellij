import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;
public class Main{
    public static void main(String[] args) {




        FinalOrder finalOrder = new FinalOrder();
        CarArray carArray = new CarArray();
        ServicesArray servicesArray = new ServicesArray();
        ExtraServicesArray extraServicesArray = new ExtraServicesArray();
        Scanner scanner = new Scanner(System.in);

        int choice = 0;
        boolean valid = false;
        boolean isRunning= true;

        Car selectedCar = null;

        while (isRunning){
            System.out.println("______________________________");
            System.out.println("Welcome to SharkTail Car Wash");
            System.out.println("-------------------------------");
            System.out.println("1-Add Car");
            System.out.println("2-Select Car");
            System.out.println("3-Add Service ");
            System.out.println("4-Add Extra Service");
            System.out.println("5-Show History");
            System.out.println("6-Calculate total");
            System.out.println("7-Exit");

            do{
                try{
                    System.out.print("Choice: ");
                    choice = scanner.nextInt();
                    scanner.nextLine();
                    valid = true;

                }catch (InputMismatchException e){
                    System.out.print("Only numbers");
                    scanner.nextLine();
                    valid = false;
                }

            }while(!valid);

            switch (choice){
                case 1:
                    carArray.addCar();

                    break;

                case 2:
                  selectedCar = carArray.chooseCar(scanner);
                  break;

                case 3:
                    if(selectedCar == null){
                        System.out.println("Please select a car first");
                        break;
                    }

                    Services s = servicesArray.chooseServices(scanner);
                    finalOrder.chooseServices(s);

                    selectedCar.addToHistory("Service" + s.getName());
                    break;

                case 4:
                    if(selectedCar == null){
                        System.out.println("Please select a car first");
                        break;
                    }
                    ExtraServices e = extraServicesArray.chooseExtraServices(scanner);
                    finalOrder.chooseExtraServices(e);

                    selectedCar.addToHistory("Name " + e.getName());
                    break;

                case 5:
                    if(selectedCar == null){
                        System.out.println("Please enter a car first");
                        break;
                    }
                    selectedCar.showHistory();
                    break;

                case 6:
                    System.out.println("Your total is: " + finalOrder.calculateTotal() + "$");
                    break;

                case 7:
                    isRunning = false;
                    System.out.println("Exiting....");
                    break;

                default:
                    System.out.println("Enter a valid choice");
                    break;


            }

        }


    }}


