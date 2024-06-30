package exception.ex2;
public class NetworkServiceV2_1 {
    public void sendMessage(String data) throws NetworkClientExceptionV2{
        String address = "http://example.com";
        NetworkClientV2 client = new NetworkClientV2(address);
        client.initError(data);//에러 초기화

        client.connect(); //예외 던지기
        client.send(data);
        client.disconnect();
    }
}
