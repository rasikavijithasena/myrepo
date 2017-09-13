/**
 * Created by hsenid on 9/12/17.
 */
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

public class DiamondOperator {


    public static void main(String[] args){

        List<String> names = new ArrayList<>();
        names.add("Kamal");
        names.add("Mala");
        names.add("Kamala");
        names.add("Saman");

        Iterator i = names.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }


    }


}
