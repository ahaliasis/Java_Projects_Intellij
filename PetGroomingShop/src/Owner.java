import java.util.ArrayList;
public class Owner {
    private String Owner_name;
    private ArrayList <Pet> pets = new ArrayList<>();


    public Owner(String owner_name){
        this.Owner_name = owner_name;
    }

    public void addPet(Pet p){
        pets.add(p);
    }
    public ArrayList <Pet> getPets(){
        return pets;
    }

    public String getName() {
        return Owner_name;
    }
}
