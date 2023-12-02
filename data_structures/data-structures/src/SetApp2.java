import java.util.ArrayList;
import java.util.HashSet;

public class SetApp2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("B");
        HashSet<String> set = new HashSet<>();
        set.addAll(list);
    }
}