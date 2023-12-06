package list;

import java.util.ArrayList;
import java.util.Iterator;

public class TestMyLinkedList {
    public static void main(String[] args) {
        ArrayList<String> aList = new ArrayList<>();
        aList.add("Mavi");
        aList.add("Yesil");
        aList.add("Beyaz");
        aList.add("Turuncu");
        MyLinkedList<String> myLinkedList1 = new MyLinkedList<>();
        myLinkedList1.addAll(aList);
        print(myLinkedList1);
        myLinkedList1.add("Mor");
        print(myLinkedList1);

        MyLinkedList<String> myLinkedList2 = new MyLinkedList<>();
        myLinkedList2.add("Izmir");
        myLinkedList2.add("Aydin");
        myLinkedList2.add("Sinop");
        myLinkedList2.add("Antalya");
        myLinkedList2.add("Mersin");
        print(myLinkedList2);
        myLinkedList2.merge(myLinkedList1);
        print(myLinkedList2);
    }

    public static void print(MyLinkedList<String> myLinkedList) {
        Iterator<String> iter = myLinkedList.iterator();
        while (iter.hasNext()) {
            Object value = iter.next();
            System.out.println(value);
        }
        System.out.println();
    }
}