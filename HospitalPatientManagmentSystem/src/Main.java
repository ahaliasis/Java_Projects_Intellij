import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;
public class Main{
    public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);
FinalClass finalClass = new FinalClass();
Patient selectedPatient = null;
ServicesArray servicesArray = new ServicesArray();
ExtraServicesArray extraServicesArray = new ExtraServicesArray();
PatientArray patientArray = new PatientArray();
int choice = 0;
boolean valid = false;
boolean isRunning = true;

while(isRunning){
    System.out.println("________________");
    System.out.println("Welcome to Saint Mary Hospital");
    System.out.println("____________________");
    System.out.println("1-Add Patient");
    System.out.println("2-Select Patient");
    System.out.println("3-Choose Service");
    System.out.println("4-Choose ExtraService");
    System.out.println("5-Change status");
    System.out.println("6-Show History");
    System.out.println("7-Total Cost");
    System.out.println("8-Exit");

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

    switch (choice){
        case 1:
            patientArray.addPatient();

            break;
        case 2:
            selectedPatient= patientArray.choosePatient();
            break;

        case 3:
            if(selectedPatient == null){
                System.out.println("Please select a patient first");
                break;
            }
            Services s = servicesArray.chooseServices(scanner);
            finalClass.chooseServices(s);

            selectedPatient.addToHistory("Services : " + s.getName());
           break;
        case 4:
            if(selectedPatient == null){
                System.out.println("Please select a patient first");
                break;
            }
            ExtraServices e = extraServicesArray.chooseExtraServices(scanner);
            finalClass.chooseExtraServices(e);

            selectedPatient.addToHistory("ExtraServices " + e.getName());
            break;


        case 5:
            if (selectedPatient == null) {
                System.out.println("Please select a patient first");
                break;
            }

            Patient updated = patientArray.changeStatusOfPatient();

            if (updated != null) {
                selectedPatient.addToHistory("Status changed to: " + updated.getStatus());
            }

            break;

        case 6:

         if(selectedPatient == null){
             System.out.println("You must select patient first");
             break;

         }
         selectedPatient.showHistory();
         break;

        case 7:
            if (selectedPatient == null) {
                System.out.println("Please select a patient first");
                break;
            }
            System.out.println("Your total Cost is: " + finalClass.calculateTotal());
            break;
        case 8:
            isRunning = false;
            System.out.println("Exiting...");
            break;





    }


}



    }}

