public class RoomType {
    private String roomType;
    public double price;

    public RoomType(String roomType, double price){
        this.roomType = roomType;

        if(roomType.equals("Family")){
            this.price = 240;
        }
        if(roomType.equals("Double")){
            this.price = 120;
        }
        if(roomType.equals("Single")){
            this.price = 80;
        }
        if(roomType.equals("Triple")){
            this.price = 180;
        }
        if(roomType.equals("Suite")){
            this.price = 500;
        }
    }

    public double getPrice() {
        return price;
    }

    public String getRoomType() {
        return roomType;
    }
}
