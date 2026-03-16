import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;
public class GoalArray {

    Scanner scanner = new Scanner(System.in);
    boolean valid = false;
    int choice = 0;

    ArrayList<Goal> goals = new ArrayList<>();

    public GoalArray(){
        goals.add(new Goal("weight-loss", 1800));
        goals.add(new Goal("muscle-mass",2800));
        goals.add(new Goal("maintenance",2200));

    }
    public Goal chooseGoal(Scanner scanner){
        for(int i = 0; i < goals.size(); i++){
            System.out.println((i+1) + " - " + goals.get(i).getName() + " - " + goals.get(i).getCalories());
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
        return goals.get(choice - 1);

    }

}
