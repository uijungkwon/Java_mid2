package nested.test;

public class AnonymousMain {
    public static void main(String[] args){
        //여기에 Hello 의 익명 클래스를 생성하고 hello()를 호출해라
        Hello hello = new Hello() { //인터페이스 구현 했다고 가정
            @Override
            public void hello() {//추상 메서드 정의
                System.out.println("Hello.hello");
            }
        };
        hello.hello();
    }
}
