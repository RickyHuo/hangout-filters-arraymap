package sina;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by huochen on 2017/5/25.
 */
public class MapTest {
    public static void main(String[] args){
        Map<String, String> a = new HashMap<String, String>();
        ArrayList<Map<String, String>> c = new ArrayList<Map<String, String>>();
        a.put("Hello", "world");
        c.add(a);
        Map<String, String> b = a;
        b.put("python", "java");
        c.add(b);
        System.out.println(c);
    }
}
