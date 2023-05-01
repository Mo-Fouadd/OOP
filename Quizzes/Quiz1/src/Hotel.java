import java.util.ArrayList;

public class Hotel {

    //4. Class Hotel, each hotel has:
    //    • A private String variable name
    //    • A private double variable income
    //    • A private Arraylist of type Room that named rooms representing the
    //    hotel rooms
    //• A constructor that receives the name, rooms for initialization of
    //    instance variables
    //    • Accessor methods for all instance variables.
    //    • A method public boolean isFull( ) which returns true if all the hotel
    //    rooms are reserved , otherwise returns false.
    //    • A method public boolean reserveRoom(Room room, int days)
    //    ,which if room is not reserved , set the reserved variable of room to
    //    true, increment the income variable with the price of room based on
    //    number of days and then returns true otherwise returns false.
    //    • A method that returns the number of empty rooms
    //    • Override the toString method in class Object to return the name of
    //    hotel and total number of rooms and the number of empty rooms
    private String name;
    private double income;
    ArrayList <Room> rooms;

    public Hotel(String name, ArrayList<Room> rooms) {
        this.name = name;
        this.rooms = rooms;
    }

    public String getName() {
        return name;
    }

    public double getIncome() {
        return income;
    }

    public ArrayList<Room> getRooms() {
        return rooms;
    }
    public boolean isFull( ){

        for (Room a: rooms ) {
            if(!a.isReserved()) return false;

        }
        return true;
    }
    public boolean reserveRoom(Room room, int days){
        if(room.isReserved()) return false;
        room.setReserved(true);
        income+= room.getPrice()*days;
        return true;
    }
    public int emptyRooms(){
        int n=0;
        for (Room a: rooms ) {
            if(!a.isReserved()) n++;
        }
        return n;
    }

    @Override
    public String toString() {
        return "Name= " + name + "\nRooms= " + rooms.size() + "\nEmpty Rooms= " + emptyRooms() +"\n" ;
    }
}
