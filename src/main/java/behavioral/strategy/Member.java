package behavioral.strategy;


// 회원은 이름과 누적 대여금액을 갖는다.
// 회원은 하나의 책을 1권 이상 살 수 있다.
// 회원이 책을 살 때마다 누적 금액이 저장된다.
// 가격 정책에 따라 책 값이 할인되며 다른 가격 정책이 추가 될 수 있음 <= 전략패턴 활용
public class Member {

    private final String name;
    private double accPrice;

    Member(String name) {
        this.name = name;
        this.accPrice = 0;
    }

    public void addAmount(double price) {
        this.accPrice += price;
    }

    public String getName() {
        return this.name;
    }

    public double getAccPrice() {
        return this.accPrice;
    }

}
