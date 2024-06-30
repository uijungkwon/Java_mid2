package exception.ex1;
public class NetworkServiceV1_2 {
    public void sendMessage(String data){
        String address = "http://example.com";
        NetworkClientV1 client = new NetworkClientV1(address);
        client.initError(data);//에러 초기화

        String connectResult = client. connect();
        if(isError(connectResult)){
            System.out.println("[네트워크 오류 발생] 오류 코드: "+ connectResult); //오류 로그 작성
            return;//연결에 실패할 경우 데이터를 전송하지 않고 바로 빠져나감
        }

        String sendResult = client.send(data);
        if(isError(sendResult)){
            System.out.println("[네트워크 오류 발생] 오류 코드: "+ sendResult);
            return;
        }

        client.disconnect();

    }
    private static boolean isError(String resultCode) {//따로 함수를 생성!
        return !resultCode.equals("success");//성공 여부를 판단한
    }
}
