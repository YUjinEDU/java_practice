package week6;

public class Main
{
    public static void main(String[] args) {
        Bookstore hanbat = new Bookstore("한밭 서점");
        Book book1 = new Book("이산수학", "김저자", 25000, 3);
        Book book2 = new Book("C언어", "이저자", 23000, 2);
        Book book3 = new Book("기계학습", "박저자", 33000, 4);
        Book book4 = new Book("자바", "최저자", 20000, 3);
        Book book5 = new Book("자바", "최저자", 20000, 3);
        Book book6 = new Book("자바", "최저자", 20000, 3);
        Book book7 = new Book("자바", "최저자", 20000, 3);
        Book book8 = new Book("자바", "최저자", 20000, 3);
        Book book9 = new Book("자바", "최저자", 20000, 3);
        Book book10 = new Book("자바", "최저자", 20000, 3);
        Book book11 = new Book("자바", "최저자", 20000, 3);

        hanbat.addBook(book1);
        hanbat.addBook(book2);
        hanbat.addBook(book3);
        hanbat.addBook(book4);
        hanbat.addBook(book5);
        hanbat.addBook(book6);
        hanbat.addBook(book7);
        hanbat.addBook(book8);
        hanbat.addBook(book9);
        hanbat.addBook(book10);
        hanbat.addBook(book11);


        hanbat.printInventory();
        hanbat.printTotalValue();

    }
}

