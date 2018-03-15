import lt.kcs.utils.Skaiciavimai;

/**
 * Created by andriusbaltrunas on 3/14/2018.
 */
public class MyMainCalculator {

    public static void main(String[] args){

        boolean val = Skaiciavimai.isNumberNegative(12);

        if(val){
            System.out.println("neigiamas");
        }else {
            System.out.println("teigiamas");
        }
    }
}
