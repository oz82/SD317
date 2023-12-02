import java.util.*;

public class HashMapApp3 {
    public static void main(String[] args) {
        Student s1 = new Student("a", "BM");
        Student s2 = new Student("b", "EM");
        Student s3 = new Student("c", "BM");
        String id1 = "0001";
        String id2 = "0002";
        String id3 = "0003";
        TreeMap<String, Student> map = new TreeMap<>();
        map.put(id1,s1);
        map.put(id2,s2);
        map.put(id3,s3);
        printMap(map);
    }

    private static void printMap(Map<String, Student> map) {
        Set keySet = map.keySet();
        Iterator iter = keySet.iterator();
        while (iter.hasNext()) {
            Object key = iter.next();
            Object value = map.get(key);
            System.out.println(key + "\t>>\t" + value);
        }
    }
}