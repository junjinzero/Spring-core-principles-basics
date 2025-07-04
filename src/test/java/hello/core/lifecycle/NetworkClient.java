package hello.core.lifecycle;


import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class NetworkClient {

    private String url;

    public NetworkClient() {
        System.out.println("생성자 호출, url = " + url);
    }

    public void setUrl(String url) {
        this.url = url;
    }

    // 서비스 시작 시 호출
    public void connect() {
        System.out.println("connect : " + url);
    }

    public void call(String message) {
        System.out.println("call : " + url + " message : " + message);
    }

    // 서비스 종료 시 호출
    public void disconnect() {
        System.out.println("close : " + url);
    }

    @PostConstruct
    public void init() {
        System.out.println("NetworkClient.init");
        // 프로퍼티 세팅이 끝나면 (의존관계 주입이 끝나면 호출해주겠다)
        connect();
        call("초기화 연결 메세지");
    }

    @PreDestroy
    public void close() {
        // bean 이 종료될 때 호출
        System.out.println("NetworkClient.close");
        disconnect();
    }
}
