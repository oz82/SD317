import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;

public class ArrayListApp5 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("D");
        //traverse1(list);
        //traverse2(list);
        traverse3(list);
    }
    private static void traverse1(ArrayList<String> list) {
        for (String s : list) {
            System.out.println(s);
        }
    }
    private static void traverse2(ArrayList<String> list) {
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            String s = (String) iterator.next();
            System.out.println(s);
        }
    }
    private static void traverse3(ArrayList<String> list) {
        Enumeration e = Collections.enumeration(list);
        while (e.hasMoreElements()) {
            String s = (String) e.nextElement();
            System.out.println(s);
        }
    }
}