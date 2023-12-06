package list;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class MyLinkedList<T> implements Iterable<T> {

    static class Node {
        private Object value;
        private Node next;

        public Node(Object value) {
            this.value = value;
        }

        public Object getValue() {
            return value;
        }

        public void setValue(Object value) {
            this.value = value;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }
    private Node head;
    private Node tail;
    private int size;

    public MyLinkedList() {
    }

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }

    public int size() {
        return size;
    }

    @Override
    public Iterator<T> iterator() {
        return new MyLinkedListIterator();
    }

    private class MyLinkedListIterator implements Iterator<T> {
        private Node current = head;

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            T value = (T) current.getValue();
            current = current.getNext();
            return value;
        }
    }

    public void add(T value) {
        Node node = new Node(value);
        if (head == null && tail == null) {
            head = tail = node;
        } else {
            tail.setNext(node);
            tail = node;
        }
        size++;
    }

    public void addAll(Collection<? extends T> c) {
        for (T element : c) {
            add(element);
        }
    }

    public void merge(MyLinkedList<T> list) {
        if (this.head == null) {
            this.head = list.head;
            this.tail = list.tail;
            size = list.size();
            return;
        }
        if (list == null || list.head == null) {
            return;
        }

        Node current = list.head;

        while (current != null) {
            this.add((T) current.getValue());
            current = current.getNext();
        }
    }
}