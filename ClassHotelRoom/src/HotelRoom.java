
public class HotelRoom {
	
	private int roomNumber;
	private boolean booked;
	private String guestName;
	private double pricePerNight;
	
	public HotelRoom(int roomNumber,double pricePerNight) {
		this.roomNumber = roomNumber;
		this.pricePerNight = pricePerNight;
		this.booked = false;
		this.guestName = null;
	}
	public void book(String name) {
		if(booked == false) {
			guestName = name;
			booked = true;
			System.out.println("H kratisi egine epitixws");
		}else {
			System.out.println("To dwmatio einai kratimeno!");
		}
	}
	public void checkOut(String name) {
		if(booked && guestName != null && guestName.equals(name)) {
			booked = false ;
			guestName = null;
			System.out.println("H kratisi afairethike epitixws");
		}else {
			System.out.println("To dwmatio einai adeio");
		}
		
	}
	public double totalCost(int nights) {
		return nights * pricePerNight;
	}
	public void printStatus() {
		System.out.println("Arithmos dwmatiou: " + roomNumber);
		System.out.println("Onoma pelati: " + guestName);
		System.out.println("timi ana nixta: " + pricePerNight);
		
	}
	
	
	

}
