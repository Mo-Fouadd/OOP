public class DoubleRoom extends Room {
    //3. Class DoubleRoom which extends Room such that:
    //    //• Each single room has a constructor that receives the roomNumber
    //    //• Implements method getPrice( ) defined in class Room by returning
    //    //300.

    public DoubleRoom(int roomNumber) {
        super(roomNumber);
    }

    public double getPrice() {
        return 300;
    }
}
