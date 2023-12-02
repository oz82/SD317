import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapApp1 {
    public static void main(String[] args) {
        HashMap<String, String> plakalar = new HashMap<>();
        plakalar.put("Ankara", "06");
        plakalar.put("İstanbul", "34");
        plakalar.put("İzmir", "35");
        plakalar.put("Eskişehir", "26");
        //plakalar.put("Ankara", "99");
        //System.out.println(plakalar.containsKey("Konya"));
        //System.out.println(plakalar.size());
        //System.out.println(search(plakalar, "İzmir", "35"));
        //System.out.println(plakalar.get("Ankara"));
        //plakalar.remove("Ankara", "99");

        plakalar.replace("Ankara", "06", "66");
        printMap(plakalar);
    }

    private static void printMap(HashMap<String, String> map) {
        Set keySet = map.keySet();
        Iterator iter = keySet.iterator();
        while (iter.hasNext()) {
            String key = (String) iter.next();
            String value = map.get(key);
            System.out.println(key + "\t>>\t" + value);
        }
    }

    private static boolean search(HashMap<String, String> map, String sKey, String sValue) {
        Set keySet = map.keySet();
        Iterator iter = keySet.iterator();
        while (iter.hasNext()) {
            String key = (String) iter.next();
            String value = map.get(key);
            if (key.equals(sKey) && value.equals(sValue)) return true;
        }
        return false;
    }
}