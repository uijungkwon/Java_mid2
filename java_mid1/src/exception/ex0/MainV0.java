package exception.ex0;

import java.util.Scanner;

public class MainV0 {
    public static void main(String[] args){
        NetworkServiceV0 networkServiceV0 = new NetworkServiceV0();

        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.print("전송할 문자:");
            String input = scanner.nextLine();//사용자 입력
            if(input.equals("exit")){
                break;
            }
            networkServiceV0.sendMessage(input);
        }
    }
}
