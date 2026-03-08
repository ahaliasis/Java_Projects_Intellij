public class Sweet {
    private String sweet;
    private double price;

    public Sweet(String sweet, double price){
        this.sweet = sweet;
        if(sweet.equals("Ice-Cream")){
            this.price = 4.80;
        }
        if(sweet.equals("Chocolate cake")){
            this.price = 7.60;
        }
        if(sweet.equals("Profiterol")){
            this.price = 10;
        }
        if(sweet.equals("Bannana-Bread")){
            this.price = 5.60;
        }
    }
    public double getPrice() {
        return price;
    }

    public String getSweet() {
        return sweet;
    }
}
