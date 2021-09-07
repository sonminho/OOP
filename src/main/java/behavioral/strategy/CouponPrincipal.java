package behavioral.strategy;

public class CouponPrincipal implements PricePrincipal {
    private final int discountRate;

    CouponPrincipal(int discountRate) {
        this.discountRate = discountRate;
    }

    @Override
    public double calcPrice(double price, int cnt) {
        return price * cnt * (100-discountRate) / 100;
    }
}
