public class Size {
    private String size;
    private double price;

    public Size(String size, double price){
        this.size = size;
        if(size.equals("Small")){
            this.price = 3;
        }
        if(size.equals("Large")){
            this.price = 5;
        }
    }

    public double getPrice() {
        return price;
    }

    public String getSize() {
        return size;
    }
}
