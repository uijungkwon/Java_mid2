package lang.string.builder;

public class LoopStringBuilderMain {
    public static void main(String[] args){
        long startTime = System.currentTimeMillis();
        StringBuilder result = new StringBuilder();
        for(int i = 0; i< 100000; i++){
            result.append("Hello Java"); // String 문자열 덧셈
        }
        long endTime =System.currentTimeMillis();
        String r = result.toString();
        System.out.println("result = "+ r);
        System.out.println("time = "+ (endTime - startTime));
    }
}
