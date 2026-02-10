public class Extras {
    private String extraTopic;
    private double price;

    public Extras(String extraTopic, double price){
        this.extraTopic = extraTopic;

        if(extraTopic.equals("milk")){
            this.price = 0.80;
        }
        if(extraTopic.equals("sirop")){
            this.price = 1.10;
        }
        if(extraTopic.equals("cinamon")){
            this.price = 0.10;
        }
        if(extraTopic.equals("extraShots")){
            this.price = 1.80;
        }



    }

    public double getPrice() {
        return price;
    }
}
