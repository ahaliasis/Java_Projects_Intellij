public class ExtraServices {
    private String extraService;
    private double price;

    public ExtraServices(String extraService, double price){
        this.extraService = extraService;

        if(extraService.equals("Cloth-Folding")){
            this.price = 2.20;
        }
        if(extraService.equals("Home-Pickup")){
            this.price = 10;
        }
        if(extraService.equals("Home-Delivery")){
            this.price = 5;
        }
    }

    public String getExtraService() {
        return extraService;
    }

    public double getPrice() {
        return price;
    }
}
