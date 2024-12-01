# Spring-core-principles-basics
스프링 핵심 원리 기본편

## 1강 스프링의 탄생
- 2003년 스프링 출시 -> xml 로 설정
- 2014년 스프링 부트 출시  -> 설정이 쉬워짐 

## 2강 스프링이란? 
### 스프링 프레임워크
- 핵심 기술 : 스프링 DI 컨테이너, AOP, 이벤트 등
- 웹 기술 : 스프링 MVC, 스프링 WebFlux
- 데이터 접근 기술 : 트랜잭션, JDBC, ORM 지원, XML 지원
- 기술 통합 : 캐시, 이메일, 원격 접근, 스케줄링
- 테스트 : 스프링 기반 테스트 지원
- 언어 : 코틀린, 글뷔
- 최근에는 스프링부트를 통해서 스프링 프레임 워크의 기술들을 편리하게 사용

### 스프링 부트
- 스프링을 편리하게 사용할 수 있도로 지원. 최근에는 기본으로 사용
- 단독으로 실행할 수 있는 스프링 애플리케이션을 쉽게 새엉
- Tomcat 같은 웹 서버를 내장해서 별도의 웹 서버를 설치하지 않아도 됨
- 손쉬운 빌드 구성을 위한 starter 종속성 제공
- 스프링과 3rd parth(외부) 라이브러리 자동 구성
- 메트릭, 상태 확인, 외부 구성 같은 프로덕션 준비 기능 제공
- 관례에 의한 간결한 설정

**핵심 컨셉을 이해하고 공부해야 진정으로 스프링을 잘 활용할 수 있다**

### 스프링의 진짜 핵심
- 스프링은 자바 언어 기반의 프레임워크
  - 자바 언어의 가장 큰 특징 : 객체 지향 언어
- 스프링은 객체 지향 언어가 가진 강력한 특징을 살려내는 프레임워크
  - -> 좋은 객체 지향 애플리케이션을 개발할 수 있게 도와주는 프레임워크

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

## 4강 좋은 객체 지향 설계의 5가지 원칙 SOLID
### 단일 책임 원칙 SRP Single Responsibility Principle
- 한 클래스는 하나의 책임만 가져야 한다
- **중요한 기준은 변경이다** 변경이 있을 때 파급 효과가 적으면 단일 책임 원칙을 잘 따른 것
  
### 개방 폐쇄 원칙 OCP Open/Closed Principle
- 소프트웨어 요소는 확장에는 열려 있으나 변경에는 닫혀 있어야 한다.
- **다형성**을 활용해보자.
- 구현 객체를 변경하려면 클라이언트 코드를 변경해야 한다.
- -> 객체를 생성하고, 연관관계를 맺어주는 별도의 조립, 설정자가 필요하다.

### 리스코프 치환 원칙 LSP Liskov Substitution Principle
- 하위 클래스는 상위 타입 인터페이스의 규약을 다 지켜야 한다.

### 인터페이스 분리 원칙 ISP Interface Segregation Principle
- 특정 클라이언트를 위한 인터페이스 여러 개가 범용 인터페이스 하나보다 낫다
- 인터페이스가 명확해지고, 대체 가능성이 높아진다.

### 의존관계 역전의 원칙 DIP Dependency Inversion Principle
- 프로그래머는 **"추상화에 의존해야하지, 구체화에 의존하면 안된다."**
- 구현 클래스에 의존하지 말고, **인터페이스/역할에 의존하라는 뜻**
  - 의존한다 :: 내가(해당 클래스가) 저 클래스를 안다

> ### 정리
> - 객체 지향의 핵심은 다형성
> - 다형성만으로는 구현 객체를 변경할 때 클라이언트 코드도 함께 변경된다.
> - 다형성만으로는 OCP, DIP 를 지킬 수 없다. 

## 5강 객체 지향 설계와 스프링
### 스프링
- 스프링은 다형성 + OCP. DIP를 가능하게 지원
  - DI : 의존관계, 의존성 주입
  - DI 컨테이너 제공
- 클라이언트 코드의 변경 없이 기능 확장
- 쉽게 부품 교체하듯이 개발

### 정리
- 모든 설계에 역할과 구현을 분리
  - ex. 자동차 - k3, 아반떼, 제네시스...
- 역할(공연)을 먼저 만들어두고, 구현(배우)은 유연하게 변경할 수 있도록 만드는 것이 좋은 객체 지향 설계
  > 하지만 인터페이스를 도입하면 **추상화**라는 비용이 발생한다.
  > 기능을 확장할 가능성이 없다면, 구체 클래스를 직접 사용하고, 향후 꼭 필요할 때 리팩터링해서 인터페이스를 도입하는 것도 방법


---
## 6강 프로젝트 생성
- settings > gradle
- > build and run using / run test using 을 인텔리제이로 설정해준다 

## 7강 회원 도메인 개발
- DB 설정이 되지 않았기 때문에 우선 MemoryMemberRepository 를 사용하여 개발한다.
- 회원 등급을 나타내는 Grade enum
- service, repository 를 interface 로 생성한 뒤 상속받는 class 생성

## 8강 회원 도메인 실행과 테스트 
- 순수 java 로 테스트를 해볼 수도 있지만 (MemberApp.java) 
- jUnit 을 사용, 테스트 코드를 작성하여 테스트 하는게 좋다. 
> 회원 도메인 설계의 문제점  
-> 의존관계가 인터페이스 뿐만 아니라 구현까지 모두 의존하는 문제점이 있다. 

## 9강 주문과 할인 도메인 설계 
- 정확한 정책이 결정되지 않은 상태에서 개발을 해야하는 상황을 가정
  1. 주문 생성 : 클라이언트는 주문 서비스에 주문 생성을 요청
  2. 회원 조회 : 할인을 위해서 회원 등급 조회가 필요. -> 주문 서비스가 회원 저장소에서 회원을 조회한다.
  3. 할인 적용 : 주문 서비스는 회원 등급에 따른 할인 여부를 할인 정책에 위임한다.
  4. 주문 결과 반환 : 주문 서비스는 할인 결과를 포함한 주문 결과를 반환한다.
- 역할과 구현을 분리했기 때문에 **자유롭게 구현 객체를 조립** 할 수 있게 설계가 가능하다. 
  - -> 할인 정책을 유연하게 변경할 수 있다. 
> Service interface 에 대한 구현체가 하나 있는 경우 보통 **...ServiceImpl**이라고 명명한다.
- **역할들의 협력 관계를 그대로 재사용할 수 있다.**

## 10강 주문과 할인 도메인 개발
- OrderService : 주문 결과를 반환하는 인터페이스
- OrderServiceImpl :: 할인 정책이 변경되어도 discountPolicy 에서 변경된 정책을 적용해서 결과만 던져주고, 해당 구현체에서는 반환된 금액만 사용하면 됨
  - -> 단일 책임 원칙이 잘 구현된 형 (주문 구현체까지 고칠 필요가 없으므로)
- 주문 생성 요청이 오면, 회원 정보를 먼저 조회하고, 해당 멤버의 등급을 찾아 할인 정책을 적용한 결과 금액을 받아 온다.

