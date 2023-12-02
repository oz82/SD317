import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetApp1 {
    public static void main(String[] args) {
        TreeSet<String> set1 = new TreeSet<>();
        set1.add("Istanbul");
        set1.add("Ankara");
        set1.add("Izmir");
        printOneLine(set1);
    }

    public static void printOneLine(TreeSet<String> set) {
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            String s = (String) iterator.next();
            System.out.print(s + " ");
        }
    }
}