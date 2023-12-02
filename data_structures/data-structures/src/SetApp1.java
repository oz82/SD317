import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class SetApp1 {
    public static void main(String[] args) {
        HashSet set1 = new HashSet();
        set1.add("Ankara");
        set1.add("Istanbul");
        set1.add("Izmir");
        set1.add("ankara");
        //set1.remove("Istanbul");
        //set1.clear();
        printOneLine(set1);

    }

    public static void printOneLine(HashSet<String> set) {
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            String s = (String) iterator.next();
            System.out.print(s + " ");
        }
    }
}