## 11강 주문과 할인 도메인 실행과 테스트
- spring io 에서 맨첨에 만들어주는 스프링테스트는 더 오래걸림
- jUnit 으로 하는 단위테스트가 더 빠름
- jUnit 테스트 코드를 잘 짜는게 중요하다.


---

## 12강 새로운 할인 정책 개발
- 정액 할인 정책에서 정률 할인 정책으로 
- Assertions 는 static 으로 추가해주는게 좋음
- 테스트 코드 작성 시에는 항상 성공 케이스와 실패 케이스 모두 시험해봐야 함~~

## 13강 새로운 할인 정책 적용과 문제점
- 역할, 구현을 분리했지만 
- 추상(인터페이스) 뿐만 아니라 **구체(구현) 클래스**에도 의존하고 있다
  - 추상(인터페이스) 의존 : DiscountPolicy
  - 구체(구현) 클래스 : FixDiscountPolicy, RateDiscountPolicy
- 클라이언트인 OrderServiceImpl 이 DiscountPolicy, FixDiscountPolicy 모두 의존하고 있다. 
  - --> DIP 위반
  - --> 그래서 정책을 변경하게 되면 OrderServiceImpl 도 변경이 발생한다. --> OCP 위반 
- OrderServiceImpl 이 DiscountPolicy 추상(인터페이스) 에만 의존하도록 의존 관계를 변경한다.
- 값을 할당해주지 않기 때문에 NPE 가 발생한다. 
  - 클라이언트인 OrderServiceImpl에 DiscountPolicy의 구현 객체를 대신 생성하고 주입해줘야 한다.
- -> 누가? 어떻게? 

## 14강 관심사의 분리
- AppConfig : 애플리케이션의 전체 동작 방식을 구성(config)하기 위해 **구현 객체를 생성** 하고, **연결**하는 책임을 가지는 별도의 설정 클래스
- 생성자를 통해 memberRepository 에 들어갈 것을 결정하도록 함
  - 추후에 repository 의 수정이 일어나도 MemberServiceImpl 는 변경하지 않아도 됨
- Impl 들에서 interface 에만 의존 -> 구체 클래스를 의존하지 않음! --> **DIP 구현**
- AppConfig
  - 애플리케이션의 실제 동작에 필요한 **구현 객체를 생성**한다.
  - 생성한 객체 인스턴스의 참조(레퍼런스)를 **생성자를 통해서 주입(연결)** 해준다.
    - ```MemberServiceImpl``` -> ```MemoryMemberRepository```
    - ```OrderServiceImpl``` -> ```MemoryMemberRepository```, ```FixDiscountPolicy```
- 각 Impl (구현체) 들은 기능을 실행하는 책임만 지면 된다. 

## 15강 AppConfig 리팩터링
- 현재 AppConfig 는 **중복** 이 있고, **역할에 따른 구현** 이 명확하게 보이지 않는다.
- ```new MemoryMemberRepository()``` 부분의 중복을 제거함 -> ```MemoryMemberRepository```를 다른 구현체로 변경할 때 한 부분만 변경하면 된다.
- ```AppConfig```를 보면 역할과 구현 클래스가 한 눈에 들어와, 애플리케이션 전체 구성이 어떻게 되어 있는지 빠르게 파악할 수 있다.
- 
## 16강 새로운 구조와 할인 정책 적용
- 새로운 할인 정책으로 변경할 일이 있을 때, ```AppConfig```만 변경해주면 된다.
  - 사용 영역과 구성(Configuration) 영역이 분리됨.
- 클라이언트 코드인 ```OrderServiceImpl```을 포함하여 **사용 영역** 의 어떤 코드도 변경할 필요가 없다.

## 17강 전체 흐름 정리

## 18강 좋은 객체 지향 설계의 5가지 원칙의 적용
1. SRP 단일 책임 원칙
   "한 클래스는 하나의 책임만 가져야 한다."
- 클라이언트 객체는 직접 구현 객체를 생성하고, 연결하고, 실행하는 다양한 책임을 가지고 있음
- SRP 단일 책임 원칙을 따르면서 관심사를 분리함
- 구현 객체를 생성하고 연결하는 책임은 AppConfig가 담당
- 클라이언트 객체는 실행하는 책임만 담당

2. DIP 의존관계 역전 원칙
   "프로그래머는 추상화에 의존해야지, 구체화에 의존하면 안된다."
- 클라이언트 코드가 ```DiscountPolicoy``` 추상화 인터페이스에만 의존하도록 코드를 변경했다ㅏ.
- 하지만 클라이언트 코드는 인터페이스만으로는 아무것도 실행할 수 없다.
  - -> AppConfig가 ```FixDisountPolicy``` 객체 인스턴스 클라이언트 코드 대신 생성해서 클라이언트 코드에 의존관계를 주입

3. OCP 개방 폐쇄 원칙
   "소프트웨어 요소는 확장에는 열려 있으나 변경에는 닫혀 있어야 한다"
- 다형성을 사용하고 클라이언트가 DIP를 지킴
- 애플리케이션을 사용 영역과 구성 영역으로 나눔
- AppConfig가 의존관계를 ```FixDisountPolicy``` -> ```RateDiscountPolicoy``` 로 변경해서 클라이언트 코드에 주입하므로 클라이언트 코드는 변경하지 않아도 됨
- **소프트웨어 요소를 새롭게 확장해도 사용 영역의 변경은 닫혀 있다.**

## 19강 IoC, DI 그리고 컨테이너
### 제어의 역전 IoC(Inversion of Control)
- 기존 프로그램 : 클라이언트 구현 객체가 스스로 필요한 서버 구현 객체를 생성하고, 연결하고, 실행했다
  - -> 구현 객체가 프로그램의 제어 흐름을 스스로 조종했다.
- 반면, ```AppConfig```가 등장한 이후 구현 객체는 자신의 로직을 실행하는 역할만 담당한다.
  프로그램의 제어 흐름은 이제 AppConfig가 가져간다.
  - 예를 들어, ```OrderServiceImpl```은 필요한 인터페이스들을 호출하지만 어떤 구현 객체들이 실행될 지 모른다.
- 프로그램에 대한 모든 제어권은 ```AppConfig```가 가지고 있다.
- 이렇게 프로그램의 제어 흐름을 직접 제어하는 것이 아니라 외부에서 관리하는 것을 제어의 역전(IoC)라고 한다.

### 프레임워크 vs 라이브러리
- 프레임워크가 내가 작성한 코드를 제어하고, 대신 실행하면 -> 그것은 프레임워크가 맞다 (JUnit)
- 반면, 내가 작성한 코드가 직접 제어의 흐름을 담당한다면 -> 그것은 프레임워크가 아니라 라이브러리.

### 의존관계 주입 DI (Dependency Injection)
- ```OrderServiceImpl```은 ```DisountPolicy``` 인터페이스에만 의존한다.
  - 실제 어떤 구현 객체가 사용될지는 모른다.
  - **의존관계는 "정적인 클래스 의존 관계와, 실행 시점에 결정되는 동적인 객체(인스턴스) 의존 관계" 둘을 분리해서 생각해야 한다.**

