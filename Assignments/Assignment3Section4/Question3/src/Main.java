import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<Integer>(5);

        Random r= new Random();
        for (int i = 1; i <= 5; i++)
            arr.add(r.nextInt(15) );

        // Printing elements
        System.out.println(arr);
        sort(arr);
        System.out.println(arr);


    }
    public static void sort(ArrayList<Integer> list){
        Collections.sort(list);
    }
}