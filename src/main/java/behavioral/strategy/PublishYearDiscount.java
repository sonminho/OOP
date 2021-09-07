package behavioral.strategy;

// 10년 이상된 책을 반값 할인해주는 제도
public class PublishYearDiscount  implements PricePrincipal {
    @Override
    public double calcPrice(double price, int cnt) {
        return price * cnt * 0.5;
    }
}
