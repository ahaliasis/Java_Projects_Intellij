import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.ArrayList;
public class RoomTypeList {

    private ArrayList <RoomType> roomTypes = new ArrayList<>();
    int choice = 0;
    boolean valid = false;

    public RoomTypeList(){

        roomTypes.add(new RoomType("Family",240));
        roomTypes.add(new RoomType("Double",120));
        roomTypes.add(new RoomType("Single",80));
        roomTypes.add(new RoomType("Triple",180));
        roomTypes.add(new RoomType("Suite",500));

    }
    public RoomType chooseRoomType(Scanner scanner){
        for(int i = 0 ; i < roomTypes.size(); i++){
            System.out.println((i+1) + " - " + roomTypes.get(i).getRoomType() + " - " + roomTypes.get(i).getPrice());

        }

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

        return roomTypes.get(choice -1);

    }

}
