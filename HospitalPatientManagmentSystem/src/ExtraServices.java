public class ExtraServices implements Hospital{
    private String name;
    private double price;

    public ExtraServices(String name,double price){
        this.name = name;
        if(name.equals("Anaesthesia")){
            this.price = 1000;
        }
        if(name.equals("Fast Track")){
            this.price = 1500;
        }
        if(name.equals("Private Room")){
            this.price = 400;
        }
        if(name.equals("Special Equipment")){
            this.price = 800;
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
