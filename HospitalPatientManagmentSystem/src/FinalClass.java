public class FinalClass {
    private Services services;
    private ExtraServices extraServices;

    public FinalClass(){
        services = null;
        extraServices = null;
    }

    public void chooseServices(Services s){
        this.services = s;
    }
    public void chooseExtraServices(ExtraServices e){
        this.extraServices = e;
    }

    public double calculateTotal(){
        double total = 0;

        if(services != null){
            total += services.getPrice();
        }
        if(extraServices!=null){
            total += extraServices.getPrice();
        }

        return total;

    }



}
