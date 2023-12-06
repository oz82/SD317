package list;

import java.util.ArrayList;
import java.util.Iterator;

public class TestMyArrayList {
    public static void main(String[] args) {
        MyArrayList<String> myArrayList1 = new MyArrayList<>();
        myArrayList1.add("Java");
        myArrayList1.add("programlama");
        myArrayList1.add("dilini");
        myArrayList1.add("seviyorum");
        print(myArrayList1);

        System.out.println(myArrayList1.get(1));
        myArrayList1.set(0, "JAVA");
        print(myArrayList1);

        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        MyArrayList<String> myArrayList2 = new MyArrayList<>();
        myArrayList2.addAll(list);
        print(myArrayList2);
        myArrayList2.remove(1);
        print(myArrayList2);
        myArrayList2.remove("C");
        print(myArrayList2);

        System.out.println(myArrayList2.contains("A"));

        myArrayList2.clear();
        print(myArrayList2);
    }

    public static void print(MyArrayList<String> myArrayList) {
        if (myArrayList.isEmpty()) {
            System.out.println("The list is empty!");
            return;
        }
        for (String s : myArrayList) {
            System.out.println(s);
        }
        System.out.println();
    }
}