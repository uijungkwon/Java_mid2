package hello.core.singleton;

public class SingletonService {
    private static final SingletonService instance = new SingletonService();

    public static SingletonService getInstance(){
        return instance;
    }
    private SingletonService(){//private 선언으로 인해 외부에서 new키워드로 객체 인스턴스가 생성되는 것을 막는다!

    }
    public void logic(){
        System.out.println("싱글톤 객체 로직 호출");
    }
}
