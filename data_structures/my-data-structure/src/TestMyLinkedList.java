import java.util.ArrayList;

public class TestMyLinkedList {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        ArrayList<String> myList = new ArrayList<>();
        myList.add("r");
        myList.add("s");
        myList.add("p");
        myList.add("a");
        myLinkedList.create(myList);
        myLinkedList.print();
    }
}