public class Services implements PetManagment {
    private String name;
    private double price;

    public Services(String name,double price){
        this.name = name;

        if(name.equals("bath")){
            this.price = 20;
        }
        if(name.equals("grooming")){
            this.price = 25;
        }
        if(name.equals("training")){
            this.price = 100;
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
