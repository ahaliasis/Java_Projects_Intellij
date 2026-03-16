import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;
public class Main{
    public static void main(String[] args) {

        FinalPlan finalPlan = new FinalPlan();
        GoalArray goalArray = new GoalArray();
        WorkoutArray workoutArray = new WorkoutArray();
        DietArray dietArray = new DietArray();
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        boolean valid = false;
        boolean isRunning = true;
        int choice1 = 0;
        boolean valid1 = false;

        //na ftiaksw tin main

        while (isRunning){
            System.out.println("1 - Choose Goal");
            System.out.println("2 - Choose Workout");
            System.out.println("3 - Choose Diet");
            System.out.println("4 - Show Daily Calories");
            System.out.println("5 - Show Weekly Plan");
            System.out.println("6 - Exit");

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


            switch(choice){

                case 1:
                    System.out.println("Choose Your goal");
                    finalPlan.chooseGoal(goalArray.chooseGoal(scanner));

                   System.out.println("Goal Selected");
                   break;

                case 2:
                    System.out.println("Choose your workout");
                    finalPlan.chooseWorkOut(workoutArray.chooseWorkout(scanner));
                    System.out.println("Workout Selected");

                    break;

                case 3:
                    System.out.println("Choose Diet");
                    finalPlan.chooseDiet(dietArray.chooseDiet(scanner));

                    System.out.println("Diet selected");
                    break;

                case 4:
                    System.out.println("Your daily calories are: " + finalPlan.calculateTotalCalories());
                    break;

                case 5:
                    finalPlan.WeeklyPlan();
                    break;

                case 6:
                    isRunning = false;
                    System.out.println("Exiting....");
                    break;

                default:
                    System.out.println("Enter a valid choice");
                    break;

            }



            }



        }




    }

