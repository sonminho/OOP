package creational.singleton;

public class Singleton {

    private static final Singleton instance = new Singleton(); // 하나의 인스턴스만 생성

    private Singleton() { } // 외부에서 생성할 수 없음

    public static Singleton getInstance() { // 클래스 메서드, 생성된 인스턴스 반환하는 역할
        return instance;
    }

}
