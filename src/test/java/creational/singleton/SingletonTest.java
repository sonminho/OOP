package creational.singleton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SingletonTest {

    @Test
    public void create_singleton_instance() {
        // Singleton singletonInstance = new Singleton(); 인스턴스 생성시 컴파일오류
        Singleton singleton = Singleton.getInstance();

        //Assertions.assertNull(singleton);
        Assertions.assertNotNull(singleton);
    }
}
