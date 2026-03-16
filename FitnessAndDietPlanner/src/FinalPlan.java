public class FinalPlan {
    private Goal goal;
    private Workout workout;
    private Diet diet;

    public FinalPlan(){
        goal = null;
        workout = null;
        diet = null;
    }

    public void chooseGoal(Goal g){
        this.goal = g;
    }
    public void chooseWorkOut(Workout w){
        this.workout = w;
    }
    public void chooseDiet(Diet d){
        this.diet = d;
    }

    public double calculateTotalCalories(){
        double total = 0;

        if(goal != null){
            total += goal.getCalories();

        }
        if(workout != null){
            total += workout.getCalories();
        }
        if(diet != null){
            total += diet.getCalories();
        }

        return total;

    }
    public void WeeklyPlan(){
        double calories = calculateTotalCalories();
        System.out.println("The weekly calories are : " + (calories * 7));

    }


}