**정적인 클래스 의존 관계**
- 클래스가 사용하는 import 코드만 보고 의존관계를 쉽게 판단할 수 있다. 
- 정적인 의존관계는 애플리케이션을 실행하지 않아도 분석할 수 있다.

**동적인 객체 인스턴스 의존관계**
- 애플리케이션 실행 시점에 실제 생성된 객체 인스턴스의 참조가 연결된 의존관계
- 애플리케이션 **실행 시점(런타임)** 에 외부에서 실제 구현 객체를 생성하고 클라이언트에 전달해서 클라이언트와 서버의 실제 의존관계가 연결 되는 것을 의존관계 주입이라 한다.
- 객체 인스턴스를 생성하고, 그 참조값을 전달해서 연결된다.
- 의존관계 주입을 사용하면 클라이언트 코드를 변경하지 않고, 클라이언트가 호출하는 대상의 타입 인스턴스를 변경할 수 있다.
- **의존 관계 주입을 사용하면 정적인 클래스 의존관계를 변경하지 않고, 동적인 객체 인스턴스 의존관계를 쉽게 변경할 수 있다.**

### IoC 컨테이너, DI 컨테이너
- ```AppConfig```처럼 객체를 생성하고 관리하면서 의존관계를 연결해주는 것
- 의존관계 주입에 초점을 맞춰서 최근에는 주로 **DI 컨테이너**라고 함
- 또는 어셈블러, 오브젝트 팩토리 등으로 불리기도 한다. 


## 20강 스프링으로 전환하기 
- ```@Configuration``` 설정 정보를 지정 
- ```@Bean``` 스프링 컨테이너에 등록되도록 지정 
- ```ApplicationContext```를 컨테이너라고 한다.
- 기존에는 개발자가 ```AppConfig``` 를 사용해서 직접 객체를 생성하고 DI를 했지만, 스프링 컨테이너를 통해서 주입할 수 있다.
- 스프링 컨테이너는 ```@Configuration```이 붙은  ```AppConfig```를 설정(구성) 정보로 사용한다. 여기서 ```@Bean```이라 적힌 메서드를 모두 호출해서 반환된 객체를 스프링 컨테이너에 등록한다.
  - 이렇게 스프링 컨테이너에 등록된 객체를 스프링 빈이라 한다. 
- 스프링 빈은 ```@Bean```이 붙은 메서드의 이름을 스프링 빈의 이름으로 사용하는 것이 관례 (```memberService```, ```orderService```)
- 이전에는 개발자가 필요한 객체를 ```AppConfig```를 사용해서 직접 조회했지만, 이제부터는 스프링 컨테이너를 통해서 필요한 스플이 빈(객체)를 찾는다. 
- 스프링 빈은 ```applicationContext.getBean()``` 메서드를 통해서 찾을 수 있다. 
- 기존에는 개발자가 직접 자바코드로 모든 것을 했다면 이제부터는 스프링 컨테이너에 객체를 스프링 빈으로 등록하고, 스프링 컨테이너에서 스프링 빈을 찾아서 사용하도록 변경되었다.
> 코드가 더 복잡해진 것 같은데, 스프링 컨테이너를 사용하면 어떤 장점이 있을까? 
> > 어마어마한 장점이 있답니다 

---

## 21강 스프링 컨테이너 생성
```java
ApplicationContext applicationContext
        = new AnnotationConfigApplicationContext(AppConfig.class);
```

### ```ApplicationContext``` 
  - 스프링 컨테이너
  - 인터페이스
- 스프링 컨테이너는 XML을 기반으로 만들 수 있고, 애노테이션 기반의 자바 설정 클래스로 만들 수 있다.
- 직전에 ```AppConfig```를 사용했던 방식이 애노테이션 기반의 자바 설정 클래스로 스프링 컨테이너를 만든 것이다.
- 자바 설정 클래스를 기반으로 스프링 컨테이너를 만들어보자 
  - ```new AnnotationConfigApplicationContext(AppConfig.class);```
  - 이 클래스는 ```ApplicationContext``` 인터페이스의 구현체이다. 

### 스프링 컨테이너의 생성 과정 
```new AnnotationConfigApplicationContext(AppConfig.class);```
- 스프링 컨테이너를 생성할 때는 구성 정보를 지정해주어야 한다.
  - -> ```AppConfig.class``` 를 구성 정보로 지정했다. 
- 스프링 컨테이너는 파라미터로 넘어온 설정 클래스 정보를 사용해서 스프링 빈을 등록한다. ```@Bean```
> 빈 이름은 항상 다른 이름을 부여해야 한다. 중복 시 오류가 발생함 
- 스프링 컨테이너는 설정 정보를 참고해서 의존관계를 주입한다. (DI)

> 스프링은 빈을 생성하고, 의존관계를 주입하는 단계가 나누어져 있다. 그런데 이렇게 자바 코드로 스프링 빈을 등록하면 
> 생성자를 호출하면서 의존관계 주입도 한 번에 처리된다. 여기서는 이해를 돕기 위해 개념적으로 나누어 설명했다.

## 22강 컨테이너에 등록된 모든 빈 조회
- 스프링이 내부적으로 관리하기 위한 빈들이 있고, 우리가 등록한 빈이 있음
```
ROLE_APPLICATION    : 직접 등록한 애플리케이션 빈
ROLE_INFRASTRUCTURE : 스프링이 내부에서 사용한 빈
```

## 23강 스프링 빈 조회 - 기본 
- 역할과 구현. 구현에 의존하지 말고 역할에 의존해야함.
- Impl 구체클래스로 조회도 가능하지만 권장하지는 않는 이유 
```
assertThrows(NoSuchBeanDefinitionException.class,
          () -> ac.getBean("xxxxx", MemberService.class));
```
- ```assertThrows``` 는 에러가 터져야 테스트가 성공한거 

## 24강 스프링 빈 조회 - 동일한 타입이 둘 이상
- 타입으로 조회 시 같은 타입의 스프링 빈이 둘 이상이면 오류가 발생한다.
  - -> 이 때는 빈 이름을 지정하자.
- ```ac.getBeansOfType()```을 사용하면 해당 타입의 모든 빈을 조회할 수 있다.
- class 안에 static class 를 만들었다 -> 해당 클래스 안에서만 이 static 클래스를 사용하겠다

## 25강 스프링 빈 조회 - 상속관계
- 부모 타입으로 조회하면, 자식 타입도 함께 조회한다.
- 그래서 모든 자바 객체의 최고 부모인 ```object```타입으로 조회하면, 모든 스프링 빈을 조회한다. 

## 26강 BeanFactory와 ApplicationContext
### ```BeanFactory```
- 스프링 컨테이너의 최상위 인터페이스
- 스프링 빈을 관리하고 조회하는 역할을 담당
- ```getBean()```을 제공한다.
- 지금까지 우리가 사용했던 대부분의 기능은 BeanFactory 가 제공하는 기능이다.

