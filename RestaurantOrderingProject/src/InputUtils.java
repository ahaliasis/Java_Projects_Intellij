import java.util.Scanner;
import java.util.InputMismatchException;
public class InputUtils {
    public static Scanner scanner = new Scanner(System.in);

    public static int readInt(String message){
        while(true){
            try{
                System.out.print("Choice: ");
                return scanner.nextInt();
            }catch (InputMismatchException e){
                System.out.println("Only numbers");
                scanner.nextLine();
            }
        }
    }
}
