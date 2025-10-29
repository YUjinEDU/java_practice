package week6;

public class Bookstore {

    String name;
    Book[] books = new Book[10];

    public Bookstore(String name) {
        this.name = name;
    }

    public void addBook(Book book){
        int ck = 0;
        for(int i=0;i<books.length;i++) {
            if(books[i]!=null) {
                ck++;
            }

            if(ck == books.length){
                System.out.println("입고 가능한 최대 수량을 초과했습니다.\n");
                break;
            }

        }

        for(int i=0;i<books.length;i++) {
            if(books[i]!=null) {
                continue;
            }
            books[i] = book;
            break;
        }

    }

    public void printInventory() {
        System.out.println("---- 입고된 책의 목록 ----");

        for(int i=0; i<this.books.length; i++) {
            if(this.books[i]==null) {
                continue;
            }
            this.books[i].printInfo();
        }
    }

    public void printTotalValue(){
        int sum = 0;
        for (int i=0; i<this.books.length; i++) {
            if(this.books[i]==null) {
                continue;
            }
            sum += books[i].price * books[i].quantity;
        }

        System.out.printf("총 입고 금액: %d \n", sum);
    }


}