### ```ApplicationContext```
- BeanFactory 기능을 모두 상속받아서 제공한다.
- 빈을 관리하고 검색하는 기능을 BeanFactory가 제공해주는데, 둘의 차이는 ?
  - -> 애플리케이션을 개발할 때는 빈은 관리/조회하는 기능은 물론이고, 수많은 부가 기능이 필요하다.

**ApplicationContext 가 제공하는 부가기능**
- 메시지 소스를 활용한 국제화 기능
  - 예를 들어, 한국에서 들어오면 한국어로, 영어권에서 들어오면 영어로 출력
- 환경변수
  - 로컬, 개발, 운영 등을 구분해서 처리
- 애플리케이션 이벤트
  - 이벤트를 발행하고 구독하는 모델을 편리하게 지원
- 편리한 리소스 조회
  - 파일, 클래스 패스, 외부 등에서 리소스를 편리하게 조회

> **정리** <br>
> - ApplicationContext는 BeanFactory의 기능을 상속받는다  <br>
> - ApplicationContext는 빈 관리 기능 + 편리한 부가 기능을 제공한다 <br>
> - BeanFactory를 직접 사용할 일은 거의 없다. 부가 기능이 포함된 ApplicationContext를 사용한다. <br>
> - BeanFactory나  ApplicationContext를 **스프링 컨테이너** 라고 한다.

## 27강 다양한 설정 형식 지원 - 자바 코드, XML
- 스프링 컨테이너는 다양한 형식의 설정 정보를 받아들일 수 있도록 유연하게 설계되어 있다.
  - 자바 코드, XML, Groovy 등등

### 애노테이션 기반 자바 코드 설정 사용
- 지금까지 설정 했던 것들~ 
- ```new AnnotationConfigApplicationContext(AppConfig.class)```
- ``AnnotationConfigApplicationContext`` 클래스를 사용하면서 자바 코드로 된 설정 정보를 넘기면 된다. 

### XML 설정 사용
- 최근에는 스프링 부트를 많이 사용하면서 XML 기반의 설정은 잘 사용하지 않는다. 아직 많은 레거시 프로젝트들이 XML로 되어 있고, XML을 사용하면 컴파일 없이 빈 설정 정보를 변경할 수 있는 장점도 있음
- ```GenericXmlApplicationContext```를 사용하면서 ```xml``` 설정 파일을 넘기면 된다.
- xml 기반의 ```appConfig.xml``` 스프링 설정 정보와 자바 코드로 된 ```AppConfig.java``` 설정 정보를 비교해보면 거의 비슷하다는 것을 알 수 있다.
- xml 기반으로 설정하는 것은 최근에는 잘 사용하지는 않는 기술. (근데 우리 회사에선 함 ㅎㅎ)

## 28강 스프링 빈 설정 메타 정보 - BeanDefinition
- 스프링은 어떻게 이런 다양한 설정 형식을 지원하는 것일까? -> 그 중심에는 ```BeanDifinition``` 이라는 추상화가 있다.
- 쉽게 이야기해서 **역할과 구현을 개념적으로 나눈 것**
  - XML을 읽어서 BeanDifinition을 만들면 된다.
  - 자바 코드를 읽어서 BeanDifinition을 만들면 된다.
  - 스프링 컨테이너는 자바 코드인지, XML 인지 몰라도 된다. 오직 BeanDifinition만 알면 된다.
- **```BeanDifinition```** 를 빈 설정 메타정보라고 한다.
  - ```@Bean```, ```<bean>``` 당 각각 하나씩 메타 정보가 생성된다.
- 스프링 컨테이너는 이 메타정보를 기반으로 스프링 빈을 생성한다. 

- ```AnnotationConfigApplicationContext``` 는 ```AnnotationBeanDefinitionReader``` 를 사용해서 ```Appconfig.class``` 읽고 ``BeanDefinition``을 생성한다. 
- ``GenericXmlApplicationContext``는 ``XmlBeanDefinitionReader`` 를 사용해서 ``appConfig.xml`` 설정 정보를 읽고 ``BeanDefinition`` 을 생성한다.
- 새로운 형식의 설정 정보가 추가되면, XXXBeanDefinitionReader를 만들어서 ``BeanDefinition`` 을 생성하면 된다.

### BeanDefinition 살펴보기 
**``BeanDefinition``**
- BeanClassName: 생성할 빈의 클래스 명(자바 설정 처럼 팩토리 역할의 빈을 사용하면 없음) factoryBeanName: 팩토리 역할의 빈을 사용할 경우 이름, 예) appConfig
- factoryMethodName: 빈을 생성할 팩토리 메서드 지정, 예) memberService
- Scope: 싱글톤(기본값)
- lazyInit: 스프링 컨테이너를 생성할 때 빈을 생성하는 것이 아니라, 실제 빈을 사용할 때 까지 최대한 생성을 지연 처리 하는지 여부
- InitMethodName: 빈을 생성하고, 의존관계를 적용한 뒤에 호출되는 초기화 메서드 명 DestroyMethodName: 빈의 생명주기가 끝나서 제거하기 직전에 호출되는 메서드 명
- Constructor arguments, Properties: 의존관계 주입에서 사용한다. (자바 설정 처럼 팩토리 역할의 빈을 사용 하면 없음)

> **정리**
> - BeanDefinition을 직접 생성해서 스프링 컨테이너에 등록할 수도 있다. 하지만 실무에서 BeanDefinition을 직접 정의하거나 사용할 일은 거의 없음!<br>
> - BeanDefinition에 대해서는 너무 깊이있게 이해하기 보다는, 스프링이 다양한 형태의 설정 정보를 BeanDefinition으로 추상화해서 사용하는 것 정도만 이해하면 된다.<br>
> - 가끔 스프링 코드나 스프링 관련 오픈 소스의 코드를 볼 때, BeanDefinition 이라는 것이 보일 때가 있다. 이 때, 이러한 매커니즘을 떠올리면 된다~ 

---

## 29강 웹 애플리케이션과 싱글톤 
- 스프링은 태생이 기업용 온라인 서비스 기술을 지원하기 위해 탄생
  - 웹 애플리케이션은 보통 여러 고객이 동시에 요청을 한다
- 스프링 없는 순수한 DI 컨테이너인 AppConfig 는 요청을 할 때마다 객체를 새로 생성한다.
  - -> 트래픽이 몰리면 초당 100개의 객체가 생성되고 소멸 -> 메모리 낭비가 심하다
  - **해당 객체가 딱 1개만 생성되고, 공유하도록 설계하는 것이 싱글톤 패턴**

## 30강 싱글톤 패턴 
- 클래스의 인스턴스가 딱 1개만 생성되는 것을 보장하는 디자인 패턴
  - -> 그래서 객체 인스턴스를 2개 이상 생성하지 못하도록 막아야 한다. 
  - private 생성자를 사용해서 외부에서 임의로 new 키워드를 사용하지 못하도록 막아야 한다.
