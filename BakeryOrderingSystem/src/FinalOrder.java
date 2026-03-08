public class FinalOrder {
    private Sweet sweet;
    private  Size size;
    private  ExtraToppings extraToppings;

    public FinalOrder(){
        size = null;
        sweet = null;
        extraToppings = null;
    }

    public void chooseSweet(Sweet s){
        this.sweet = s;
    }
    public void chooseSize(Size i){
        this.size = i;

    }
    public void chooseExtraToppings(ExtraToppings e){
        this.extraToppings = e;
    }

    public Sweet getSweet() {
        return sweet;
    }

    public double calculateTotal(){
        double total = 0;

        if(sweet != null){
            total += sweet.getPrice();
        }
        if(size != null){
            total += size.getPrice();
        }
        if(extraToppings != null){
            total += extraToppings.getPrice();
        }

        return total;


    }

}
