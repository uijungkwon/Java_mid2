package exception.ex2;
public class NetworkServiceV2_2 {
    public void sendMessage(String data) throws NetworkClientExceptionV2{
        String address = "http://example.com";
        NetworkClientV2 client = new NetworkClientV2(address);
        client.initError(data);//에러 초기화

        try {
            client.connect(); //예외 던지기
        } catch (NetworkClientExceptionV2 e) {
            System.out.println("[오류]코드: "+e.getErrorCode()+", 메세지: "+e.getMessage());
            return;
        }

        try {
            client.send(data);
        } catch (NetworkClientExceptionV2 e) {
            System.out.println("[오류]코드: "+ e.getErrorCode() + ", 메세지: "+ e.getMessage());
            return;
        }

        client.disconnect();
    }
}
