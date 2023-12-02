import java.util.ArrayList;

public class ArrayListApp4 {
    public static void main(String[] args) {
        Cat cat1 = new Cat("black");
        Cat cat2 = new Cat("black");
        Cat cat3 = new Cat("gray");
        ArrayList<Cat> catList = new ArrayList<>();
        //catList.add(cat1);
        catList.add(cat2);
        catList.add(cat3);

        boolean b1 = catList.contains(cat2);
        System.out.println(b1);

        System.out.println(catList.size());
    }
}