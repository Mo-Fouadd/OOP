import java.util.ArrayList;
import java.lang.Integer; // imported this to be able to return null
public class Main {
    public static void main(String[] args) {


    }

    public static Integer max(ArrayList<Integer> list) {
        if(list==null ||list.size()==0 ) return null;

            int max=0;
            for (int i = 0; i < list.size(); i++) {
                if(list.get(i)>max) max= list.get(i);
            }
        return max;
    }
}
