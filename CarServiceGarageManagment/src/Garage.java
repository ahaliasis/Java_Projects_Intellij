import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Garage {

    private Item service;
    private ArrayList<Item> extraServices = new ArrayList<>();
    private ArrayList<Owner> owners = new ArrayList<>();
    private ArrayList<Vehicle> vehicles = new ArrayList<>();

    private Scanner scanner = new Scanner(System.in);
    private Vehicle selectedVehicle;

    private double finalTotal = 0;
    private int choice = 0;
    private boolean valid = false;

    private ServiceStatus status;

    public Garage() {
        status = ServiceStatus.NOT_SELECTED;
    }


    public boolean registerNewVehicle() {

        if (status == ServiceStatus.LOCKED) {
            System.out.println("The service is locked");
            return false;
        }

        System.out.println("Name of Owner:");
        String name = scanner.nextLine();

        Owner owner = new Owner(name);
        owners.add(owner);

        System.out.println("Model of the Car:");
        String model = scanner.nextLine();

        System.out.println("Plate of the Car:");
        String plate = scanner.nextLine();

        Vehicle vehicle = new Vehicle(plate, model, owner);
        vehicles.add(vehicle);
        owner.addVehicle(vehicle);

        System.out.println("Vehicle registered successfully!");

        status = ServiceStatus.VEHICLE_REGISTERED;
        return true;
    }


    public void showVehicles() {
        for (Vehicle v : vehicles) {
            System.out.println(v.getModel() + " - " + v.getPlate() + " - " + v.getOwner().getName());
        }
    }


    public void showOwners() {
        for (Owner o : owners) {
            System.out.println(o.getName() + " owns " + o.getVehicles().size() + " vehicles");
        }
    }


    public void chooseVehicle() {

        if (vehicles.size() == 0) {
            System.out.println("No vehicles registered.");
            return;
        }

        for (int i = 0; i < vehicles.size(); i++) {
            Vehicle v = vehicles.get(i);
            System.out.println((i + 1) + " - " + v.getModel() + " - " + v.getPlate());
        }

        do {
            try {
                System.out.print("Choose vehicle: ");
                choice = scanner.nextInt();
                scanner.nextLine();
                valid = true;
            } catch (InputMismatchException e) {
                System.out.println("Only numbers");
                scanner.nextLine();
            }
        } while (!valid);

        selectedVehicle = vehicles.get(choice - 1);
        status = ServiceStatus.VEHICLE_SELECTED;

        System.out.println("Selected vehicle: " + selectedVehicle.getModel());
    }


    public boolean chooseService(Item s) {

        if (selectedVehicle == null) {
            System.out.println("You must select a vehicle first");
            return false;
        }

        if (status == ServiceStatus.LOCKED) {
            System.out.println("The service is locked");
            return false;
        }

        this.service = s;
        status = ServiceStatus.SERVICE_SELECTED;
        return true;
    }


    public boolean chooseExtraServices(Item e) {

        if (selectedVehicle == null) {
            System.out.println("You must select a vehicle first");
            return false;
        }

        if (status == ServiceStatus.LOCKED) {
            System.out.println("The service is locked");
            return false;
        }

        extraServices.add(e);
        status = ServiceStatus.EXTRA_SERVICES_SELECTED;
        return true;
    }


    public double calculateTotal() {

        if (selectedVehicle == null) {
            System.out.println("No vehicle selected");
            return 0;
        }

        double total = 0;

        if (service != null) {
            total += service.getPrice();
        }

        for (Item e : extraServices) {
            total += e.getPrice();
        }

        finalTotal = total;
        selectedVehicle.setLastServiceTotal(total);

        status = ServiceStatus.COMPLETED;

        return total;
    }


    public void lockService() {
        status = ServiceStatus.LOCKED;
        System.out.println("Service locked.");
    }

    public ServiceStatus getStatus() {
        return status;
    }
}
