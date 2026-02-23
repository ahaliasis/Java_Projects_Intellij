public class Extras {
    private String extras;
    private double price;

    public Extras(String extras, double price){
        this.extras = extras;

        if(extras.equals("Baby seat")){
            this.price = 20;
        }
        if(extras.equals("Ski bars")){
            this.price = 30;
        }
        if(extras.equals("Car insurance")){
            this.price = 50;
        }
        if(extras.equals("Gps")){
            this.price = 15;
        }

    }

    public double getPrice() {
        return price;
    }

    public String getExtras() {
        return extras;
    }
}
