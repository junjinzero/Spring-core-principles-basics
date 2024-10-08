## 3강 좋은 객체 지향 프로그래밍이란?
### 객체 지향 
1. 추상화
2. 캡슐화
3. 상속
4. 다형성

### 객체 지향 프로그래밍
- 컴퓨터 프로그램을 명령어의 목록으로 보는 시각에서 벗어나 여러 개의 독립된 단위. **객체들의 모임**으로 파악하고자 하는 것
- 각각의 객체는 메세지를 주고받고, 데이터를 처리 --> **협력**
- 프로그램을 **유연하고 변경이 용이**하게 한다.
  - **컴포넌트를 쉽고 유연하게 변경하면서 개발할 수 있는 방법** -> **다형성 Polymorphism**

### 다형성
- 역할과 구현으로 세상을 구분
- 역할 : 인터페이스 / 구현 : 인터페이스를 구현한 실체
  - 역할 : 자동차 / 구현 : k3, 아반떼, 테슬라 .......
    - -> **하나의 역할에 대해 여러가지 구현이 가능하다, 구현이 바뀌어도 역할은 유지된다. 구현이 바뀐다고 해도 역할에 영향을 주지 않는다.**
   
### 역할과 구현을 분리
- 역할과 구현으로 구분하면 세상이 단순해지고, 유연해지며, 변경도 편리해진다.
  - 클라이언트는 대상의 역할(인터페이스)만 알면 된다.
  - 클라이언트는 구현 대상의 내부 구조를 몰라도 된다.
  - 클라이언트는 구현 대상의 내부 구조가 변경되어도 영향을 받지 않는다.
  - 클라이언트는 구현 대상 자체를 변경해도 영향을 받지 않는다.
- 자바 언어의 다형성을 활용
  - 객체를 설계할 때 역할과 구현을 명확히 분리
  - 객체 설계 시 역할(인터페이스)을 먼저 부여하고, 그 역할을 수행하는 구현 객체 만들기
- **구현보다 인터페이스가 먼저! (역할이 더 중요하다)**

#### 다형성의 본질
  인터페이스를 구현한 객체 인스턴스를 실행 시점에 유연하게 변경할 수 있다.
  **협력**이라는 객체 사이의 관계를 중시해야 함.
  **클라이언트를 변경하지 않고, 서버의 구현 기능을 유연하게 변경할 수 있다.**

- 실세계의 역할과 구현이라는 편리한 컨셉을 다형성을 통해  객체 세상으로 가져올 수 있음.
- 유연하고, 변경이 용이
- 확장 가능한 설계
- 클라이언트에 영향을 주지 않는 변경 가능
- **인터페이스를 안정적으로 잘 설계하는 것이 중요**

### 스프링과 객체 지향
- 다형성!!
- 스프링은 다형성을 극대화해서 이용할 수 있게 도와준다.
- 제어의 역전(IoC), 의존관계 주입(DI)은 다형성을 활용해서 역할과 구현을 편리하게 다룰 수 있도록 지원한다.
- 스프링을 사용하면 레고 블럭 조립하듯이 -> 구현을 편리하게 변경할 수 있다.
