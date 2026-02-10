public class Movie {
    private String movieName;
    private double price;

    public Movie(String movieName, double price){
        this.movieName = movieName;

        if(movieName.equals("Amnet")){
            this.price = 7.00;
        }
        if(movieName.equals("Fall Guy")){
            this.price = 8.00;
        }
        if(movieName.equals("Annabelle")){
            this.price = 6.40;
        }
        if(movieName.equals("Zootopia 2")){
            this.price = 5.50;
        }

    }

    public double getPrice() {
        return price;
    }

    public String getMovieName(){
        return movieName;
    }

}
