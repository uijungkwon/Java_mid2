package lang.string;

public class StringConcatMain {
    public static void main(String[] args){
        String a =  "hello";
        String b = "java";

        String result = a.concat(b);
        String result2 = a+b;
        System.out.println(result); //새로운 String 객체 반환
        System.out.println(result2);
    }
}
