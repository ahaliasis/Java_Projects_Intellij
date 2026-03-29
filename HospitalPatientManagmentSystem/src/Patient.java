import java.util.ArrayList;
public class Patient {
    private String name;
    private ArrayList <String> names = new ArrayList<>();
    private Priority priority;
    private Status status;


    public Patient(String name){
        this.name = name;
    }

    public void addToHistory(String entry){
        names.add(entry);
    }
    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void showHistory(){
        if(names.isEmpty()){
            System.out.println("No names available");
            return;
        }
        System.out.println("History for: " + name);
        for(int i = 0 ; i < names.size(); i++ ){
            System.out.println((i + 1) + " - " + names.get(i));
        }

    }

    public Status getStatus() {
        return status;
    }
}
