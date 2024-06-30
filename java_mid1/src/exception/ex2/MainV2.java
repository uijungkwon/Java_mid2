package exception.ex2;

import java.util.Scanner;

public class MainV2 {
    public static void main(String[] args) throws NetworkClientExceptionV2{
        NetworkServiceV2_1 networkService = new NetworkServiceV2_1();

        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.print("전송할 문자:");
            String input = scanner.nextLine();//사용자 입력
            if(input.equals("exit")){
                break;
            }
            networkService.sendMessage(input);
        }
    }
}
