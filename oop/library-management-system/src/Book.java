public class Book implements Comparable {
    int bookID;
    String title;
    String author;
    int pageNum;
    String publisher;
    static int counter = 0;

    // constructor
    public Book(int bookID, String title, String author, String publisher) {
        this.bookID = bookID;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        counter++;
    }

    public int getBookID() {
        return bookID;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPageNum() {
        return pageNum;
    }

    public String getPublisher() {
        return publisher;
    }

    public static int getCounter() {
        return counter;
    }

    public void setBookID(int bookID) {
        this.bookID = bookID;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    @Override
    public String toString() {
        return this.title + "-" + this.author;
    }

    @Override
    public int compareTo(Object o) {
        // type casting
        Book outerBook = (Book) o;
        return this.getAuthor().compareTo(outerBook.getAuthor());
    }

    @Override
    public boolean equals(Object obj) {
        Book outerBook = (Book) obj;
        String outerAtt = outerBook.getTitle() + "/" + outerBook.getAuthor();
        String att = this.getTitle() + "/" + this.getAuthor();
        if (outerAtt.equals(att)) return true;
        else return false;
    }
}
