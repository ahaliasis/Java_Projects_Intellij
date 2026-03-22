public class ExtraServices implements CarUse{
    private String name;
    private double price;

    public ExtraServices(String name,double price){
        this.name = name;
        if(name.equals("Window Cleaning")){
            this.price = 20;
        }
        if(name.equals("Perfume")){
            this.price = 4;
        }
        if(name.equals("Wheel Cleaning")){
            this.price = 17;
        }
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
