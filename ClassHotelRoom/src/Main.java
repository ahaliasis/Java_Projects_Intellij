import java.util.Scanner;
import java.util.InputMismatchException;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int timi1 = 0;
		double timi2 = 0;
		boolean valid1 = false;
		boolean valid2 = false;
		boolean isRunning = true;
		
		do {
			
			try {
				System.out.println("Dwse arithmo dwmatioy: ");
			    timi1 = scanner.nextInt();
				valid1 = true;
			}catch(InputMismatchException e) {
				System.out.println("Dwse akeraio arithmo");
				scanner.nextLine();
				
			}
		}while(!valid1);
		
	   do {
		   try {
			   System.out.println("Dwse timi ana nixta: ");
			   timi2 = scanner.nextDouble();
			   valid2 = true;
		   }catch(InputMismatchException e) {
			   System.out.println("Dwse dekadiko arithmo");
			   scanner.nextLine();
			   
		   }
	   }while(!valid2);
	   
	   HotelRoom room = new HotelRoom(timi1,timi2);
	   
	   while(isRunning) {
		   
		   
		   System.out.println("1-book");
		   System.out.println("2-checkout");
		   System.out.println("3-cost");
		   System.out.println("4-status");
		   System.out.println("5-exit");
		   
		   int choice = scanner.nextInt();
		   scanner.nextLine();
		   
		   switch(choice) {
		   
		   case 1:
			   System.out.println("Dwse onoma gia kratisi: ");
			   String onoma = scanner.nextLine();
			   room.book(onoma);
			   break;
			   
		   case 2:
			   System.out.println("Dwse onoma gia checkout: ");
			   String onoma2 = scanner.nextLine();
			   room.checkOut(onoma2);
			   break;
			   
			   
		   case 3: 
			   System.out.println("Poses meres tha meineis: ");
			   int meres = scanner.nextInt();
			   System.out.println("Tha plirwseis: " + room.totalCost(meres));
			   break;
			   
		   case 4:
			   room.printStatus();
			   break;
			   
		   case 5:
			   isRunning= false;
			   System.out.println("Exiting the program...");
			   break;
			   
		default:
			System.out.println("Dwse egiri epilogi!");
			break;
			
		   
		   
		   
		   
		   }
		   
		   
		   
		   
		   
		   
		   
		   
	   }
	   
	
		
		
		
		
		
		
		
		
		

	}

}
