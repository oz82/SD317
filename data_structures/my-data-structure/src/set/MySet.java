package set;
import java.util.ArrayList;
import java.util.Iterator;

public class MySet<T> implements Iterable<T> {

    private ArrayList<T> elements;

    public MySet() {
        this.elements = new ArrayList<>();
    }

    public int size() {
        return elements.size();
    }

    public boolean isEmpty() {
        return elements.isEmpty();
    }

    public boolean contains(T element) {
        return elements.contains(element);
    }

    public void add(T element) {
        // bu metodu uygun sekilde yazin.
    }

    public void remove(T element) {
        elements.remove(element);
    }

    public void clear() {
        elements.clear();
    }

    @Override
    public Iterator<T> iterator() {
        return elements.iterator();
    }

    public MySet union(MySet set) {
        MySet result = new MySet();
        for (Object element : set.elements) {
            result.add(element);
        }
        for (Object element : this.elements) {
            result.add(element);
        }
        return result;
    }

    public MySet intersection(MySet set) {
        MySet result = new MySet();
        for (Object element : this.elements) {
            if (set.contains(element)) result.add(element);
        }
        return result;
    }

    public static void main(String[] args) {
        MySet<String> mySet = new MySet<>();
        mySet.add("Java");
        mySet.add("Python");
        mySet.add("Java");  // Aynı elemanı eklemeye çalıştık, ancak küme olduğu için eklenmeyecek

        System.out.println("MySet size: " + mySet.size());
        System.out.println("MySet contains 'Java': " + mySet.contains("Java"));

        System.out.println("Elements in MySet:");
        for (String element : mySet) {
            System.out.println(element);
        }

        mySet.remove("Python");
        System.out.println("After removing 'Python', MySet size: " + mySet.size());
    }
}
