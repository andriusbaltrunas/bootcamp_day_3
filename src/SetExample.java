import java.util.*;

/**
 * Created by andriusbaltrunas on 3/14/2018.
 */
public class SetExample {

    public static void main(String[] args) {

       // Set<Integer> hashSet = new HashSet<>();
        //Set<Integer> numbers = new LinkedHashSet<>();
        Set<Integer> numbers = new TreeSet<>();

        numbers.add(123);
        numbers.add(3);
        numbers.add(13);
        numbers.add(12);
        numbers.add(1);
        numbers.add(123);
        numbers.add(123);
        System.out.println("ilgis " + numbers.size());

        for (Integer a :numbers){
            System.out.println(a);
        }

    }
}