1. static 영역에 객체 instance 를 하나 생성해서 올려둔다.
2. 이 객체 인스턴스가 필요하면 오직 ```getInstance()```메서드를 통해서만 조회할 수 있다. 이 메서드를 호출하면 항상 같은 인스턴스를 반환한다.
3. 딱 1개의 객체 인스턴스만 존재해야 하므로, 생성자를 private으로 막아서 혹시라도 외부에서 new 키워드로 객체 인스턴스가 생성되는 것을 막는다.

**스프링 컨테이너를 쓰면 기본적으로 스프링 컨테이너가 객체를 싱글톤으로 생성해준다.**

- 싱글톤 패턴을 적용하면 고객의 요청이 올 때마다 객체를 생성하는 것이 아니라, 이미 만들어진 객체를 공유해서 효율적으로 사용할 수 있다.
- 하지만 싱글톤 패턴은 다음과 같은 문제점들이 있다. 
> **싱글톤 패턴 문제점** <br>
> - 싱글톤 패턴을 구현하는 코드 자체가 많이 들어간다.<br>
> - 의존관계상 클라이언트가 구체 클래스에 의존한다. -> DIP를 위반한다. <br>
> - 클라이언트가 구체 클래스에 의존해서 OCP 원칙을 위반할 가능성이 높다. <br>
> - 테스트하기 어렵다.<br>
> - 내부 속성을 변경하거나 초기화 하기 어렵다.<br>
> - private 생성자로 자식 클래스를 만들기 어렵다.<br>
> - 결론적으로 유연성이 떨어진다.<br>
> - 안티패턴으로 불리기도 한다.<br>

## 31강 싱글톤 컨테이너
- 스프링 컨테이너는 싱글턴 패턴을 적용하지 않아도 객체 인스턴스를 싱글톤으로 관리한다.
  - 스프링 컨테이너가 빈 객체를 미리 생성해서 관리해준다
- 스프링 컨테이너는 싱글톤 컨테이너 역할을 한다. 이렇게 싱글톤 객체를 생성하고 관리하는 기능을 싱글톤 레지스트리라고 한다.
- 스프링 컨테이너의 이런 기능 덕분에 싱글턴 패턴의 모든 단점을 해결하면서 객체를 싱글톤으로 유지할 수 있다.
  > - 싱글톤 패턴을 위한 지저분한 코드가 들어가지 않아도 된다. <br>
  > - DIP, OCP, 테스트, private 생성자로부터 자유롭게 싱글톤을 사용할 수 있다.

**스프링 컨테이너 덕분에 고객의 요청이 올 때마다 객체를 생성하는 것이 아니라, 이미 만들어진 객체를 공유해서 효율적으로 재사용 할 수 있다.**

## 32강 싱글톤 방식의 주의점 
- 싱글톤 패턴이든, 스프링 같은 싱글톤 컨테이너를 사용하든, 객체 인스턴스를 하나만 생성해서 공유하는 싱글톤 방식은 여러 클라이언트가 하나의 같은 객체 인스턴스를 공유하기 때문에
  - **싱글톤 객체는 상태를 유지(stateful)하게 설계하면 안된다.**
> 무상태(stateless)로 설계해야 한다. 
> - 특정 클라이언트에 의존적인 필드가 있으면 안된다.
> - 특정 클라이언트가 값을 변경할 수 있는 필드가 있으면 안된다
> - 가급적 읽기만 가능해야 한다.
> - 필드 대신에 자바에서 공유되지 않는 지역변수, 파라미터, ThreadLocal 등을 사용해야 한다.

**스프링 빈의 필드에 공유 값을 설정하면 큰 장애가 발생할 수 있음** 

> - 최대한 단순히 설명하기 위해, 실제 쓰레드는 사용하지 않았다.
> - ThreadA가 사용자A 코드를 호출하고 ThreadB가 사용자B 코드를 호출한다 가정하자.
> - `StatefulService` 의 `price` 필드는 공유되는 필드인데, 특정 클라이언트가 값을 변경한다.
> - 사용자A의 주문금액은 10000원이 되어야 하는데, 20000원이라는 결과가 나왔다.
> - 실무에서 이런 경우를 종종 보는데, 이로인해 정말 해결하기 어려운 큰 문제들이 터진다.(몇년에 한번씩 꼭 만난 다.)
> - 진짜 공유필드는 조심해야 한다! 스프링 빈은 항상 무상태(stateless)로 설계하자.

## 33강 @Configuration과 싱글톤
- memberService 빈을 만드는 코드를 보면 `memberRepository()` 를 호출한다. 
  - 이 메서드를 호출하면 `new MemoryMemberRepository()` 를 호출한다.
- orderService 빈을 만드는 코드도 동일하게 `memberRepository()` 를 호출한다. 
  - 이 메서드를 호출하면 `new MemoryMemberRepository()` 를 호출한다. 

결과적으로 각각 다른 2개의 `MemoryMemberRepository` 가 생성되면서 싱글톤이 깨지는 것 처럼 보인다. 
스프링 컨테이너는 이 문제를 어떻게 해결할까?

