public class Goal implements PlanOption{

    private String name;
    private int calories;

    public Goal(String name, int calories){
        this.name = name;

        if(name.equals("weight-loss")){
            this.calories = 1800;
        }
        if(name.equals("muscle-mass")){
            this.calories = 2800;
        }
        if(name.equals("maintenance")){
            this.calories = 2200;
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
