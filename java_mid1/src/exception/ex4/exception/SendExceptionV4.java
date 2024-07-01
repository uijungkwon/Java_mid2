package exception.ex4.exception;

import exception.ex3.exception.NetworkClientExceptionV3;

public class SendExceptionV4 extends NetworkClientExceptionV4 {
    private final String sendData;
    public SendExceptionV4(String sendData, String message){
        super(message);
        this.sendData = sendData;
    }
    public String getSendData(){
        return sendData;
    }
}
