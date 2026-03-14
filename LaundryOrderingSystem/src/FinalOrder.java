public class FinalOrder {
    private SelectService selectService;
    private ExtraServices extraServices;
    private double clothKg;

    public FinalOrder(){
        selectService = null;
        extraServices = null;
        clothKg = 0;
    }

    public void chooseService(SelectService s){
        this.selectService = s;
    }

    public void chooseExtraServices(ExtraServices e){
        this.extraServices = e;
    }

    public void setClothKg(double kg){
        this.clothKg = kg;
    }

    public double getClothKg() {
        return clothKg;
    }

    public double chooseClothKg(double kg){
        double price = 0;
        if(kg > 10){
            price = 10.20;
        }
        else if(kg > 5){
            price = 7.30;
        }
        else if(kg > 2){
            price = 4.20;
        }

        return price;
    }

    public SelectService getSelectService() {
        return selectService;
    }

    public ExtraServices getExtraServices() {
        return extraServices;
    }

    public double calculateTotal(){
        double total = 0;

        if(selectService != null){
            total += selectService.getPrice();
        }
        if(extraServices !=null){
            total += extraServices.getPrice();
        }

        total += chooseClothKg(clothKg);

        return total;
    }



}
