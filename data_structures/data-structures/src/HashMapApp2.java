import java.util.*;

public class HashMapApp2 {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> mapFreqTable = new LinkedHashMap<>();
        String example = "çiçek elma elma masa kalem kitap masa elma";
        String[] array = example.split(" ");
        for (String s : array) {
            Integer freq = mapFreqTable.get(s);
            if (freq == null) {
                freq = 0;
            }
            freq++;
            mapFreqTable.put(s, freq);
        }
        printMap(mapFreqTable);
    }

    private static void printMap(LinkedHashMap<String, Integer> map) {
        Set keySet = map.keySet();
        Iterator iter = keySet.iterator();
        while (iter.hasNext()) {
            String key = (String) iter.next();
            Integer value = map.get(key);
            System.out.println(key + "\t>>\t" + value);
        }
    }
}