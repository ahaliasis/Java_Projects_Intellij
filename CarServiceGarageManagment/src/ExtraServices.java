public class ExtraServices implements Item{
    private String name;
    private double price;

    public ExtraServices(String name, double price){
        this.name = name;
        this.price = price;
    }


    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
