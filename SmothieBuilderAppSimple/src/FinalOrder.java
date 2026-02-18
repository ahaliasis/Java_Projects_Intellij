public class FinalOrder {
    private Base base;
    private Fruits fruits;
    private SuperFruits superFruits;

    public FinalOrder(){
        base = null;
        fruits = null;
        superFruits = null;
    }

    public void chooseBase(Base b){
        this.base = b;
    }
    public void chooseFruits(Fruits f){
        this.fruits = f;
    }
    public void chooseSuperFruits(SuperFruits s){
        this.superFruits = s;
    }


    public double calculateTotal(){
        double total = 0;
        if(base!=null){
            total += base.getPrice();
        }
        if(fruits!=null){
            total+= fruits.getPrice();
        }
        if(superFruits!=null){
            total += superFruits.getPrice();
        }

        return total;
    }

    public Base getBase() {
        return base;
    }
}
