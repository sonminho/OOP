package behavioral.strategy;

import java.time.LocalDate;

// 10년 이상된 책에 할인율을 적용해주는 제도
public class PublishYearDiscount  implements PricePrincipal {
    private int discountRate;
    private int publishYear;

    PublishYearDiscount(int discountRate, int publishYear) {
        this.discountRate = discountRate;
        this.publishYear = publishYear;
    }

    public void getDiscountRate() {
        LocalDate nowDateTime = LocalDate.now();
        int curYear = nowDateTime.getYear();

        discountRate = curYear - publishYear >= 10 ? discountRate : 0;
    }

    @Override
    public double calcPrice(double price, int cnt) {
        getDiscountRate();

        return price * cnt * (100-discountRate) / 100;
    }
}
