import java.util.ArrayList;
public class Customer {
    private String name;
    private ArrayList <Table> tables = new ArrayList<>();


    public Customer(String name){
        this.name = name;
    }

    public void addTable(Table t){
        tables.add(t);
    }


    public String getName() {
        return name;
    }

    public ArrayList<Table> getTables() {
        return tables;
    }


}