[static 이 들어가는 경우 프로그램 시작과 동시에 띄우기 때문에 싱글톤이 보장되지 않음](https://www.inflearn.com/community/questions/1085291/static%EA%B4%80%EB%A0%A8-%EC%A7%88%EB%AC%B8%EB%93%9C%EB%A6%BD%EB%8B%88%EB%8B%A4)
```
스프링 프레임워크에서 @Bean 어노테이션이 붙은 메소드는 해당 빈의 생성 로직을 담고 있습니다. 스프링 컨테이너는 이러한 메소드를 호출하여 빈 인스턴스를 생성하고 관리합니다.

일반적인 경우에는 스프링 컨테이너가 @Bean 어노테이션이 붙은 메소드를 자동으로 싱글톤 범위로 관리하여, 해당 빈의 요청이 있을 때마다 이미 생성된 인스턴스를 반환해줍니다. 
즉, 메소드 호출을 통한 빈의 생성과 관리가 스프링 컨테이너 내부의 라이프사이클에 따라 이루어지게 됩니다.

반면, static 메소드는 클래스의 인스턴스가 생성되지 않아도 호출할 수 있는 메소드이며, 클래스 로더가 해당 클래스를 메모리에 로드할 때 메모리에 함께 배치됩니다. 
static 메소드는 특정 인스턴스에 속하지 않기 때문에 스프링 컨테이너가 빈을 관리하는 방식, 즉 인스턴스 레벨에서 처리하는 라이프사이클 관리, 의존성 주입 및 프록시 적용 등과 같은 과정을 거치기 어렵습니다.

그 결과, @Bean 어노테이션을 사용한 static 메소드는 스프링 컨테이너가 반환하는 빈 인스턴스에 대한 싱글톤 보장이 어려워지고, 스프링 컨테이너가 제공하는 기능들을 온전히 사용하지 못하게 됩니다. 
따라서, 일반적으로 @Bean 메소드는 non-static 메소드로 선언하여 스프링 컨테이너가 제어할 수 있게 하는 것이 좋습니다.
```

## 34강 @Configuration과 바이트코드 조작의 마법
- 스프링 컨테이너는 싱글톤 레지스트리다. 따라서 스프링빈이 싱글톤이 되도록 보장해주어야 한다.
  - 그런데 스프링이 자바 코드까지 관리하기는 어렵다. 자바 코드만 봤을 때, memberRepository 가 세번 호출되는 게 타당해 보인다.
- 그래서 스프링은 클래스의 바이트코드를 조작하는 라이브러리를 사용한다. 
  - 모든 비밀은 `@Configuration` 을 적용한 `AppConfig` 에 있다.

- 사실 `AnnotationConfigApplicationContext` 에 파라미터로 넘긴 값은 스프링 빈으로 등록된다. 그래서 `AppConfig` 도 스프링 빈이 된다.
`AppConfig` 스프링 빈을 조회해서 클래스 정보를 출력해보자.

```
bean = class hello.core.AppConfig$$SpringCGLIB$$0
```

- 순수한 클래스라면 다음과 같이 출력되어야 한다. `class hello.core.AppConfig`
- 그런데 예상과는 다르게 클래스 명에 xxxCGLIB가 붙으면서 상당히 복잡해진 것을 볼 수 있다. 
- 이것은 내가 만든 클래스가 아니라 스프링이 CGLIB라는 바이트코드 조작 라이브러리를 사용해서 AppConfig 클래스를 상속받은 임의의 다른 클래스를 만들고, 그 다른 클래스를 스프링 빈으로 등록한 것이다!
- @Bean이 붙은 메서드마다 이미 스프링 빈이 존재하면 존재하는 빈을 반환하고, 스프링 빈이 없으면 생성해서 스프링 빈으로 등록하고 반환하는 코드가 동적으로 만들어진다. 
  - -> 덕분에 싱글톤이 보장되는 것이다.

**참고**<br>
AppConfig@CGLIB는 AppConfig의 자식 타입이므로, AppConfig 타입으로 조회 할 수 있다.

> **정리**
> - @Bean만 사용해도 스프링 빈으로 등록되지만, 싱글톤을 보장하지 않는다.
> - `memberRepository()` 처럼 의존관계 주입이 필요해서 메서드를 직접 호출할 때 싱글톤을 보장하지 않는다.
> - 크게 고민할 것이 없다. 스프링 설정 정보는 항상 `@Configuration` 을 사용하자.
 
---

## 35강 컴포넌트 스캔과 의존관계 자동 주입
- 지금까지 스프링 빈을 등록할 때는 자바 코드의 @Bean이나 XML 의 <bean> 등을 통해서 설정 정보에 직접 등록할 스프링 빈을 나열했다. 
- 이렇게 일일이 등록해야 할 스프링 빈이 수십, 수백개가 되면 일도 많아지고 누락하는 상황이 생길 수도 있다.
- -> 그래서 스프링은 설정 정보가 없어도 자동으로 스프링 빈을 등록하는 **컴포넌트 스캔**이라는 기능을 제공한다.
- 의존관계도 자동으로 주입하는 ``@Autowired``라는 기능도 제공한다

### `@ComponentScan`
> **참고:** 컴포넌트 스캔을 사용하면 `@Configuration` 이 붙은 설정 정보도 자동으로 등록되기 때문에, AppConfig, TestConfig 등 앞서 만들어두었던 설정 정보도 함께 등록되고, 실행되어 버린다. 그래서
> `excludeFilters` 를 이용해서 설정정보는 컴포넌트 스캔 대상에서 제외했다. 보통 설정 정보를 컴포넌트 스캔 대상에서 제외하지는 않지만, 기존 예제 코드를 최대한 남기고 유지하기 위해서 이 방법을 선택했다.

- 컴포넌트 스캔은 이름 그대로 `@Component` 애노테이션이 붙은 클래스를 스캔해서 스프링 빈으로 등록한다. `@Component` 를 붙여주자.

> 참고: `@Configuration` 이 컴포넌트 스캔의 대상이 된 이유도 `@Configuration` 소스코드를 열어보면 `@Component` 애노테이션이 붙어있기 때문이다. <br>
> 이제 각 클래스가 컴포넌트 스캔의 대상이 되도록 `@Component` 애노테이션을 붙여주자.

- 생성자 위에 @Autowired
- `@Autowired` 를 사용하면 생성자에서 여러 의존관계도 한번에 주입받을 수 있다.

###  1. @ComponentScan
- `@ComponentScan` 은 `@Component` 가 붙은 모든 클래스를 스프링 빈으로 등록한다. 이때 스프링 빈의 기본 이름은 클래스명을 사용하되 맨 앞글자만 소문자를 사용한다.
  - **빈 이름 기본 전략:** MemberServiceImpl 클래스 memberServiceImpl
  - **빈 이름 직접 지정:** 만약 스프링 빈의 이름을 직접 지정하고 싶으면 `@Component("memberService2")` 이런식으로 이름을 부여하면 된다.
### 2. @Autowired 의존관계 자동 주입**
- 생성자에 `@Autowired` 를 지정하면, 스프링 컨테이너가 자동으로 해당 스프링 빈을 찾아서 주입한다. 
- 이때 기본 조회 전략은 타입이 같은 빈을 찾아서 주입한다. 
  - `getBean(MemberRepository.class)` 와 동일하다고 이해하면 된다.

## 36강 탐색 위치와 기본 스캔 대상 
모든 자바 클래스를 다 컴포넌트 스캔하면 시간이 오래 걸린다. 그래서 꼭 필요한 위치부터 탐색하도록 시작 위치를 지정할 수 있다.
```
 @ComponentScan(
         basePackages = "hello.core",
)
```
- `basePackages` : 탐색할 패키지의 시작 위치를 지정한다. 이 패키지를 포함해서 하위 패키지를 모두 탐색한다.
만약 지정하지 않으면 `@ComponentScan` 이 붙은 설정 정보 클래스의 패키지가 시작 위치가 된다.
- `basePackages = {"hello.core", "hello.service"} ` 이렇게 여러 시작 위치를 지정할 수도 있다.
- `basePackageClasses` : 지정한 클래스의 패키지를 탐색 시작 위치로 지정한다.

> **권장하는 방법**
> - 개인적으로 즐겨 사용하는 방법은 패키지 위치를 지정하지 않고, 설정 정보 클래스의 위치를 프로젝트 최상단에 두는 것 이다. 
> - 최근 스프링 부트도 이 방법을 기본으로 제공한다.

### 컴포넌트 스캔 기본 대상
컴포넌트 스캔은 `@Component` 뿐만 아니라 다음과 내용도 추가로 대상에 포함한다. 
- `@Component` : 컴포넌트 스캔에서 사용
- `@Controller` : 스프링 MVC 컨트롤러에서 사용
- `@Service` : 스프링 비즈니스 로직에서 사용
- `@Repository` : 스프링 데이터 접근 계층에서 사용 
- `@Configuration` : 스프링 설정 정보에서 사용

> 컴포넌트 스캔의 용도 뿐만 아니라 다음 애노테이션이 있으면 스프링은 부가 기능을 수행한다.
> - `@Controller` : 스프링 MVC 컨트롤러로 인식
> - `@Repository` : 스프링 데이터 접근 계층으로 인식하고, 데이터 계층의 예외를 스프링 예외로 변환해준다.
> - `@Configuration` : 앞서 보았듯이 스프링 설정 정보로 인식하고, 스프링 빈이 싱글톤을 유지하도록 추가 처리를 한다.
> - `@Service` : 사실 `@Service` 는 특별한 처리를 하지 않는다. 대신 개발자들이 핵심 비즈니스 로직이 여기에 있겠구나 라고 비즈니스 계층을 인식하는데 도움이 된다.


## 37강 필터 
- `includeFilters` : 컴포넌트 스캔 대상을 추가로 지정한다.
- `excludeFilters` : 컴포넌트 스캔에서 제외할 대상을 지정한다. 

### FilterType 옵션 
FilterType은 5가지 옵션이 있다.
- ANNOTATION: 기본값, 애노테이션을 인식해서 동작한다. ex) `org.example.SomeAnnotation`
- ASSIGNABLE_TYPE: 지정한 타입과 자식 타입을 인식해서 동작한다. ex) `org.example.SomeClass`
- ASPECTJ: AspectJ 패턴 사용 
  - ex) `org.example..*Service+`
