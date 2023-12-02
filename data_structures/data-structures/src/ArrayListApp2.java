import java.util.ArrayList;

public class ArrayListApp2 {
    public static void main(String[] args) {
        Cat cat1 = new Cat("black");
        Cat cat2 = new Cat("white");
        Cat cat3 = new Cat("gray");
        ArrayList<Cat> catList = new ArrayList<>();
        catList.add(cat1);
        catList.add(cat1);
        catList.add(cat2);
        catList.add(cat3);
        Object[] array;
        array = catList.toArray();
        System.out.println(array[0]);

        System.out.println(array.length);

    }
}