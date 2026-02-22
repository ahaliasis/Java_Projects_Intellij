public class Fruits {
    private String fruit;
    private double price;

    public Fruits(String fruit, double price){
        this.fruit = fruit;


        if(fruit.equals("Bannana")){
            this.price = 2.40;
        }
        if(fruit.equals("Apple")){
            this.price = 1.10;
        }
        if(fruit.equals("Appricot")){
            this.price = 3.20;
        }
        if(fruit.equals("Mango")){
            this.price = 2.20;



        }



    }

    public double getPrice() {
        return price;
    }

    public String getFruit() {
        return fruit;
    }
}