- REGEX: 정규 표현식 
  - ex) `org\.example\.Default.*`
- CUSTOM: `TypeFilter` 이라는 인터페이스를 구현해서 처리 
  - ex) `org.example.MyTypeFilter`

## 38강 중복 등록과 충돌
1. 자동빈등록 vs 자동빈등록 
2. 수동빈등록 vs 자동빈등록
   
### 자동 빈 등록 vs 자동 빈 등록
- 컴포넌트 스캔에 의해 자동으로 스프링 빈이 등록되는데, 그 이름이 같은 경우 스프링은 오류를 발생시킨다.
  - `ConflictingBeanDefinitionException` 예외 발생

### 수동 빈 등록 vs 자동 빈 등록
- 자동 빈이 있는데 같은 이름으로 수동으로 빈을 등록한 경우, 수동 빈이 우선권을 가진다.
  - 수동 빈이 자동 빈을 오버라이딩 한다
```
 Overriding bean definition for bean 'memoryMemberRepository' with a different
 definition: replacing
```

> 하지만 위와 같은 경우에는 에러가 났을 때 해결하기가 매우 어려워서 스프링부트에서는 자체적으로 에러를 발생시켜서 실행되지 않도록 하고 있다. 
> ```
> Description:
> 
> The bean 'memoryMemberRepository', defined in class path resource [hello/core/AutoAppConfig.class], could not be registered. A bean with that name has already been defined in file [/Users/junjin/Desktop/study/core/out/production/classes/hello/core/member/MemoryMemberRepository.class] and overriding is disabled.
> 
> Action:
> 
> Consider renaming one of the beans or enabling overriding by setting spring.main.allow-bean-definition-overriding=true
> ```

---
## 39강 의존관계 주입 
1. 생성자 주입
2. 수정자 주업(setter 주입)
3. 필드 주입
4. 일반 메서드 주입 

### 1. 생성자 주입
이름 그대로 생성자를 통해서 의존관계를 주입받는 방법
- 생성자 호출 시점에 딱 1번만 호출되는 것이 보장된다.
- **불변, 필수** 의존관계에 활용 

### 2. 수정자 주입 (setter 주입)
setter 라 불리는 필드의 값을 변경하는 수정자 메서드를 통해서 의존관계를 주입하는 방식 
- **선택, 변경** 가능성이 있는 의존관계에 사용 
- 자바빈 프로퍼티 규약의 수정자 메서드 방식을 사용하는 방법이다.

### 3. 필드 주입 
이름 그대로 필드에 바로 주입하는 방법이다.
- 코드가 간결해서 많은 개발자들을 유혹하지만 외부에서 변경이 불가능해서 테스트 하기 힘들다는 치명적인 단점이 있다.
- DI 프레임워크가 없으면 아무것도 할 수 없다.
> *사용하지 말자!*
> - 애플리케이션의 실제 코드와 관계 없는 테스트 코드
> - 스프링 설정을 목적으로 하는 @Configuration 같은 곳에서만 특별한 용도로 사용

### 4. 일반 메소드 주입 
일반 메서드를 통해 주입하는 방법
- 한번에 여러 필드를 주입 받을 수 있다.
- 일반적으로 잘 사용하지 않는다. 
> 참고: 어쩌면 당연한 이야기이지만 의존관계 자동 주입은 스프링 컨테이너가 관리하는 스프링 빈이어야 동작한다. <br>
> 스프링 빈이 아닌 `Member` 같은 클래스에서 `@Autowired` 코드를 적용해도 아무 기능도 동작하지 않는다.

## 40강 옵션 처리 
주입할 스프링 빈이 없어도 동작해야 할 때가 있다.
- 그런데 `@Autowired` 만 사용하면 `required` 옵션의 기본값이 `true` 로 되어 있어서 자동 주입 대상이 없으면 오류가 발생한다.
- 자동 주입 대상을 옵션으로 처리하는 방법은 다음과 같다.
  - `@Autowired(required=false)` : 자동 주입할 대상이 없으면 수정자 메서드 자체가 호출 안됨 
  - `org.springframework.lang.@Nullable` : 자동 주입할 대상이 없으면 null이 입력된다. 
  - `Optional<>` : 자동 주입할 대상이 없으면 `Optional.empty` 가 입력된다.

**Member는 스프링 빈이 아니다.**
- `setNoBean1()` 은 `@Autowired(required=false)` 이므로 호출 자체가 안된다.

**출력결과** 
```
setNoBean2 = null
setNoBean3 = Optional.empty
```
> 참고: @Nullable, Optional은 스프링 전반에 걸쳐서 지원된다. 예를 들어서 생성자 자동 주입에서 특정 필드에 만 사용해도 된다.

## 41강 생성자 주입을 선택해라! 
과거에는 수정자 주입과 필드 주입을 많이 사용했지만, 최근에는 스프링을 포함한 DI 프레임워크 대부분이 생성자 주입을 권장한다. 그 이유는 다음과 같다.

### 불변
- 대부분의 의존관계 주입은 한 번 일어나면 애플리케이션 종료 시점까지 의존 관계를 변경할 일이 없다.
  - 오히려 의존관계는 애플리케이션 종료 전까지 변하면 안된다(불변해야 한다)
- 수정자 주입을 사용하면, setXxx 메서드를 public 으로 열어두어야 한다
- 누군가 실수로 변경할 수도 있고, 변경하면 안되는 메서드를 열어두는 것은 좋은 설계방법이 아니다.
- 생성자 주입은 객체를 생성할 때 딱 1번만 호출되므로 이후에 호출되는 일이 없다. 따라서 불변하게 설계할 수 있다.

