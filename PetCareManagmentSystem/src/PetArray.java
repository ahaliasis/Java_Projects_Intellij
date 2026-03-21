import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;
public class PetArray {
    ArrayList <Pet> pets = new ArrayList<>();
Scanner scanner = new Scanner(System.in);

int choice = 0;
boolean valid = false;

    public void addPet(){
        System.out.print("Pet name: ");
        String name = scanner.nextLine();
        pets.add(new Pet(name));
        System.out.println(name + " added");

    }
    public Pet choosePet(Scanner scanner){
        if(pets.isEmpty()){
            System.out.println("No pets available");

            return null;
        }

        for(int i = 0 ; i < pets.size(); i ++){
            System.out.println((i + 1) + " - " + pets.get(i).getName());
        }
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

        return pets.get(choice -1);

    }


}
