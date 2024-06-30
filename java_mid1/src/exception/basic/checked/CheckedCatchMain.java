package exception.basic.checked;

public class CheckedCatchMain {
    public static void main(String[] args){
        Service service = new Service();//서비스
        service.callCatch();
        System.out.println("정상 종료");
    }
}
