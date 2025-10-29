package week6;

public class Book {

    String title;
    String author;
    int price;
    int quantity;

    public Book(String title, String author, int price, int quantity) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.quantity = quantity;

    }

    public void printInfo(){
        System.out.printf("제목: %s / ", title);
        System.out.printf("저자: %s / ", author);
        System.out.printf("가격: %d / ", price);
        System.out.printf("수량: %d \n", quantity);
    }





}
