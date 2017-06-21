package sina;

//import org.json.*;
import java.util.Arrays;
import java.util.List;

/**
 * Unit test for simple ArrayMap.
 */
public class AppTest {
    public static void main( String[] args ) {
        String b = "[{'a': 'b'}, {'a': 'c'}]";

        String c = b.substring(1, b.length()-1);
        List a = Arrays.asList(c.split(","));


        String s = a.get(0).toString();

        System.out.println(s);

       // ArrayList f = new ArrayList(b.split(","));\

    }
}
