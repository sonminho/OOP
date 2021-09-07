package behavioral.strategy;


public class Rental {

    private Member member;
    private Book book;
    private int rentCnt;
    private double rentPrice; // 대여료
    private PricePrincipal pricePrincipal; // 할인정책

    Rental(Member member, Book book, int rentCnt, PricePrincipal pricePrincipal) {
        this.member = member;
        this.book = book;
        this.rentCnt = rentCnt;
        this.pricePrincipal = pricePrincipal;
    }

    public void rent() {
        double price = pricePrincipal.calcPrice(book.getPrice(), rentCnt);
        member.addAmount(price); // 회원 누적금액 추가
        this.rentPrice = price;
    }

    public Member getMember() {
        return member;
    }

    public Book getBook() {
        return book;
    }

    public int getRentCnt() {
        return rentCnt;
    }

    public double getRentPrice() {
        return rentPrice;
    }

    public PricePrincipal getPricePrincipal() {
        return pricePrincipal;
    }
}
