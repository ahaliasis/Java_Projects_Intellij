public class SuperFruits {
    private String superFood;
    private double price;

    public SuperFruits(String superFood, double price){
        this.superFood = superFood;

        if(superFood.equals("Chia")){
            this.price = 1.10;

        }
        if(superFood.equals("Kurkuma")){
            this.price = 2.20;
        }
        if (superFood.equals("Ginger")){
            this.price = 1.50;
        }
    }

    public double getPrice() {
        return price;
    }
}
