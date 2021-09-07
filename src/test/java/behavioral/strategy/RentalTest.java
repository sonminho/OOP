package behavioral.strategy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RentalTest {
    private final int CUR_YEAR = 2021;
    private Member member1, member2;
    private Book book1, book2;

    @Test
    public void create_rental() {
        member1 = new Member("member1");
        member2 = new Member("member2");
        book1 = new Book("author1", 10000, 2019);
        book2 = new Book("author2", 10000, 2011);

        Rental rental = new Rental(member1, book1, 3,null);
        Assertions.assertNotNull(rental);
        Assertions.assertEquals(rental.getMember().getName(), "member1");
        Assertions.assertEquals(rental.getBook().getPublishYear(), 2019);
    }

    @Test
    public void coupon_discount_test() {
        member1 = new Member("member1");
        book1 = new Book("author1", 10000, 2019);
        book2 = new Book("author2", 10000, 2011);

        Assertions.assertEquals(member1.getName(), "member1");
        CouponPrincipal couponPrincipal = new CouponPrincipal(30); // 30퍼 할인
        CouponPrincipal couponPrincipal2 = new CouponPrincipal(20); // 20퍼 할인

        Rental rental = new Rental(member1, book1, 1, couponPrincipal);
        Rental rental2 = new Rental(member1, book1, 1, couponPrincipal2);

        rental.rent();
        rental2.rent();

        Assertions.assertEquals(rental.getRentPrice(), (double) 7000);
        Assertions.assertEquals(rental2.getRentPrice(), (double) 8000);
        Assertions.assertEquals(member1.getAccPrice(), rental.getRentPrice() + rental2.getRentPrice()); // 누적합계
    }

    @Test
    public void publish_year_discount_test() {
        member1 = new Member("member1");

        book1 = new Book("author1", 10000, 2019);
        PublishYearDiscount publishYearDiscount = new PublishYearDiscount(50, book1.getPublishYear());
        Rental rental = new Rental(member1, book1, 1, publishYearDiscount);
        rental.rent();
        Assertions.assertEquals(rental.getRentPrice(), (double) 10000); // 할인 적용 안됨

        book1 = new Book("author1", 10000, 2010);
        publishYearDiscount = new PublishYearDiscount(50, book1.getPublishYear());
        rental = new Rental(member1, book1, 1, publishYearDiscount);
        rental.rent();
        Assertions.assertEquals(rental.getRentPrice(), (double) 5000); // 할인 적용
    }
}