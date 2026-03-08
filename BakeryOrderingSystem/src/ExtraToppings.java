public class ExtraToppings {
    private String extraToppings;
    private double price;

    public ExtraToppings(String extraToppings, double price){
        this.extraToppings = extraToppings;

        if(extraToppings.equals("Sirup")){
            this.price = 1.30;
        }
        if(extraToppings.equals("Biscuits")){
            this.price = 2.10;
        }
        if(extraToppings.equals("Chocolate Flavor")){
            this.price = 3.20;
        }
    }

    public double getPrice() {
        return price;
    }

    public String getExtraToppings() {
        return extraToppings;
    }
}
