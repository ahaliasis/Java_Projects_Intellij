public class Staff extends Person{
    private double salary;

    public Staff(String name, int id, double salary) {
        super(name, id);
        this.salary = salary;
    }

    @Override
    public double  calculateMonthlyCost() {


        return salary;
    }

    @Override
    public void printInfo() {
        System.out.println("name: " + getName());
        System.out.println("id: " + getId());
        System.out.println("Salary" + salary);

    }
}
