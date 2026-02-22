import java.util.*;
public class Main{
    public static void main(String[] args) {

        /*
        Ο χρήστης:

επιλέγει τύπο δωματίου

δηλώνει διανυκτερεύσεις

προσθέτει πρωινό ή parking

βλέπει τελικό κόστος

         */
        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;
        int choice = 0;
        boolean valid = false;
        RoomTypeList roomTypeList = new RoomTypeList();
        ExtraServicesList extraServicesList = new ExtraServicesList();
        FinalOrder finalOrder = new FinalOrder();
        int nights = 0;

        while (isRunning){
            System.out.println("---------------");
            System.out.println("Welcome to Benz");
            System.out.println("---------------");
            System.out.println("1-Choose a room");
            System.out.println("2-Choose extras");
            System.out.println("3-Calculate total");

            do{
                try{
                    System.out.println("Choice ");
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
                    System.out.println("Choice");
                    finalOrder.chooseRoomType(roomTypeList.chooseRoomType(scanner));
                    System.out.println("Room selected");
                    System.out.print("How many nights: ");
                    nights = scanner.nextInt();
                    scanner.nextLine();
                    finalOrder.setNights(nights);
                    System.out.println("Nights added");
                    break;
                case 2:
                    if(finalOrder.getRoomType() == null){
                        System.out.println("You must select a room first");
                        break;
                    }
                    System.out.println("What Extra Services would you like: ");
                    finalOrder.chooseExtraServices(extraServicesList.chooseExtraServices(scanner));
                    System.out.println("Extra Services added");
                    break;
                case 3:
                    System.out.println("Your total is: " + finalOrder.calculateTotal());
                    isRunning = false;
                    System.out.println("Thank you");
                    break;
                default:
                    System.out.println("Enter a valid choice");
                    break;




            }

        }

    }}


