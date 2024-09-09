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
- 
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


