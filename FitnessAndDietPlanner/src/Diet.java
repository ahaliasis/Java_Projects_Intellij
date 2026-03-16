public class Diet implements PlanOption{
    private String name;
    private int calories;

    public Diet(String name, int calories){
        this.name =name;

        if(name.equals("High-Protein")){
            this.calories = 200;
        }
        if(name.equals("Low-Carb")){
            this.calories = -150;
        }
        if(name.equals("Balanced")){
            this.calories = 0;
        }
        if(name.equals("Vegan")){
            this.calories = -100;
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
