package exception.ex1;


import java.util.Scanner;

public class MainV2 {
    public static void main(String[] args){
        NetworkServiceV1_2 networkService = new NetworkServiceV1_2();

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
