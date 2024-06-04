package lang.string.builder;

public class LoopStringMain {
    public static void main(String[] args){
        long startTime = System.currentTimeMillis();
        String result = "";
        for(int i = 0; i< 100000; i++){
            result += "Hello Java"; // String 문자열 덧셈
        }
        long endTime =System.currentTimeMillis();

        System.out.println("result = "+ result);
        System.out.println("time = "+ (endTime - startTime));
    }
}
