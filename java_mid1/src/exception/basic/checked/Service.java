package exception.basic.checked;

public class Service {//클라이언트가 사용하는 서비스
    Client client = new Client();
    /**
     * 예외를 잡아서 처리하는 코드
     * */
    public void callCatch(){
        try{
            client.call(); //예외가 발생할 경우
        } catch(MyCheckedException e){ //여기서 예외를 잡을 수 있음!
            //예외 처리 로직
            System.out.println("예외 처리, message" + e.getMessage());
        }
        System.out.println("정상 흐름");//정상흐름으로 변경되어서 이 코드가 정상적으로 출력됨.
    }
    /**
     * 체크 예외를 밖으로 던지는 코드
     * 체크 예외는 예외를 잡지 않고 밖으로 던지려면 throws 예외를 메서드에 필수로 선언해야 한다.
     ** */
    public void catchThrow() throws MyCheckedException{ //내가 해결 못할 경우에는 날 호출한 곳으로 에러 던져버림
        client.call();
    }
}
