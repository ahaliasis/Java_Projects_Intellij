public class Pet {
    private String name;
    private String dog_breed;
    private Owner owner;
    private double last_checkUp = 0;


    public Pet(String name,String dog_breed, Owner owner){
        this.name = name;
        this.dog_breed = dog_breed;
        this.owner = owner;
    }

    public void setLast_checkUp(double total) {
        this.last_checkUp = last_checkUp;
    }

    public double getLast_checkUp() {
        return last_checkUp;
    }

    public Owner getOwner() {
        return owner;
    }

    public String getName() {
        return name;
    }

    public String getDog_breed() {
        return dog_breed;
    }

}
