public class SingleRoom extends Room {
    //2. Class SingleRoom which extends Room such that:
    //    //• Each single room has a constructor that receives the roomNumber
    //    //• Implements method getPrice( ) defined in class Room by returning
    //    //200.

    public SingleRoom(int roomNumber) {
        super(roomNumber);
    }

    public double getPrice(){
        return 200;
    }
}
