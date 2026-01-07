public class Student extends Person {
    private double scholarhsip;

    public Student(String name, int id, double scholarhsip) {
        super(name, id);
        this.scholarhsip = scholarhsip;
    }

    @Override
    public double  calculateMonthlyCost() {


        return scholarhsip;
    }

    @Override
    public void printInfo() {
        System.out.println("name: " + getName());
        System.out.println("id: " + getId());
        System.out.println("ScholarShip" + scholarhsip);

    }
}