public class FinalOrder {

    private CarCategory category;
    private Extras extras;
    int daysRent;

    public FinalOrder(){
        category = null;
        extras = null;
    }

    public void chooseCategory(CarCategory c){
        this.category = c;
    }
    public void chooseExtras(Extras e){
        this.extras = e;
    }

    public void setDaysRent(int days){
        daysRent += days;
    }
    public int getDaysRent(){
        return daysRent;
    }

    public CarCategory getCategory() {
        return category;
    }

    public double calculateTotal(){
        int total = 0;

        if(category!=null){
            total += category.getPrice() * daysRent;
        }
        if(extras!=null){
            total+= extras.getPrice();
        }
        return total;
    }


}
