import java.util.Arrays;
import java.util.List;

public class ArrayListApp3 {
    public static void main(String[] args) {
        Cat cat1 = new Cat("black");
        Cat cat2 = new Cat("white");
        Cat cat3 = new Cat("gray");
        Cat[] arrayCat = {cat1, cat2, cat3};


        List<Cat> catList = Arrays.asList(arrayCat);
    }
}