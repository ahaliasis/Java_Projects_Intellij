public class Order {

    private Rofima rofima;
    private  Extras extras;

    public Order(){
        rofima = null;
        extras = null;
    }

    public void chooseRofima(Rofima r){
        this.rofima = r;

    }
    public void chooseExtras(Extras e){
        this.extras = e;
    }
    public double calculateTotal(){
        double total = 0;

        if(rofima != null){
            total += rofima.getPrice();
        }
        if(extras != null){
            total += extras.getPrice();
        }
        return total;

    }

    public Rofima getRofima() {
        return rofima;
    }
}
