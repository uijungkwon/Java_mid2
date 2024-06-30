package exception.basic.checked;

public class CheckedThrowMain {
    public static void main(String[] args) throws MyCheckedException {
        Service service = new Service();
        service.catchThrow();
        System.out.println("정상 종료");//계속해서 예외가 밖으로 던져지기 때문에 이 코드는 정상적으로 출력되지 않는다.
    }
}
