import java.util.Scanner;
import java.util.ArrayList;
public class Main{
    public static void main(String[] args) {

        Order order = new Order();
        MenuArray menuArray = new MenuArray();
        ExtraMenuArray extraMenuArray = new ExtraMenuArray();
        boolean isRunning = true;
        int choice =0;
        Scanner scanner = new Scanner(System.in);


        while(isRunning){
            System.out.println("----------------");
            System.out.println("Welcome to Nalu ");
            System.out.println("-----------------");
            System.out.println("1-Register table");
            System.out.println("2-Select table");
            System.out.println("3-Select Menu");
            System.out.println("4-Select Extra Menu");
            System.out.println("5-Calculate total");
            System.out.println("6-See all customers");
            System.out.println("7-See all tables");
            System.out.println("8-Lock order");
            System.out.println("9-Exit");

            choice = InputUtils.readInt("Choice: ");


            switch(choice){
                case 1:
                    order.registerTable();
                    break;
                case 2:
                    order.chooseTable(scanner);
                    break;
                case 3:
                    order.chooseMenu(menuArray.chooseMenu(scanner));
                    break;
                case 4:
                    order.chooseExtraMenu(extraMenuArray.chooseExtraMenu(scanner));
                    break;
                case 5:
                    System.out.println("Your total is: "+ order.calculateTotal());
                    break;
                case 6:
                    order.seeAllCustomer();
                    break;
                case 7:
                    order.seeAllTables();
                    break;
                case 8:
                    order.lockOrder();
                    System.out.println("Order locked");
                    break;
                case 9:
                    isRunning = false;
                    System.out.println("Exiting..");
                    break;
                default:
                    System.out.println("Enter a valid choice");
                    break;
            }

        }

    }}


