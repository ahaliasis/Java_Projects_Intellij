public class Services implements CarUse{
    private String name;
    private double price;

    public Services(String name,double price){
        this.name = name;

        if(name.equals("Car Wash")){
            this.price = 15;
        }
        if(name.equals("Car Wax")){
            this.price =50;
        }
        if(name.equals("Interior Cleaning")){
            this.price = 10;
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
