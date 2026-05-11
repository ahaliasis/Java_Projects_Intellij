import java.util.ArrayList;
import java.util.Scanner;
public class Order {
    Scanner scanner = new Scanner(System.in);
    private ArrayList <Item> menus = new ArrayList<>();
    private ArrayList <Item> extraMenus = new ArrayList<>();
    private ArrayList <Table> tables = new ArrayList<>();
    private ArrayList <Customer> customers = new ArrayList<>();

    private Table selectedTable;
    private TableStatus status;
    int choice = 0;
    double finalTotal = 0;

    public Order(){
        status = TableStatus.NOT_STARTED;
    }

    public void registerTable(){

        System.out.println("Customer name: ");
        String name = scanner.nextLine();

        Customer customer = new Customer(name);
        customers.add(customer);

        System.out.println("Reservation for how many people: ");
        int peopleTotal = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Inside or outside: ");
        String location = scanner.nextLine();

        Table table = new Table(peopleTotal,location,customer);
        tables.add(table);
        customer.addTable(table);

        status = TableStatus.TABLE_REGISTERED;

        System.out.println("Table registered");


    }

    public boolean chooseTable(Scanner scanner){
        if(tables.isEmpty()){
            System.out.println("No tables available");
        return false;
        }
        if(status == TableStatus.NOT_STARTED) {
            System.out.println("You must register a table first");
            return false;
        }

        for(int i = 0 ; i < tables.size() ;i++){
            System.out.println((i+1) + " - " + tables.get(i).getCustomer().getName() + " - " + tables.get(i).getLocation() + " - number of people: " + tables.get(i).getPeopleTotal());
        }
        choice = InputUtils.readInt("Choice: ");

        menus.clear();;
        extraMenus.clear();

        selectedTable = tables.get(choice  -1);
        status = TableStatus.TABLE_SELECTED;

        System.out.println("you selected " + selectedTable.getCustomer().getName() + " - " + selectedTable.getLocation() + " - number of people: " + selectedTable.getPeopleTotal());

        return  true;
    }

    public void seeAllTables(){

        if(tables.isEmpty()){
            System.out.println("No tables available");
            return ;
        }

        for(Table t: tables){
            System.out.println(t.getCustomer().getName() +  " - " + t.getLocation() + " - " + t.getPeopleTotal());
        }

    }
    public void seeAllCustomer(){
        if(customers.isEmpty()){
            System.out.println("No customers available");
            return;
        }
        for(Customer c : customers){
            System.out.println(c.getName() + " has " + c.getTables().size() + " tables");
        }
    }

    public boolean chooseMenu(Item m){
        if (selectedTable == null) {
            System.out.println("You must select a table first");
            return false;
        }
        if (status == TableStatus.ORDER_LOCKED) {
            System.out.println("The order is locked");
            return false;
        }

        menus.add(m);
        status = TableStatus.MENU_SELECTED;
        System.out.println("Menu added");
        return true;
    }


    public boolean chooseExtraMenu(Item e){
        if (selectedTable == null) {
            System.out.println("You must select a table first");
            return false;
        }
        if (status == TableStatus.ORDER_LOCKED) {
            System.out.println("The order is locked");
            return false;
        }

        extraMenus.add(e);
        status = TableStatus.EXTRA_MENU_SELECTED;
        System.out.println("Extra menu added");
        return true;
    }

    public double calculateTotal(){
        if(status == TableStatus.ORDER_LOCKED){
            return finalTotal;
        }
        double total = 0;
        if(menus != null){
            for(Item m : menus){
                total += m.getPrice();
            }
        }
        if(extraMenus !=null){
            for(Item e: extraMenus){
                total+=e.getPrice();
            }
        }

        finalTotal = total;
        status = TableStatus.ORDER_COMPLETED;
        return total;
    }

    public void lockOrder(){
        status = TableStatus.ORDER_LOCKED;
    }

    public TableStatus getStatus() {
        return status;
    }

}
