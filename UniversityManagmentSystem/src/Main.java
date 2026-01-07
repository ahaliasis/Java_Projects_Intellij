import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.InputMismatchException;
public class Main{
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
boolean valid1 = false;
boolean valid2 = false;

boolean isRunning = true;
int n = 0;

do {

try {
    System.out.print("How many you wish to include? ");
    n = scanner.nextInt();
    scanner.nextLine();
    valid1 = true;
}catch (InputMismatchException e){
    System.out.println("Only numbers!");
    scanner.nextLine();
    valid1 = false;
}
}while(!valid1);
Person[] people = new Person[n];


int i = 0;

while(isRunning){
    System.out.println("------MENU------");
    System.out.println("1-Add student");
    System.out.println("2-Add professor");
    System.out.println("3-Add Stuff");
    System.out.println("4-Show all");
    System.out.println("5-Total Cost");
    System.out.println("6-Exit");
    int choice = 0;
   do {
       try {
           System.out.print("Choice: ");
           choice = scanner.nextInt();
           scanner.nextLine();
           valid2 = true;
       }catch (InputMismatchException e){
           System.out.println("Only numbers");
           scanner.nextLine();
           valid2 = false;
       }
   }while(!valid2);

   switch(choice){
       case 1:
           System.out.print("Name student: ");
           String name = scanner.nextLine();
           System.out.print("id:");
           int id = scanner.nextInt();
           System.out.println("Fees: ");
           double fees = scanner.nextDouble();

           people[i] = new Student(name,id,fees);

           i++;
           break;

       case 2:
           System.out.print("Name Professor: ");
           String name2 = scanner.nextLine();
           System.out.print("id:");
           int id2 = scanner.nextInt();
           System.out.println("Salary: ");
           double salary = scanner.nextDouble();

           people[i] = new Professor(name2,id2,salary);
           i++;
           break;

       case 3:
           System.out.print("Name staff: ");
           String name3 = scanner.nextLine();
           System.out.print("id:");
           int id3 = scanner.nextInt();
           System.out.println("Salary: ");
           double salary2 = scanner.nextDouble();

           people[i] = new Staff(name3,id3,salary2);

           i++;
           break;

       case 4:

           for(int j = 0; j < i;j++){
               people[j].printInfo();
               System.out.println("--------");

           }
           break;

       case 5:
           double sum = 0;
           for(int m = 0 ; m < i; m++){
               sum += people[m]. calculateMonthlyCost();
           }
           System.out.println("Total cost = " + sum);
           break;

       case 6:
           isRunning = false;
           System.out.println("Exiting....");
           break;

       default:
           System.out.println("Give a valid choice");
           break;


   }
   }













    }}
