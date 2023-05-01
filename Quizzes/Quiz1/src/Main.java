import java.util.ArrayList;

public class Main {
    //Implement a simple hotel reservation system with the following 4 classes: class
    //Room, class SingleRoom, class DoubleRoom and class Hotel.
    //Write a Test class, Create an Hotel object with 3 single rooms and 3 double
    //rooms, test your code by using all methods in class Hotel.
    public static void main(String[] args) {
        ArrayList<Room> rooms= new ArrayList<>();
        for (int i = 0; i <3; i++) {
            rooms.add(new SingleRoom(i));
        }
        for (int i = 3; i <6; i++) {
            rooms.add(new DoubleRoom(i));
        }
        Hotel hotel= new Hotel("Beach Hotel",rooms);
        System.out.println("is full? "+hotel.isFull());
        System.out.println("empty rooms = " + hotel.emptyRooms());
        for (int i = 0; i < 6; i++) {
            hotel.reserveRoom(hotel.rooms.get(i),i+1);
            if(i==3) System.out.println("4th iteration, empty rooms = " + hotel.emptyRooms());
        }
        System.out.println("\nAfter loop\n");
        System.out.println("is full? "+hotel.isFull());
        System.out.println("empty rooms = " + hotel.emptyRooms()+"\n\n");
        System.out.println(hotel);

    }
}