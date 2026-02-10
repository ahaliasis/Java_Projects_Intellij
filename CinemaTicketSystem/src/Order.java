public class Order {
    private Movie movie;
    private TimeScreen timeScreen;
    private Seat seat;
     private boolean hasDiscount;

    public Order(){
        movie = null;
        timeScreen = null;
        seat = null;
    }
    public void chooseMovie(Movie m){
        this.movie = m;
    }
    public void chooseSeat(Seat s){
        this.seat = s;
    }
    public void chooseTimeScreen(TimeScreen t){
        this.timeScreen = t;
    }

  public void setDiscount(boolean discount){
        this.hasDiscount = discount;
  }

  public Movie getMovie(){
        return movie;
  }
    public double calculateTotal(){
        double total = 0;

        if(seat!=null){
            total += seat.getPrice();
        }
        if(movie != null){
            total += movie.getPrice();
        }

        if(hasDiscount){
            total = total * 0.80;
        }


        return total;
    }



}
