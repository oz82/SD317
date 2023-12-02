import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public class Temp {
    public static void main(String[] args) {
        HashMap<String, Double> map1 = new HashMap<>();
        map1.put("Ankara", 5.7);
        map1.put("Istanbul", 15.4);
        map1.put("Izmir", 4.7);

        HashMap<String, Double> map2 = new HashMap<>();
        map2.put("Londra", 8.9);
        map2.put("Manchester", 2.1);
        map2.put("Birmingham", 1.1);

        HashMap<String, Double> map3 = new HashMap<>();
        map3.put("Berlin", 3.6);
        map3.put("Hamburg", 1.6);
        map3.put("Munih", 1.2);

        HashMap<String, HashMap<String, Double>> map = new HashMap<>();
        map.put("Turkiye", map1);
        map.put("Ingiltere", map2);
        map.put("Almanya", map3);

        printMap(map);
    }

    private static void printMap(HashMap<String, HashMap<String, Double>> map) {
        Set keySet1 = map.keySet();
        Iterator iter1 = keySet1.iterator();
        while (iter1.hasNext()) {
            String key1 = (String) iter1.next();
            HashMap<String, Double> value1 = map.get(key1);
            Set keySet2 = value1.keySet();
            Iterator iter2 = keySet2.iterator();
            while (iter2.hasNext()) {
                String key2 = (String) iter2.next();
                Double value2 = value1.get(key2);
                System.out.println(key1 + "\t" + key2 + "\t" + value2);
            }
        }
    }
}