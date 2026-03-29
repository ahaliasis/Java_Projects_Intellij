public class Services implements Hospital{
    private String name;
    private double price;

    public Services(String name,double price){
        this.name = name;

        if(name.equals("Blood Test")){
            this.price = 65;
        }
        if(name.equals("MRI")){
            this.price = 250;
        }
        if(name.equals("X-Ray")){
            this.price = 370;
        }
        if(name.equals("Surgery")){
            this.price = 2500;
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
