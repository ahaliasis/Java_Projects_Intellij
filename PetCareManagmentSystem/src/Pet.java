import java.util.ArrayList;
public class Pet {
    private String name;
    private ArrayList<String> history = new ArrayList<>();

    public Pet(String name){
        this.name = name;

    }

    public void addToHistory(String entry){
        history.add(entry);
    }

    public String getName() {
        return name;
    }

    public void showHistory(){
        if(history.isEmpty()){
            System.out.println("No history yet");
        return;
        }
        System.out.println("History for " + name + ":");

        for(int i = 0; i < history.size();i++){
            System.out.println((i+1) + ". " + history.get(i));
        }

    }
}
