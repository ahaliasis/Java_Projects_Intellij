import java.util.Scanner;
import java.util.InputMismatchException;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		String onoma = "";
		int ipoloipo = 0;
		int pin = 1234;
		boolean valid = false;
		boolean valid2 = false;
		boolean valid3 = false;
		boolean isRunning = true;
		
		do {
		    System.out.print("Dwse onoma katoxou: ");
		    onoma = scanner.nextLine();
		} while (onoma.trim().isEmpty());

		
		do {
			try {
				System.out.println("Dwse balance logariasmou: ");
				ipoloipo = scanner.nextInt();
				scanner.nextLine();
				valid2 = true;
			}catch(InputMismatchException e) {
				System.out.println("dwse akeraio arithmo");
				scanner.nextLine();
			}
		}while(!valid2);
		
		do {
			try {
				System.out.println("Dwse pin: ");
				pin = scanner.nextInt();
				scanner.nextLine();
				if(pin == 1234) {
					
				System.out.println("Epitixis sindesi");
				valid3 = true;
				}else {
					System.out.println("lathos pin!");
					valid3 = false;
				}
			}catch(InputMismatchException e) {
				System.out.println("dwse arithmous");
				scanner.nextLine();
			}
		}while(!valid3);
		
	
		
		ATMAccount atm = new ATMAccount(onoma,ipoloipo);
		
		while(isRunning) {
			
			System.out.println("1-login");
			System.out.println("2-logout");
			System.out.println("3-katathesi");
			System.out.println("4-analipsi");
			System.out.println("5-printStatus");
			System.out.println("6-eksodos");
			
			int choice = scanner.nextInt();
			scanner.nextLine();
			
			switch(choice) {
			
			case 1:
			
				atm.login();
				break;
				
			case 2:
				atm.logout();
				break;
				
			case 3:
				System.out.println("ti poso theleis na kaneis katathesi? ");
				int poso = scanner.nextInt();
				scanner.nextLine();
				atm.deposit(poso);
				break;
				
			case 4:
				System.out.println("Ti poso theleis na kaneis analipsi? ");
				int poso2 = scanner.nextInt();
				scanner.nextLine();
			    atm.withdraw(poso2);
			    break;
			    
			case 5:
				atm.printStatus();
				break;
				
			case 6:
				isRunning= false;
				System.out.println("exiting....");
				break;
				
			default:
				System.out.println("Dwse egiri epilogi");
				break;
				
				
			
			
			}
			
		}
		
		
		
		
		
	}

}
