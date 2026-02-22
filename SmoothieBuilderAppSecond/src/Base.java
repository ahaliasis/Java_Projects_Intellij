public class Base {
    private String base;
    private double price;

    public Base(String base, double price){
        this.base = base;

        if(base.equals("Milk")){
            this.price = 2.40;
        }
        if(base.equals("Yogurt")){
            this.price = 3.10;
        }
        if(base.equals("Juice")){
            this.price = 2.20;
        }





    }

    public String getBase() {
        return base;
    }

    public double getPrice() {
        return price;
    }
}