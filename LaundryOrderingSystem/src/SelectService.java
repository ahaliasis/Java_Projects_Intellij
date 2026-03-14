public class SelectService {
    private String service;
    private double price;

    public SelectService(String service, double price){
        this.service = service;

        if(service.equals("Cloth-Washing")){
            this.price = 5.40;
        }
        if(service.equals("Cloth-Drying")){
            this.price = 4.40;
        }
        if(service.equals("Cloth-Ironing")){
            this.price = 6;
        }

    }

    public String getService() {
        return service;
    }

    public double getPrice() {
        return price;
    }
}
