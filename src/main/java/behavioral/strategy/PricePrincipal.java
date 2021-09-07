package behavioral.strategy;

// 가격과 수량으로 합계금액을 산출 
public interface PricePrincipal {
    double calcPrice(double price, int cnt);
}
