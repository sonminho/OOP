## SOLID 원칙

객체지향 프로그래밍 5대 원칙으로 요구사항 변경이나 리팩토링시 유연하고 확장성있는 시스템 구조를 설계하기 위함



#### 단일책임원칙(SRP, Single Responsibility Principle)

   	-  클래스는 단 하나의 책임을 가져야 함





#### 개방폐쇄의 원칙(OCP, Open-Closed Principle)

- 객체의 확장에 열려있고 수정에는 닫혀있어야 함





#### 리스코프 치환 원칙(LSP, Liskov Substitution Principle)

- 부모 클래스 인스턴스를 자식 클래스 인스턴스로 대체해도 프로그램의 기능이 동일해야 함





#### 인터페이스 분리 원칙(ISP, Interface Segregation Principle)

- 클라이언트가 자신이 이용하지 않는 메서드에 의존하지 않아야 함





#### 의존관계 역전 원칙(DIP, Dependency Inversion Principle)

- 상위 모듈이 하위 모듈에 종속되지 않음
  - 상위 모듈의 변화되는 부분을 추상화 함
  - 하위 모듈을 추상화에 의존시킴
