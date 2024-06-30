package exception.ex1;


import java.util.Scanner;

public class MainV1 {
    public static void main(String[] args){
        NetworkServiceV1_3 networkServiceV0 = new NetworkServiceV1_3();

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
