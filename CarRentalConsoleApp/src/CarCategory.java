public class CarCategory {
    private String Category;
    private double price;

    public CarCategory(String category, double price){
        this.Category = category;

        if(category.equals("City car")){
            this.price = 80;
        }
        if(category.equals("Family car")){
            this.price = 130;
        }
        if(category.equals("Suv")){
            this.price = 180;
        }
        if(category.equals("Roadster")){
            this.price = 250;
        }
    }

    public String getCategory() {
        return Category;
    }

    public double getPrice() {
        return price;
    }
}
