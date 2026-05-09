import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Grooming {

    private Scanner scanner = new Scanner(System.in);

    private ArrayList<Item> extraServices = new ArrayList<>();
    private ArrayList<Item> services = new ArrayList<>();
    private ArrayList<Owner> owners = new ArrayList<>();
    private ArrayList<Pet> pets = new ArrayList<>();

    private GroomingStatus status;
    private Pet selectedPet;

    private int choice = 0;
    private boolean valid = false;
    private double finalTotal = 0;

    public Grooming() {
        status = GroomingStatus.UNLOCKED;
    }


    public boolean registerPet() {

        
        if (status == GroomingStatus.LOCKED) {
            System.out.println("The status is locked");
            return false;
        }


        if (status == GroomingStatus.UNLOCKED
                || status == GroomingStatus.COMPLETED
                || status == GroomingStatus.PET_REGISTERED) {

            System.out.println("Owner name: ");
            String owner_Name = scanner.nextLine();

            Owner owner = new Owner(owner_Name);
            owners.add(owner);

            System.out.println("Pet name: ");
            String name = scanner.nextLine();

            System.out.println("Dog breed: ");
            String dog_breed = scanner.nextLine();

            Pet pet = new Pet(name, dog_breed, owner);
            pets.add(pet);
            owner.addPet(pet);

            System.out.println("Pet registered successfully");

            status = GroomingStatus.PET_REGISTERED;
            return true;
        }

        return false;
    }


    public boolean selectServices(Item s) {
        // LOCK CHECK - gatekeeper
        if (status == GroomingStatus.LOCKED) {
            System.out.println("The grooming is locked");
            return false;
        }

        if (selectedPet == null) {
            System.out.println("You must select a pet first");
            return false;
        }


        if (status == GroomingStatus.PET_REGISTERED
                || status == GroomingStatus.PET_SELECTED
                || status == GroomingStatus.SERVICE_SELECTED
                || status == GroomingStatus.EXTRASERVICE_SELECTED) {

            services.add(s);
            status = GroomingStatus.SERVICE_SELECTED;
            return true;
        }

        return false;
    }


    public boolean selectExtraServices(Item e) {
        // LOCK CHECK - gatekeeper
        if (status == GroomingStatus.LOCKED) {
            System.out.println("The status is locked");
            return false;
        }

        if (selectedPet == null) {
            System.out.println("You must select a pet first");
            return false;
        }


        if (status == GroomingStatus.PET_REGISTERED
                || status == GroomingStatus.PET_SELECTED
                || status == GroomingStatus.SERVICE_SELECTED
                || status == GroomingStatus.EXTRASERVICE_SELECTED) {

            extraServices.add(e);
            status = GroomingStatus.EXTRASERVICE_SELECTED;
            return true;
        }

        return false;
    }


    public void choosePet(Scanner scanner) {

        if (status == GroomingStatus.LOCKED) {
            System.out.println("The grooming is locked");
            return;
        }

        if (pets.isEmpty()) {
            System.out.println("No pets registered, add pets first");
            return;
        }

        for (int i = 0; i < pets.size(); i++) {
            Pet p = pets.get(i);
            System.out.println((i + 1) + " - " + p.getName() + " - " + p.getOwner().getName());
        }

        do {
            try {
                System.out.println("Choice: ");
                choice = scanner.nextInt();
                scanner.nextLine();
                valid = true;

            } catch (InputMismatchException e) {
                System.out.println("Only numbers");
                scanner.nextLine();
                valid = false;
            }

        } while (!valid);

        selectedPet = pets.get(choice - 1);


        status = GroomingStatus.PET_SELECTED;

        System.out.println("Pet selected: " + selectedPet.getName());
    }


    public double calculateTotal() {
        // FIX 6: Added lock check for consistency
        if (status == GroomingStatus.LOCKED) {
            System.out.println("The grooming is locked");
            return 0;
        }

        if (selectedPet == null) {
            System.out.println("Select pet first");
            return 0;
        }

        double total = 0;

        for (Item s : services) {
            total += s.getPrice();
        }

        for (Item e : extraServices) {
            total += e.getPrice();
        }

        finalTotal = total;
        selectedPet.setLast_checkUp(total);


        services.clear();
        extraServices.clear();
        selectedPet = null;

        status = GroomingStatus.COMPLETED;

        return total;
    }


    public void showOwners() {
        for (Owner o : owners) {
            System.out.println(o.getName() + " owns " + o.getPets().size() + " pets");
        }
    }


    public void showPets() {
        for (Pet p : pets) {
            System.out.println(p.getOwner().getName() + " - " + p.getName() + " - " + p.getDog_breed());
        }
    }


    public void lockStatus() {
        status = GroomingStatus.LOCKED;
        System.out.println("Status locked");
    }

    public void unlockStatus() {
        status = GroomingStatus.UNLOCKED;
        System.out.println("Status unlocked");
    }

    public GroomingStatus getStatus() {
        return status;
    }
}