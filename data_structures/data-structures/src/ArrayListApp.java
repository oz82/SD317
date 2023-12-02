import java.util.ArrayList;
public class ArrayListApp {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("TURKIYE");
        list1.add("ALMANYA");
        list1.add("RUSYA");
        list1.add("INGILTERE");
        list1.add("ABD");
        list1.add(1, "FRANSA");
        list1.remove(1);
        //printOneLine(list1);

        ArrayList<String> list2 = new ArrayList<>();
        list2.addAll(list1);
        //printOneLine(list2);

        Object[] array;
        array = list1.toArray();

        System.out.println(array[0]);
    }
    public static void printOneLine(ArrayList<String> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}
