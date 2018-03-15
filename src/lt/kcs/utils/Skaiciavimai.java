package lt.kcs.utils;

/**
 * Created by andriusbaltrunas on 3/14/2018.
 */
public class Skaiciavimai {

    public static boolean isNumberNegative(int numb) {
        boolean val = false;
        if (numb < 0) {
            val = true;
        }
        System.out.println(val);
        return val;
    }

    public static boolean isEven(int numb) {
        return numb % 2 == 0;
    }
}
