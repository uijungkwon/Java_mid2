package exception.ex1;

public class NetworkClientV1 {
    private final String address;
    public boolean connectError;
    public boolean sendError;
    public NetworkClientV1(String address){
        this.address = address;
    }
    
    public String connect(){
        if(connectError){
            System.out.println(address+"서버 연결 실패");
            return "connectError";
        }
        //연결 성공
        System.out.println(address + "서버 연결 성공");
        return "success";
    }
    
    public String send(String data){
        if(sendError){
            System.out.println(address+"서버에 데이터 전송 실패: " +data);
        }
        //전송 성공
        System.out.println(address + "서버에 데이터 전송: "+ data);
        return "success";
    }
    public void disconnect(){
        System.out.println(address + "서버 연결 해제");
    }
    public void initError(String data){ //일부로 예외 생성 //이 문자가 사용되었을 경우 오류라고 판단!
        if(data.contains("error1")){
            connectError = true;
        }
        if(data.contains("error2")){
            sendError = true;
        }
    }
    
}
