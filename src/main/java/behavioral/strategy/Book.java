package behavioral.strategy;

public class Book {
    private String author; // 저자
    private int price; // 가격
    private int publishYear; // 출판년도

    Book(String author, int price, int publishYear) {
        this.author = author;
        this.price = price;
        this.publishYear = publishYear;
    }

    public String getAuthor() {
        return author;
    }

    public int getPrice() {
        return price;
    }

    public int getPublishYear() {
        return publishYear;
    }
}
