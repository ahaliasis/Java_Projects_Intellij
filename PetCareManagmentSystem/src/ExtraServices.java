public class ExtraServices implements PetManagment{
    private String name;
    private double price;


    public ExtraServices(String name, double price){
        this.name = name;

        if(name.equals("teeth cleaning")){
            this.price = 10;
        }
        if(name.equals("nails done")){
            this.price = 12;
        }
        if(name.equals("perfume")){
            this.price = 5;
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
