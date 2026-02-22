public class ExtraServices {
    private String extraServices;
    private double price;

    public ExtraServices(String extraServices, double price){
        this.extraServices = extraServices;

        if(extraServices.equals("Parking")){
            this.price = 20;
        }
        if(extraServices.equals("Breakfast")){
            this.price = 10;
        }


    }

    public double getPrice() {
        return price;
    }

    public String getExtraServices() {
        return extraServices;
    }
}
