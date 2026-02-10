public class Rofima {
    private String poto;
    private String size;
    private double price;

    public Rofima(String poto, String size,double price ){
        this.poto = poto;
        this.price = price;

        if(poto.equals("Espresso") && size.equals("normal")){
            this.price = 2.40;
        }
        if(poto.equals("Espresso") && size.equals("large")){
            this.price = 3.40;
        }
        if(poto.equals("Latte") && size.equals("normal")){
           this.price = 4.30;

        }
        if(poto.equals("Latte") && size.equals("Large")){
            this.price = 5.30;

        }
        if(poto.equals("Chocolate") && size.equals("normal")){
            this.price = 3.80;
        }
        if(poto.equals("Chocolate") && size.equals("Large")){
            this.price = 5.00;
        }




    }

    public double getPrice() {
        return price;
    }


}
