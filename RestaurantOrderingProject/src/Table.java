public class Table {
    private int peopleTotal;
    private String location;
    private Customer customer;
    private double lastTotal;

    public Table(int peopleTotal, String location,Customer customer){
        this.peopleTotal = peopleTotal;
        this.location = location;
        this.customer = customer;
    }

    public void setLastTotal(double total) {
        this.lastTotal = lastTotal;
    }

    public double getLastTotal() {
        return lastTotal;
    }

    public Customer getCustomer() {
        return customer;
    }

    public int getPeopleTotal() {
        return peopleTotal;
    }

    public String getLocation() {
        return location;
    }
}
