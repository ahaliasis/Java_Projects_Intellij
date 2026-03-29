import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;
public class PatientArray {
    Scanner scanner = new Scanner(System.in);
    ArrayList <Patient> patients = new ArrayList<>();
    int choice = 0;
    boolean valid = false;
    int choice1 = 0;
    boolean valid1 = false;


    public void addPatient() {
        System.out.print("Name of Patient: ");
        String name = scanner.nextLine();
        Patient p = new Patient(name);

        // Priority
        Priority priority = null;
        boolean validPriority = false;

        do {
            System.out.println("Select priority: LOW, MEDIUM, HIGH, CRITICAL");
            String pr = scanner.nextLine().toUpperCase();

            try {
                priority = Priority.valueOf(pr);
                validPriority = true;
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid priority, try again.");
            }

        } while (!validPriority);

        p.setPriority(priority);

// Status
        Status status = null;
        boolean validStatus = false;

        do {
            System.out.println("Select status: ADMITTED, UNDER_TREATMENT, RECOVERING, DISCHARGED");
            String st = scanner.nextLine().toUpperCase();

            try {
                status = Status.valueOf(st);
                validStatus = true;
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid status, try again.");
            }

        } while (!validStatus);

        p.setStatus(status);

        patients.add(p);
        System.out.println(name + " added");



    }

    public Patient changeStatusOfPatient(){


            if (patients.isEmpty()) {
                System.out.println("No patients available");
                return null;
            }

            // Δείξε όλους τους ασθενείς
            for (int i = 0; i < patients.size(); i++) {
                System.out.println((i + 1) + " - " + patients.get(i).getName());
            }

            // Διάλεξε ασθενή
            int choice = 0;
            boolean valid = false;

            do {
                try {
                    System.out.print("Choice: ");
                    choice = scanner.nextInt();
                    scanner.nextLine();
                    valid = true;
                } catch (InputMismatchException e) {
                    System.out.println("Only numbers");
                    scanner.nextLine();
                }
            } while (!valid);

            Patient selected = patients.get(choice - 1);

            // Αλλαγή status
            Status newStatus = null;
            boolean validStatus = false;

            do {
                System.out.println("New status: ADMITTED, UNDER_TREATMENT, RECOVERING, DISCHARGED");
                String st = scanner.nextLine().toUpperCase();

                try {
                    newStatus = Status.valueOf(st);
                    validStatus = true;
                } catch (IllegalArgumentException e) {
                    System.out.println("Invalid status, try again.");
                }

            } while (!validStatus);

            selected.setStatus(newStatus);
            System.out.println("Status updated for " + selected.getName());

            return selected;
        }






    public Patient choosePatient(){
        if(patients.isEmpty()){
            System.out.println("No patients available");
            return null;
        }
        for(int i = 0; i < patients.size(); i++){
            System.out.println((i+1) + " - " + patients.get(i).getName());
        }
        do{
            try{
                System.out.print("Choice: ");
                choice = scanner.nextInt();
                scanner.nextLine();
                valid = true;

            }catch (InputMismatchException e){
                System.out.println("Only numbers");
                scanner.nextLine();
                valid = false;
            }

        }while(!valid);
        return patients.get(choice -1);
    }
}
