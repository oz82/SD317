import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BookProcessor {
    List<Book> bookList = new ArrayList<>();

    public static void main(String[] args) {
        Book b1 = new Book(1, "Araba Sevdası", "Recaizade Mahmut Ekrem", "İş Bankası");
        Book b2 = new Book(2,"Suç ve Ceza","Dostoyevski","Can Yayınları");
        Book b3 = new Book(3,"Mobidick","Harmen Melville","Can Yayınları");
        BookProcessor bp = new BookProcessor();
        bp.addBook(b1);
        bp.addBook(b2);
        bp.addBook(b3);
        bp.printList();
        bp.sortBooks();
        bp.printList();
    }

    void addBook(Book b) {
        bookList.add(b);
    }

    void printList() {
        for (Book b : bookList) {
            System.out.println(b);
        }
    }

    void removeBook(int id) {
        for (Book b : bookList) {
            if (id == b.getBookID()) {
                bookList.remove(b);
                break;
            }
        }
    }

    void removeBook(Book b) {
        bookList.remove(b);
    }

    void sortBooks() {
        Collections.sort(bookList);
    }
}
