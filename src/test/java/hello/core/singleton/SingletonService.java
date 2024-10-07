package hello.core.singleton;

public class SingletonService {

    // 자기 자신을 내부에 private static final 로 선언
    // static 영역에 하나 생성함
    private static final SingletonService instance = new SingletonService();

    // 자기 자신을 인스턴스 객체로 생성해서 그걸 반환
    // 무조건 getInstance 를 통해서 해당 객체를 호출해야 함
    public static SingletonService getInstance() {
        return instance;
    }

    private SingletonService() {

    }

    public void logic() {
        System.out.println("싱글톤 객체 로직 호출");
    }

    // 클래스 외부에서 new 를 또 써버리면 private 영역을 벗어나기 때문에 에러남

}
