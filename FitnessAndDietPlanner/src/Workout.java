public class Workout implements PlanOption{
    private String name;
    private int calories;

    public Workout(String name, int calories){
        this.name = name;

        if(name.equals("cardio")){
            this.calories = 300;
        }
        if(name.equals("strength")){
            this.calories = 200;
        }
        if(name.equals("HIIT")){
            this.calories = 400;
        }
    }




    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getCalories() {
        return calories;
    }
}
