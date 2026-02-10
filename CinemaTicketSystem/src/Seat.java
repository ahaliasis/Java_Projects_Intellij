public class Seat {
    private String seat;
    private double price;

    public Seat(String seat,double price){
        this.seat =seat;

        if(seat.equals("A")){
            this.price = 10.50;
        }
        if(seat.equals("B")){
            this.price = 9.30;
        }
        if(seat.equals("C")){
            this.price = 8.70;
        }
        if(seat.equals("D")){
            this.price = 7.20;
        }

    }

    public double getPrice() {
        return price;
    }
}
