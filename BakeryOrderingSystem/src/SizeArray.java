import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;
public class SizeArray {
    Scanner scanner = new Scanner(System.in);
    ArrayList <Size> sizes = new ArrayList<>();
    int choice = 0 ;
    boolean valid = false;

    public SizeArray(){
        sizes.add(new Size("Small",3));
        sizes.add(new Size("Large",5));
    }
    public Size chooseSize(Scanner scanner){
        for(int i = 0 ; i < sizes.size(); i++){
            System.out.println((i+1) + " - " + sizes.get(i).getSize() + " - " + sizes.get(i).getPrice());
        }
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

        return sizes.get(choice - 1);
    }



}
