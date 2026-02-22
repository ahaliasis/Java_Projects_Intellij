public class FinalOrder {
    private ExtraServices extraServices;
    private RoomType roomType;
    private int nights;

    public FinalOrder(){
        extraServices = null;
        roomType = null;
    }

    public void chooseRoomType(RoomType r){
        this.roomType = r;
    }
    public void chooseExtraServices(ExtraServices e){
        this.extraServices = e;
    }
    public void setNights(int nights){
        this.nights = nights;
    }
    public int getNights(){
        return nights;
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public double calculateTotal(){
        double total = 0;

        if(roomType != null){
            total += roomType.getPrice() * nights;
        }

        if(extraServices != null){
            total += extraServices.getPrice();
        }

        return total;
    }

}
