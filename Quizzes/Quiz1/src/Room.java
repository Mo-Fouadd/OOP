public abstract class Room {
    //1. Class Room is abstract, each room has:
    //    //• A private integer variable roomNumber
    //    //• A private boolean variable reserved representing whether the room is
    //    //reserved or not.
    //    //• A constructor that receives the roomNumber for initialization of the
    //    //roomNumber instance variable.
    //    //• Accessor method for all instance variables.
    //    //• Mutator method for reserved.
    //    //• An abstract method: public abstract double getPrice( )
    private int roomNumber;
    private boolean reserved;
    public Room(int roomNumber){
        this.roomNumber=roomNumber;
    }

    public void setReserved(boolean reserved) {
        this.reserved = reserved;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public boolean isReserved() {
        return reserved;
    }

    public abstract double getPrice();
}
