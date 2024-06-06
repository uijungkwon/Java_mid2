package lang.wrapper;

public class MyInteger {
    private final int value;//기본형은 항상 값이 필요하다.
    public MyInteger(int value){
        this.value = value;
    }
    public int getValue(){
        return value;
    }
    public  int compareTo(int target) {//자신의 값과 넘어온 값을 비교
        if (value < target) {
            return -1;
        }
        else if(value> target){
            return 1;
        }
        else return 0;
    }

    @Override
    public String toString() {
        return ""+value; //String.valueOf(value);
    }
}
