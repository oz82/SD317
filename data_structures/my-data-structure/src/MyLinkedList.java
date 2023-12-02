import java.util.ArrayList;

public class MyLinkedList {
    private Unit head;
    private Unit tail;

    public void create(ArrayList<String> list) {
        Unit[] units = new Unit[list.size()];
        for (int i = 0; i < list.size(); i++) {
            units[i] = new Unit(list.get(i));
        }
        for (int i = 0; i < list.size(); i++) {
            if (i > 0) {
                units[i - 1].setNext(units[i]);
            }
        }
        head = units[0];
        tail = units[units.length - 1];
    }
    public void print() {
        Unit pointer = head;
        while (1 == 1) {
            System.out.print(pointer.getValue() + "->");
            if (pointer.getNext() == null) break;
            pointer = pointer.getNext();
        }
        System.out.println();
    }
    public void add(String s) {
        Unit unit = new Unit(s);
        tail.setNext(unit);
        tail = unit;
    }
    public void add(Unit unit) {
        tail.setNext(unit);
        tail = unit;
    }
}