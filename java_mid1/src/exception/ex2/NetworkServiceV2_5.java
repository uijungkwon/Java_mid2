package exception.ex2;
public class NetworkServiceV2_5 {//정상 흐름과 예외흐름 분리
    public void sendMessage(String data) throws NetworkClientExceptionV2{
        String address = "http://example.com";
        NetworkClientV2 client = new NetworkClientV2(address);
        client.initError(data);//에러 초기화

        try {//정상흐름
            client.connect();
            client.send(data);
        } catch (NetworkClientExceptionV2 e) {
            //예외흐름
            System.out.println("[오류]코드: "+e.getErrorCode()+", 메세지: "+e.getMessage());
        }
        finally {
            client.disconnect();
        }

    }
}
