public class TestBook {
    public static void main(String[] args) {
        Book b1 = new Book(1,
                "Araba Sevdası",
                "Recaizade Mahmut Ekrem",
                "İş Bankası");
        Book b2 = new Book(2,
                "Suç ve Ceza",
                "Dostoyevski",
                "Can Yayınları");
        Book b3 = new Book(3,
                "Mobidick",
                "Harmen Melville",
                "Can Yayınları");
        Book b4 = new Book(1,
                "Araba Sevdası",
                "Recaizade Mahmut Ekrem",
                "kjjfkasf");
        System.out.println(b1);
        System.out.println(b1.equals(b2));
        System.out.println(b1.equals(b1));
        System.out.println(b1.equals(b4));
    }
}
