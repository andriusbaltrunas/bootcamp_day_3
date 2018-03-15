import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by andriusbaltrunas on 3/14/2018.
 */
public class MapExample {

    public static void main(String[] args) {

        Map<String, String> names = new TreeMap<>();

        names.put("Pirmas", "Jonas");
        names.put("Trecias", "Antanas");
        names.put("Antras", "Andrius");
        names.put("Ketvirtas", "Jonas");
        names.put("Penktas", "Bla");
        names.put("Pirmas", "Trampampam");

        for (String name : names.keySet()){
            System.out.println(name + " " + names.get(name));
        }

    }
}
