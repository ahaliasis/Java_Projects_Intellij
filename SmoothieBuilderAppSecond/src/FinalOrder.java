public class FinalOrder {
    private Base base;
    private Fruits fruits;
    private SuperFoods superFoods;

    public FinalOrder(){
        base = null;
        fruits = null;
        superFoods = null;
    }

    public void chooseBase(Base b){
        this.base = b;
    }
    public void chooseFruits(Fruits f){
        this.fruits = f;
    }
    public void chooseSuperFoods(SuperFoods s){
        this.superFoods = s;
    }


    public double calculateTotal(){
        double total = 0;
        if(base!=null){
            total += base.getPrice();
        }
        if(fruits!=null){
            total+= fruits.getPrice();
        }
        if(superFoods!=null){
            total += superFoods.getPrice();
        }

        return total;
    }

    public Base getBase() {
        return base;
    }
}