### 누락
- 프레임워크 없이 순수한 자바 코드를 단위 테스트 하는 경우, 수정자 의존관계인 경우 문제점들..
> **참고:** 
> - 수정자 주입을 포함한 나머지 주입 방식은 모두 생성자 이후에 호출되므로, 필드에 `final` 키워드를 사용 할 수 없다. 오직 생성자 주입 방식만 `final` 키워드를 사용할 수 있다.
  
- 생성자 주입 방식을 선택하는 이유는 여러가지가 있지만, 프레임워크에 의존하지 않고, 순수한 자바 언어의 특징을 잘 살리는 방법이기도 하다. 
- 기본으로 생성자 주입을 사용하고, 필수 값이 아닌 경우에는 수정자 주입 방식을 옵션으로 부여하면 된다. 생성자 주입과 수정자 주입을 동시에 사용할 수 있다. 
- 항상 생성자 주입을 선택해라! 그리고 가끔 옵션이 필요하면 수정자 주입을 선택해라. **필드 주입은 사용하지 않는 게 좋다.**

## 42강 롬복과 최신 트렌드
막상 개발을 해보면, 대부분이 다 불변이고, 생성자에 final 키워드를 사용하게 됨 <br>
--> 필드 주입처럼 편리하게 사용하는 방법은 없을까?

- 롬복 라이브러리가 제공하는 `@RequiredArgsConstructor` 기능을 사용하면 final이 붙은 필드를 모아서 생 성자를 자동으로 만들어준다.
- 롬복이 자바의 애노테이션 프로세서라는 기능을 이용해서 컴파일 시점에 생성자 코드를 자동으로 생성해준다. 실제 `class` 를 열어보면 생성자 추가하는 코드가 추가되어 있는 것을 확인할 수 있다.

> 최근에는 생성자를 딱 1개 두고, `@Autowired` 를 생략하는 방법을 주로 사용한다. <br>
> 여기에 Lombok 라이브러리의`@RequiredArgsConstructor` 함께 사용하면 기능은 다 제공하면서, 코드는 깔끔하게 사용할 수 있다


## 43강 조회 빈이 2개 이상인 문제 
- `@Autowired`는 타입(Type)으로 조회한다.
- 타입으로 조회하기 때문에, 마치 다음 코드와 유사하게 동작한다. (실제로는 더 많은 기능을 제공한다.) 
  - `ac.getBean(DiscountPolicy.class)`
- 스프링 빈 조회에서 학습했듯이 타입으로 조회하면 선택된 빈이 2개 이상일 때 문제가 발생한다.
- 하위 타입으로 지정할 수 도 있지만, 하위 타입으로 지정하는 것은 DIP를 위배하고 유연성이 떨어진다. 
- 그리고 이름만 다르고, 완전히 똑같은 타입의 스프링 빈이 2개 있을 때 해결이 안된다. 
- 스프링 빈을 수동 등록해서 문제를 해결해도 되지만, 의존 관계 자동 주입에서 해결하는 여러 방법이 있다.

## 44강 @Autowired 필드 명, @Qualifier, @Primary
조회 대상 빈이 2개 이상일 때 해결 방법
- @Autowired 필드 명 매칭
- @Qualifier -> @Qualifier끼리 매칭 -> 빈 이름 매칭
- @Primary 사용

### @Autowired 필드명 매칭
- `@Autowired` 는 타입 매칭을 시도하고, 이때 여러 빈이 있으면 필드 이름, 파라미터 이름으로 빈 이름을 추가 매칭한다.
- **필드 명 매칭은 먼저 타입 매칭을 시도 하고 그 결과에 여러 빈이 있을 때 추가로 동작하는 기능이다.**

**@Autowired 매칭 정리** 
1. 타입 매칭
2. 타입 매칭의 결과가 2개 이상일 때 필드명, 파라미터명으로 빈이름 매칭

### @Qualifier 사용
- `@Qualifier` 는 추가 구분자를 붙여주는 방법이다. 주입시 추가적인 방법을 제공하는 것이지 빈 이름을 변경하는 것은 아니다.

**@Qualifier 정리**
1. @Qualifier끼리 매칭
2. 빈이름매칭
3. `NoSuchBeanDefinitionException` 예외 발생

### @Primary 사용
- `@Primary` 는 우선순위를 정하는 방법이다. 
- @Autowired 시에 여러 빈이 매칭되면 `@Primary` 가 우선권을 가진다.
- `@Qualifier` 는 주입 받을 때 모든 코드에 `@Qualifier` 를 붙여주어야 하지만, `@Primary` 를 사용하면 `@Qualifier` 를 붙일 필요가 없다.

### @Primary, @Qualifier 활용
- 코드에서 자주 사용하는 메인 데이터베이스의 커넥션을 획득하는 스프링 빈이 있고, 코드에서 특별한 기능으로 가끔 사용하는 서브 데이터베이스의 커넥션을 획득하는 스프링 빈이 있다고 생각해보자. 
- 메인 데이터베이스의 커넥션을 획득하는 스프링 빈은 `@Primary` 를 적용해서 조회하는 곳에서 `@Qualifier` 지정 없이 편리하게 조회하고, 서브 데이터베 이스 커넥션 빈을 획득할 때는 `@Qualifier` 를 지정해서 명시적으로 획득 하는 방식으로 사용하면 코드를 깔끔하게 유지할 수 있다. 
- 물론 이때 메인 데이터베이스의 스프링 빈을 등록할 때 `@Qualifier` 를 지정해주는 것은 상관없다.

> **우선순위**
> - `@Primary` 는 기본값 처럼 동작하는 것이고, `@Qualifier` 는 매우 상세하게 동작한다. 
> - 이런 경우 어떤 것이 우선권을 가져갈까? 
> - 스프링은 자동보다는 수동이, 넒은 범위의 선택권 보다는 좁은 범위의 선택권이 우선 순위가 높다. 
> - **따라서 여기서도 `@Qualifier` 가 우선권이 높다.**

## 45강 애노테이션 직접 만들기 
`@Qualifier("mainDiscountPolicy")` 이렇게 문자를 적으면 컴파일시 타입 체크가 안된다. 다음과 같은 애노 테이션을 만들어서 문제를 해결할 수 있다.
- 애노테이션에는 상속이라는 개념이 없다. 
- 이렇게 여러 애노테이션을 모아서 사용하는 기능은 스프링이 지원해주는 기능 이다. 
- `@Qualifier` 뿐만 아니라 다른 애노테이션들도 함께 조합해서 사용할 수 있다. 
- 단적으로 `@Autowired` 도 재정의 할 수 있다. 
  - 물론 스프링이 제공하는 기능을 뚜렷한 목적 없이 무분별하게 재정의 하는 것은 유지보수에 더 혼란만 가중할 수 있다.

## 46강 조회한 빈이 모두 필요할 때, List, Map
의도적으로 정말 해당 타입의 스프링 빈이 다 필요한 경우도 있다.
- 예를 들어서 할인 서비스를 제공하는데, 클라이언트가 할인의 종류(rate, fix)를 선택할 수 있다고 가정해보자. 
- 스프링을 사용하면 소위 말하는 전략 패턴을 매우 간단하게 구현할 수 있다.
