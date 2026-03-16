import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;
public class WorkoutArray {
    Scanner scanner = new Scanner(System.in);
    boolean valid = false;
    int choice = 0;
    ArrayList<Workout> workouts = new ArrayList<>();

    public WorkoutArray(){
        workouts.add(new Workout("cardio", 300));
        workouts.add(new Workout("strength",200));
        workouts.add(new Workout("HIIT",400));;



    }
    public Workout chooseWorkout(Scanner scanner){
        for(int i = 0 ; i < workouts.size(); i ++){
            System.out.println((i+1) + " - " + workouts.get(i).getName() + " - " + workouts.get(i).getCalories());
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

        return workouts.get(choice - 1);

    }
}
