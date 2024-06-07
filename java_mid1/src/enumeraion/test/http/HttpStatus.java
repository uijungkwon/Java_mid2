package enumeraion.test.http;

public enum HttpStatus {
    OK(200,"OK"), BAD_REQUEST(400,"Bad Request"), NOT_FOUND(404, "Not Found"), INTERNAL_SERVER_ERROR(500, "Internal Server Error");

    private int code;
    private String message;

    HttpStatus(int code, String message){
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
    public static HttpStatus findByCode(int code){
        for(HttpStatus status: values()){//모든 enum 열거형 값들을 가져온다.
            if(status.getCode() == code)
                return status;
        }
        return null;
    }

    public Boolean isSuccess(){ //code가 200이상이면
        return code >= 200 && code <= 299; //true
    }
}
